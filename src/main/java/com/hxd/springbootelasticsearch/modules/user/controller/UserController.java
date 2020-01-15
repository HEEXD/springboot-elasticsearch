package com.hxd.springbootelasticsearch.modules.user.controller;

import com.hxd.springbootelasticsearch.modules.user.entity.User;
import com.hxd.springbootelasticsearch.modules.user.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 保存
     */
    @PostMapping("/save")
    public User save(User user) {
        return this.userService.save(user);
    }

    /**
     * 根据id查询
     */
    @GetMapping("/findById/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    /**
     * 修改
     */
    @PutMapping("update")
    public User update(User user) {
        return userService.update(user);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delById/{id}")
    public String delById(@PathVariable Long id) {
        userService.deleteById(id);
        return "删除成功!";
    }

    /**
     * 查询所有
     */
    @GetMapping("/findAll/{page}/{size}")
    public Page<User> findAll(@PathVariable Integer page, @PathVariable Integer size) {
        return userService.findAll(PageRequest.of(page - 1, size));
    }

}
