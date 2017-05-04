package ylrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ylrc.model.*;
import ylrc.repository.*;
import net.sf.json.*;
import java.util.List;
import ylrc.mail.*;
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
    /*
    public String index(ModelMap modelMap ) {

        // 查询user表中所有记录
        List<TbUseraccountEntity> userList = userRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在userList当中
        modelMap.addAttribute("userList", userList);
        return "login";
    }
*/
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

@RequestMapping(value="/homePage",method = RequestMethod.GET)
public String homePage(ModelMap modelMap) {
    // 转到 admin/addUser.jsp页面
    TbUseraccountEntity loginUser=userRepository.findOne(uId);
    modelMap.addAttribute("loginUser",loginUser);
    return "index";
}



    @ResponseBody
    @RequestMapping(value="/loginCheck",method = RequestMethod.POST)
    public JSONObject login(@RequestBody JSONObject json) {
        String userName = json.getString("user");
        String pwd = json.getString("password");
        List<TbUseraccountEntity> userList = userRepository.findAll();
        TbUseraccountEntity uu=userRepository.findOne(10);
        System.out.println("003");
        System.out.println(uu.getUserPsd());
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
}
