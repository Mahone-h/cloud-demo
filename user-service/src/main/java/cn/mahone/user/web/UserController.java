package cn.mahone.user.web;


import cn.mahone.user.pojo.User;
import cn.mahone.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe:
 *  restController相当于@controller+@ResponseBody   前后端分离使用restController
 * @author: Mahone
 * @creattime: 2018/10/27 15:33
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User hello(@PathVariable("id") Long id){
        return userService.queryById(id);

    }
}
