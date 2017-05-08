package ylrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ylrc.model.*;
import ylrc.repository.*;
import net.sf.json.*;

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
    public String YZM="";
    public int uId ;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index()
    {
        return "login";
    }

    @ResponseBody
    @RequestMapping(value="/registerCheck",method = RequestMethod.POST)
    public JSONObject register(@RequestBody JSONObject json) {
        String userEmail = json.getString("userEmail");
        String userPhone=json.getString("userPhone");
        String pwd = json.getString("passWord");
        String userYzm=json.getString("yzm");
        List<TbUseraccountEntity> userList = userRepository.findAll();
        for (int i = 0; i < userList.size(); i++) {
            TbUseraccountEntity u = userList.get(i);
            if (u.getUserEmail().equals(userEmail)||u.getUserPhone().equals(userPhone)) {
                json.put("result", "fail");
                return json;
            }
        }

        mailRegister mr=new mailRegister();
        //System.out.println(mailRegister.generateShortUuid());

           if(YZM.equals(userYzm))
           {
               TbUseraccountEntity useraccountEntity=new TbUseraccountEntity();
               useraccountEntity.setUserPhone(userPhone);
               useraccountEntity.setUserEmail(userEmail);
               useraccountEntity.setUserPsd(pwd);
               userRepository.saveAndFlush(useraccountEntity);
              List<TbUseraccountEntity> list1=userRepository.findAll();
               for (int i = 0; i < list1.size(); i++) {
                   TbUseraccountEntity u1 = list1.get(i);
                   if (u1.getUserEmail().equals(userEmail)) {
                       TbUserinformationEntity info1=new TbUserinformationEntity();
                       info1.setUserId(u1.getUserId());
                       userInfoRepository.saveAndFlush(info1);
                   }
               }

               json.put("result", "success");
           }
           else{
               json.put("result", "failYZM");
           }

        return json;
    }

