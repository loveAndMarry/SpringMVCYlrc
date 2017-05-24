package ylrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ylrc.model.*;
import ylrc.repository.*;
import net.sf.json.*;

import java.rmi.server.UID;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import ylrc.mail.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class MainController {

    // 自动装配数据库接口，不需要再写原始的Connection来操作数据库
    @Autowired
    userRepository userRepository;
    @Autowired
    userInfoRepository userInfoRepository;
    @Autowired
    friendListRepository friendListRepository;
    public String YZM = "";
    public int uId;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/registerCheck", method = RequestMethod.POST)
    public JSONObject register(@RequestBody JSONObject json) {
        String userEmail = json.getString("userEmail");
        String userPhone = json.getString("userPhone");
        String pwd = json.getString("passWord");
        String userYzm = json.getString("yzm");
        List<TbUseraccountEntity> userList = userRepository.findAll();
        for (int i = 0; i < userList.size(); i++) {
            TbUseraccountEntity u = userList.get(i);
            if (u.getUserEmail().equals(userEmail) || u.getUserPhone().equals(userPhone)) {
                json.put("result", "fail");
                return json;
            }
        }

        mailRegister mr = new mailRegister();
        //System.out.println(mailRegister.generateShortUuid());

        if (YZM.equals(userYzm)) {
            TbUseraccountEntity useraccountEntity = new TbUseraccountEntity();
            useraccountEntity.setUserPhone(userPhone);
            useraccountEntity.setUserEmail(userEmail);
            useraccountEntity.setUserPsd(pwd);
            userRepository.saveAndFlush(useraccountEntity);
            List<TbUseraccountEntity> list1 = userRepository.findAll();
            for (int i = 0; i < list1.size(); i++) {
                TbUseraccountEntity u1 = list1.get(i);
                if (u1.getUserEmail().equals(userEmail)) {
                    TbUserinformationEntity info1 = new TbUserinformationEntity();
                    info1.setUserId(u1.getUserId());
                    userInfoRepository.saveAndFlush(info1);
                }
            }

            json.put("result", "success");
        } else {
            json.put("result", "failYZM");
        }

        return json;
    }

    @RequestMapping(value = "/othersInfo", method = RequestMethod.GET)
    public String othersInfo(@RequestParam("sexwanted") String sexwanted, @RequestParam("locationwanted") String locationwanted, @RequestParam("jobwanted") String jobwanted, @RequestParam("hobbywanted") String hobbywanted, @RequestParam("salarywanted") String salarywanted, ModelMap modelMap) {
        List<TbUserinformationEntity> userList = null;

        System.out.println("满足" + sexwanted + locationwanted + jobwanted + hobbywanted + salarywanted);
        List<TbUserinformationEntity> userFinList = new ArrayList<>();

        if (salarywanted == "" || salarywanted == null) {
            System.out.println("执行1");
            userList = userInfoRepository.findByUserSexAndUserJobAndUserAddress(sexwanted, jobwanted, locationwanted);
        } else if (salarywanted != "" && salarywanted != null) {
            System.out.println("执行2");
            userList = userInfoRepository.findByUserSexAndUserJobAndUserAddressAndUserSalary(sexwanted, jobwanted, locationwanted, Integer.parseInt(salarywanted));
        }

        String[] hobbyLabel = {"", "读书", "绘画", "书法", "乐器", "篮球", "足球", "健身", "跑步", "户外活动", "美食", "旅游", "音乐", "饮茶", "影视剧", "戏剧", "文学", "哲学", "睡觉", "游戏", "美术"};

        String[] userJobs = {"", "工人", "教师", "记者", "艺人", "厨师", "医生", "军人", "律师", "会计", "经商", "作家", "导游", "画家", "警察", "公务员", "运动员", "科学家", "工程师", "翻译"};

        String[] sexoris = {"", "小于3000", "3000-5000", "5000-10000", "10000-50000", "大于50000"};

        for (int i = 0; i < userList.size(); i++) {

            String hobbys = userList.get(i).getUserHobby();
            String[] values2 = hobbys.split(",");
            List<String> list = Arrays.asList(values2);

            if (hobbywanted != "" && hobbywanted != null && list.contains(hobbywanted) == false) {
                System.out.println("爱好不为空，但不是用户想要的");
            } else {
//hobby的匹配与解析-------------------------------------------------------------------
                String finHobby = "";

                for (int j = 1; j < 21; j++) {
                    if (list.contains(Integer.toString(j))) {
                        finHobby = finHobby + "【" + hobbyLabel[j] + "】";
                    }
                }
                userList.get(i).setUserHobby(finHobby);
//----------------------------------------------------------------------------------
//职业的解析----------------------------------------------------------------------------------------
                String userJob = userList.get(i).getUserJob();
                for (int j = 1; j < 20; j++) {
                    if (Integer.parseInt(userJob) == j) {
                        userList.get(i).setUserJob(userJobs[j]);
                    }
                }
//-----------------------------------------------------------------------------------------------------
//薪资的解析----------------------------------------------------------------------------------------
                int salary = userList.get(i).getUserSalary();
                for (int j = 1; j < 6; j++) {
                    if (salary == j) {
                        userList.get(i).setUserTrusName(sexoris[j]);//为了方便将真名暂时作为薪资
                    }
                }
//-----------------------------------------------------------------------------------------------------

                userFinList.add(userList.get(i));
            }
        }


        System.out.println(userFinList.size() + "*************************************");
        if (userFinList.size() == 0) {
            String note = "未找到满足条件的用户，请您重新匹配！";
            modelMap.addAttribute("note", note);
        } else {
            for (int i = 0; i < userFinList.size(); i++) {
                if (userFinList.get(i).getUserImg() == "" || userFinList.get(i).getUserImg() == null) {
                    if (userFinList.get(i).getUserSex().equals("男")) {
                        userFinList.get(i).setUserImg("images/1.jpg");
                    } else {
                        userFinList.get(i).setUserImg("images/a6.jpg");
                    }
                }
            }
            modelMap.addAttribute("userList", userFinList);
        }


        return "findMatches";
    }

    @RequestMapping(value = "/personal{id}", method = RequestMethod.GET)
    public String showUser(@PathVariable("id") Integer userId, ModelMap modelMap) {

        // 找到userId所表示的用户
        TbUserinformationEntity usersEntity = userInfoRepository.findOne(userId);
//hobby的解析----------------------------------------------------------------------------------------
        String hobby = usersEntity.getUserHobby();

        String[] hobbys = {"", "读书", "绘画", "书法", "乐器", "篮球", "足球", "健身", "跑步", "户外活动", "美食", "旅游", "音乐", "饮茶", "影视剧", "戏剧", "文学", "哲学", "睡觉", "游戏", "美术"};

        String[] values = hobby.split(",");
        List<String> list = Arrays.asList(values);
        String finHobby = "";

        for (int j = 1; j < 21; j++) {
            if (list.contains(Integer.toString(j))) {
                finHobby = finHobby + "【" + hobbys[j] + "】";
            }
        }
        usersEntity.setUserHobby(finHobby);
//-------------------------------------------------------------------------------------------------------------
//血型的解析----------------------------------------------------------------------------------------
        String bloodType = usersEntity.getUserBloodType();

        String[] bloodTypes = {"", "A", "B", "AB", "O"};

        for (int j = 1; j < 5; j++) {
            if (Integer.parseInt(bloodType) == j) {
                usersEntity.setUserBloodType(bloodTypes[j]);
            }
        }
//-------------------------------------------------------------------------------------------------------------

//职业的解析----------------------------------------------------------------------------------------
        String userJob = usersEntity.getUserJob();

        String[] userJobs = {"", "工人", "教师", "记者", "艺人", "厨师", "医生", "军人", "律师", "会计", "经商", "作家", "导游", "画家", "警察", "公务员", "运动员", "科学家", "工程师", "翻译"};

        for (int j = 1; j < 20; j++) {
            if (Integer.parseInt(userJob) == j) {
                usersEntity.setUserJob(userJobs[j]);
            }
        }
//-------------------------------------------------------------------------------------------------------------

//label的解析----------------------------------------------------------------------------------------
        String label = usersEntity.getUserLabel();

        String[] labels = {"", "阳光", "帅气", "美丽", "端庄", "大方", "贤惠", "乐观", "独立", "健康", "有担当", "稳重", "低调", "简单", "影视达人", "音乐达人", "运动达人", "健身达人", "学霸", "高大", "好厨艺", "旅游达人", "美食达人", "游戏达人", "软萌"};

        String[] values1 = label.split(",");
        List<String> list1 = Arrays.asList(values1);
        String finLabel = "";

        for (int i = 1; i < 25; i++) {
            if (list1.contains(Integer.toString(i))) {
                finLabel = finLabel + "【" + labels[i] + "】";
            }
        }
        usersEntity.setUserLabel(finLabel);
//-------------------------------------------------------------------------------------------------------------

//hopelabel的解析----------------------------------------------------------------------------------------
        String hopelabel = usersEntity.getUserHopeLabel();

        String[] hopelabels = {"", "阳光", "帅气", "美丽", "端庄", "大方", "贤惠", "乐观", "独立", "健康", "有担当", "稳重", "低调", "简单", "影视达人", "音乐达人", "运动达人", "健身达人", "学霸", "高大", "好厨艺", "旅游达人", "美食达人", "游戏达人", "软萌"};

        String[] values2 = hopelabel.split(",");
        List<String> list2 = Arrays.asList(values2);
        String finhopeLabel = "";

        for (int i = 1; i < 25; i++) {
            if (list2.contains(Integer.toString(i))) {
                finhopeLabel = finhopeLabel + "【" + hopelabels[i] + "】";
            }
        }
        usersEntity.setUserHopeLabel(finhopeLabel);
//-------------------------------------------------------------------------------------------------------------

        // 传递给请求页面
        modelMap.addAttribute("user", usersEntity);
        return "personalprofile";
    }

    @RequestMapping(value = "/homePage", method = RequestMethod.GET)
    public String showInfo(ModelMap modelMap) {
        // 查询user表中所有记录

        TbUserinformationEntity userEntity = userInfoRepository.findOne(uId);

        String sex = userEntity.getUserSex();

        String hopelable = userEntity.getUserHopeLabel();

        List<TbUserinformationEntity> userList = null;

        List<TbUserinformationEntity> userList2 = null;

        List<TbUserinformationEntity> userFinList = new ArrayList<>();

        List<TbUserinformationEntity> userListEx = null;

        if (sex == null || hopelable == null || userEntity.getUserSexOri() == null) {

            userList = userInfoRepository.findByUserSexAndUserSexOri("女", 3);
            userList2 = userInfoRepository.findByUserSexAndUserSexOri("男", 3);

            userFinList = userList.subList(0, 3);
            userListEx = userList2.subList(0, 3);

            userFinList.addAll(userListEx);

            modelMap.addAttribute("userList", userFinList);

        } else {
            int sexOri = userEntity.getUserSexOri();


            if (sex.equals("男") && sexOri == 2) {

                userList = userInfoRepository.findByUserSexAndUserSexOri("女", 1);

                userList2 = userInfoRepository.findByUserSexAndUserSexOri("女", 3);


            } else if (sex.equals("男") && sexOri == 3) {

                userList = userInfoRepository.findByUserSexAndUserSexOri("女", 3);

                userList2 = userInfoRepository.findByUserSexAndUserSexOri("女", 1);

            } else if (sex.equals("男") && sexOri == 4) {

                userList = userInfoRepository.findByUserSexAndUserSexOri("女", 4);

                userList2 = userInfoRepository.findByUserSexAndUserSexOri("男", 4);

            } else if (sex.equals("男") && sexOri == 1) {

                userList = userInfoRepository.findByUserSexAndUserSexOri("男", 1);

                userList2 = userInfoRepository.findByUserSexAndUserSexOri("男", 3);

            } else if (sex.equals("女") && sexOri == 1) {

                userList = userInfoRepository.findByUserSexAndUserSexOri("男", 2);

                userList2 = userInfoRepository.findByUserSexAndUserSexOri("男", 3);

            } else if (sex.equals("女") && sexOri == 3) {

                userList = userInfoRepository.findByUserSexAndUserSexOri("男", 3);

                userList2 = userInfoRepository.findByUserSexAndUserSexOri("男", 2);

            } else if (sex.equals("女") && sexOri == 4) {

                userList = userInfoRepository.findByUserSexAndUserSexOri("男", 4);

                userList2 = userInfoRepository.findByUserSexAndUserSexOri("女", 4);

            } else if (sex.equals("女") && sexOri == 2) {

                userList = userInfoRepository.findByUserSexAndUserSexOri("女", 2);

                userList2 = userInfoRepository.findByUserSexAndUserSexOri("女", 3);

            } else {
                System.out.println("匹配条件出错！");
                userList = userInfoRepository.findByUserSexAndUserSexOri("女", 3);
                userList2 = userInfoRepository.findByUserSexAndUserSexOri("男", 3);
            }

            String[] values = hopelable.split(",");

            for (int i = 0; i < userList.size(); i++) {

                int k = 0;

                String userlable = userList.get(i).getUserLabel();
                String[] values2 = userlable.split(",");
                List<String> list = Arrays.asList(values2);


                if (values.length < list.size()) {
                    for (int j = 0; j < values.length; j++) {
                        if (list.contains(values[j])) {
                            k++;
                        }
                    }
                } else {
                    for (int j = 0; j < list.size(); j++) {
                        if (list.contains(values[j])) {
                            k++;
                        }
                    }
                }

                if (k >= 3) {
                    userFinList.add(userList.get(i));
                } else {

                }
            }
            if (userFinList.size() >= 6) {
                userListEx = userFinList.subList(0, 6);
                for (int i = 0; i < 6; i++) {
                    if (userListEx.get(i).getUserImg() == "" || userListEx.get(i).getUserImg() == null) {
                        if (userListEx.get(i).getUserSex().equals("男")) {
                            userListEx.get(i).setUserImg("images/1.jpg");
                        } else {
                            userListEx.get(i).setUserImg("images/a6.jpg");
                        }
                    }
                }
                modelMap.addAttribute("userList", userListEx);
            } else {
                userListEx = userList2.subList(0, 6 - userFinList.size());
                userFinList.addAll(userListEx);
                for (int i = 0; i < 6; i++) {
                    if (userFinList.get(i).getUserImg() == "" || userFinList.get(i).getUserImg() == null) {
                        if (userFinList.get(i).getUserSex().equals("男")) {
                            userFinList.get(i).setUserImg("images/1.jpg");
                        } else {
                            userFinList.get(i).setUserImg("images/a6.jpg");
                        }
                    }
                }
                modelMap.addAttribute("userList", userFinList);
            }
        }


        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    public JSONObject login(@RequestBody JSONObject json) {
        String userName = json.getString("user");
        String pwd = json.getString("password");
        List<TbUseraccountEntity> userList = userRepository.findAll();

        for (int i = 0; i < userList.size(); i++) {
            TbUseraccountEntity u = userList.get(i);
            if (u.getUserEmail().equals(userName) && u.getUserPsd().equals(pwd)) {
                uId = u.getUserId();
                json.put("result", "success");
                return json;
            }
        }
        return json;
    }


    @RequestMapping(value = "/userInfoControl", method = RequestMethod.GET)
    public String userInfoContrler(ModelMap modelMap) {
        TbUserinformationEntity userInfoEntity = userInfoRepository.findOne(uId);
        modelMap.addAttribute("userInfoEntity", userInfoEntity);
        return "personalInfo";
    }


    @ResponseBody
    @RequestMapping(value = "/infoSave", method = RequestMethod.POST)
    public JSONObject info(@RequestBody JSONObject json) {
        String trueName = json.getString("trueName");
        String nickName = json.getString("nickName");
        String number = json.getString("number");
        String height = json.getString("height");
        String weight = json.getString("weight");
        String location = json.getString("location");
        String date = json.getString("date");
        String month = json.getString("month");
        String year = json.getString("year");
        String sex = json.getString("sex");
        String sexLove = json.getString("sexLove");
        String blood = json.getString("blood");
        String job = json.getString("job");
        String salary = json.getString("salary");
        String myLabel = json.getString("myLabel");
        String hobby = json.getString("hobby");
        String hopeLabel = json.getString("hopeLabel");
        String introductory = json.getString("introductory");
        String myLabel1 = getNum(myLabel);
        String hobby1 = getNum(hobby);
        String hopeLabel1 = getNum(hopeLabel);
        String birthdate = year + "-" + month + "-" + date;
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Date birDate;
        try {
            birDate = sdf.parse(birthdate);

            userInfoRepository.updateUserInfo(uId, nickName, trueName, sex, Integer.parseInt(sexLove), Integer.parseInt(height), Integer.parseInt(weight),
                    blood, job, myLabel1, hopeLabel1, Integer.parseInt(salary), hobby1, location, number, introductory, birDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        userInfoRepository.flush();
        json.put("result", "success");
        return json;
    }

    public String getNum(String str) {
        str = str.trim();
        str = str.replaceAll("\"", "");
        str = str.substring(1, str.length() - 1);
        String[] str1 = str.split(",");
        String str2 = "";
        for (int i = 0; i < str1.length; i++) {
            str2 += str1[i] + ",";
        }

        return str2.substring(0, str2.length() - 1);
    }


    @ResponseBody
    @RequestMapping(value = "/getYzm", method = RequestMethod.POST)
    public JSONObject sendYzm(@RequestBody JSONObject json) {
        String userEmail = json.getString("userEmail");
        mailRegister mr = new mailRegister();
        //System.out.println(mailRegister.generateShortUuid());
        try {

            mr.SendMail(userEmail);

            YZM = mr.getYZM();
            System.out.print(YZM);
            json.put("result", "sendSuccess");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return json;
    }


    @RequestMapping(value = "/upload/image", method = RequestMethod.POST)
    @ResponseBody
    public String uploadImage(HttpServletRequest request, HttpServletResponse response,
                              HttpSession session, @RequestParam(value = "file", required = true) MultipartFile file)
           throws IllegalStateException, IOException {
       String path = session.getServletContext().getRealPath("/upload");
       System.out.println("real path " + path);
        String fileName = file.getOriginalFilename();
        System.out.println("file name: " + fileName);
        File targetFile = new File(path, fileName);
       if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        file.transferTo(targetFile);
        String fileUrl = request.getContextPath() + "/upload/" + fileName;
        System.out.println("file url: " + fileUrl);
        TbUserinformationEntity new1 = userInfoRepository.findOne(uId);
       new1.setUserImg(fileUrl);
        userInfoRepository.saveAndFlush(new1);
       return fileUrl;
   }
   @RequestMapping(value = "/myFriend",method = RequestMethod.GET)
   public String showFriendList(ModelMap modelMap){

       TbFriendlistEntity  friendEntity = null;
       List<TbFriendlistEntity> userList1 = null;
       List<TbFriendlistEntity> userFriendList = new ArrayList<>();
       List<TbUserinformationEntity> userInformationList = new ArrayList<>();
          userList1 = friendListRepository.findByUserIdA(uId);
          userFriendList.addAll(userList1);
          modelMap.addAttribute("userList1", userFriendList);
          for(int i =0;i<userFriendList.size();i++){
          userInformationList = userInfoRepository.findByUserId(userFriendList.get(i).getUserIdB());
       }
       modelMap.addAttribute("userInformationList",userInformationList);

   return "myFriend";
   }

}
