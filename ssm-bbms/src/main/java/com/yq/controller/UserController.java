package com.yq.controller;
import com.yq.model.ResponseBody;
import com.yq.common.AssembleResponseMsg;
import com.yq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/queryUserList",produces = "application/json;charset=utf-8")
    public ResponseBody queryUserList(@RequestBody Map<String,Object> map){
        Map<String,Object> resultMap = userService.queryUserList(map);
        return new AssembleResponseMsg().success(resultMap);
    }
    @RequestMapping(value = "/queryUser",produces = "application/json;charset=utf-8")
    public ResponseBody queryUser(@RequestBody Map<String,Object> map){
        int flog=userService.queryUser(map);
        String name="xueden";
        Map<String,String> all=new HashMap<>();
        if (flog==1){//说明存在账号和密码，即登录账号和密码输入正确
            for (Map.Entry<String,Object> entry:map.entrySet()){
                System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
                if(entry.getValue().equals(name)){
                    all.put("token","admin");
                }else {
                    all.put("token","editor");
                }
            }
            all.put("status","OK");
            return new AssembleResponseMsg().success(all);
        }else {
            return new AssembleResponseMsg().failure(200,"error","用户名或密码错误");
        }

    }

    @RequestMapping(value = "/addUser" ,produces = "application/json;charset=utf-8")
    public ResponseBody addUser(@RequestBody Map<String,Object> map){
        userService.addUser(map);
        return new AssembleResponseMsg().success("OK");
    }


    @RequestMapping(value = "/updateUser" ,produces = "application/json;charset=utf-8")
    public ResponseBody updateUser(@RequestBody Map<String,Object> map){
        userService.updateUser(map);
        return new AssembleResponseMsg().success("OK");
    }

    @RequestMapping(value = "/updateUserById" ,produces = "application/json;charset=utf-8")
    public ResponseBody updateUserById(@RequestBody Map<String,Object> map){
        userService.updateUserById(map);
        return new AssembleResponseMsg().success("OK");
    }

    @RequestMapping(value = "/delUser" ,produces = "application/json;charset=utf-8")
    public ResponseBody delUser(@RequestBody Map<String,Object> map){
        userService.delUser(map);
        return new AssembleResponseMsg().success("OK");
    }

    @RequestMapping(value = "/updateUserPass" ,produces = "application/json;charset=utf-8")
    public ResponseBody updateUserPass(@RequestBody Map<String,Object> map){
        userService.updateUserPass(map);
        return new AssembleResponseMsg().success("OK");
    }


}