//@RequestMapping(value="/homePage",method = RequestMethod.GET)
//public String homePage(ModelMap modelMap) {
//    // 转到 admin/addUser.jsp页面
//    TbUseraccountEntity loginUser=userRepository.findOne(uId);
//    modelMap.addAttribute("loginUser",loginUser);
//    return "index";
//}

    @RequestMapping(value = "/homePage", method = RequestMethod.GET)
    public String showInfo(ModelMap modelMap) {
        // 查询user表中所有记录

        TbUserinformationEntity userEntity = userInfoRepository.findOne(uId);

        String sex = userEntity.getUserSex();

        int sexOri = userEntity.getUserSexOri();

        List<TbUserinformationEntity> userList = null;

        List<TbUserinformationEntity> userList2 = null;

        if(sex.equals("男") && sexOri == 2){

            userList = userInfoRepository.findByUserSexAndUserSexOri("女",1);

            userList2 = userInfoRepository.findByUserSexAndUserSexOri("女",3);


        }else if(sex.equals("男") && sexOri == 3){

            userList = userInfoRepository.findByUserSexAndUserSexOri("女",3);

            userList2 = userInfoRepository.findByUserSexAndUserSexOri("女",1);

        }else if(sex.equals("男") && sexOri == 4){

            userList = userInfoRepository.findByUserSexAndUserSexOri("女",4);

            userList2 = userInfoRepository.findByUserSexAndUserSexOri("男",4);

        }else if(sex.equals("男") && sexOri == 1){

            userList = userInfoRepository.findByUserSexAndUserSexOri("男",1);

            userList2 = userInfoRepository.findByUserSexAndUserSexOri("男",3);

        }else if(sex.equals("女") && sexOri == 1){

            userList = userInfoRepository.findByUserSexAndUserSexOri("男",2);

            userList2 = userInfoRepository.findByUserSexAndUserSexOri("男",3);

        }else if(sex.equals("女") && sexOri == 3){

            userList = userInfoRepository.findByUserSexAndUserSexOri("男",3);

            userList2 = userInfoRepository.findByUserSexAndUserSexOri("男",2);

        }else if(sex.equals("女") && sexOri == 4){

            userList = userInfoRepository.findByUserSexAndUserSexOri("男",4);

            userList2 = userInfoRepository.findByUserSexAndUserSexOri("女",4);

        }else if(sex.equals("女") && sexOri == 2){

            userList = userInfoRepository.findByUserSexAndUserSexOri("女",2);

            userList2 = userInfoRepository.findByUserSexAndUserSexOri("女",3);

        }else{
            System.out.println("匹配条件出错！");
            userList = userInfoRepository.findByUserSexAndUserSexOri("女",3);
            userList2 = userInfoRepository.findByUserSexAndUserSexOri("男",3);
        }


        List<TbUserinformationEntity> userFinList =  new ArrayList<>();


        String hopelable = userEntity.getUserHopeLabel();

        String[] values = hopelable.split(",");

        List<TbUserinformationEntity> userListEx = null;


        for(int i = 0;i<userList.size();i++){

            int k = 0;

            String userlable = userList.get(i).getUserLabel();
            String[] values2 = userlable.split(",");
            List<String> list = Arrays.asList(values2);
            ;
            if(values.length < list.size()){
                 int t= values.length ;
                for(int j = 0;j <t;j++){
                    if(list.contains(values[j])){
                        k++;
                    }
                }
            }else{
                for(int j = 0;j <list.size();j++){
                    if(list.contains(values[j])){
                        k++;
                    }
                }
            }

            if(k>=3){

                userFinList.add(userList.get(i));
                //System.out.println("满足标签");

                //System.out.println(userFinList.get(i).getUserSex());
            }else{
                //System.out.println("k小于2");
            }
        }
        if(userFinList.size()>=6){

            userListEx = userFinList.subList(0, 6);
            modelMap.addAttribute("userList", userListEx);
            //System.out.println("SIZE大于6");

        }else{
            //System.out.println("SIZE不大于6");
            userListEx = userList2.subList(0, 6-userFinList.size());
            userFinList.addAll(userListEx);
            modelMap.addAttribute("userList", userFinList);
        }

//        for(int i = 0;i<userListEx.size();i++){
//            System.out.println(userListEx.get(i).getUserNickName());
//        }
       modelMap.addAttribute("userInfo",userEntity);
        return "index";
    }

    @ResponseBody
    @RequestMapping(value="/loginCheck",method = RequestMethod.POST)
    public JSONObject login(@RequestBody JSONObject json) {
        String userName = json.getString("user");
        String pwd = json.getString("password");
        List<TbUseraccountEntity> userList = userRepository.findAll();

        for (int i = 0; i < userList.size(); i++) {
            TbUseraccountEntity u = userList.get(i);
            if (u.getUserEmail().equals(userName) && u.getUserPsd().equals(pwd)) {
                uId=u.getUserId();
                json.put("result", "success");
                return json;
            }
        }
        return json;
    }


    @RequestMapping(value = "/personal/{userId}", method = RequestMethod.GET)
    public String  showUser(@PathVariable("userId")Integer usersId,ModelMap modelMap){
        return "personalprofile";

    }

    @RequestMapping(value="/userInfoControl",method = RequestMethod.GET)
    public String userInfoContrler(ModelMap modelMap){
        TbUserinformationEntity userInfoEntity=userInfoRepository.findOne(uId);
        modelMap.addAttribute("userInfoEntity",userInfoEntity);
        return "personalInfo";
    }




    @ResponseBody
    @RequestMapping(value="/infoSave",method = RequestMethod.POST)
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
        String introductory=json.getString("introductory");
        String myLabel1=getNum(myLabel);
        String hobby1=getNum(hobby);
        String hopeLabel1=getNum(hopeLabel);
        String birthdate=year+"-"+month+"-"+date;
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
        Date birDate;
        try {
             birDate = sdf.parse(birthdate);

        userInfoRepository.updateUserInfo(uId,nickName,trueName,sex,Integer.parseInt(sexLove),Integer.parseInt(height),Integer.parseInt(weight),
                blood,job,myLabel1,hopeLabel1,Integer.parseInt(salary),hobby1,location,number,introductory,birDate);
        }catch (Exception e){
            e.printStackTrace();
        }
        userInfoRepository.flush();
        json.put("result", "success");
        return json;
    }

public String getNum(String str){
    str=str.trim();
    str = str.replaceAll("\"","");
    str=str.substring(1,str.length()-1);
    String[] str1=str.split(",");
    String str2="";
    for(int i=0;i<str1.length;i++){
      str2+=str1[i]+"," ;
    }

return str2.substring(0,str2.length()-1);
}




    @ResponseBody
    @RequestMapping(value="/getYzm",method = RequestMethod.POST)
    public JSONObject sendYzm(@RequestBody JSONObject json) {
        String userEmail = json.getString("userEmail");
        mailRegister mr=new mailRegister();
        //System.out.println(mailRegister.generateShortUuid());
        try {

            mr.SendMail(userEmail);

           YZM=mr.getYZM();
           System.out.print(YZM);
            json.put("result", "sendSuccess");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return json;
    }


    @RequestMapping(value="/upload/image",method=RequestMethod.POST)
    @ResponseBody
    public String uploadImage(HttpServletRequest request, HttpServletResponse response,
                              HttpSession session,@RequestParam(value="file",required = true)MultipartFile file)
    throws IllegalStateException,IOException{
        String path=session.getServletContext().getRealPath("/upload");
        System.out.println("real path "+path);
        String fileName=file.getOriginalFilename();
        System.out.println("file name: "+fileName);
        File targetFile=new File(path,fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        file.transferTo(targetFile);
        String fileUrl=request.getContextPath()+"/upload/"+fileName;
        System.out.println("file url: "+fileUrl);
        TbUserinformationEntity new1=userInfoRepository.findOne(uId);
        new1.setUserImg(fileUrl);
        userInfoRepository.saveAndFlush(new1);
       return fileUrl;
    }
}
