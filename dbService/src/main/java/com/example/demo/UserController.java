package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/save")
    public Map<String,Object> save(@RequestBody User user){
        userService.save(user);
        Map<String ,Object>p=new HashMap<>();
        p.put("code","success");
        return p;
    }
    @GetMapping(value = "/stuinfo/{uid}")
    @ResponseBody
    public User selectUser(@PathVariable(value = "uid")String uid){
        User user =userService.selectByKey(uid);
        return user;
    }
}
