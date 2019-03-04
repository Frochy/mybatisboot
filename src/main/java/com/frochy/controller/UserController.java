package com.frochy.controller;

import com.frochy.service.UserService;
import com.frochy.util.GSonTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/getuser")
    @ResponseBody
    public String getUser(@RequestParam(value="id") Integer id){
        return GSonTool.userToJson(userService.selectById(id));
    }

    @RequestMapping("/deluser")
    @ResponseBody
    public String delUser(@RequestParam(value = "id") Integer id){
        if(userService.deleteById(id)==1)
            return "成功删除id="+id+"的用户！";
        else
            return "id="+id+"的用户不存在！";
    }
}