package com.hxd.springbootelasticsearch.modules.user.service.impl;

import com.hxd.springbootelasticsearch.modules.user.dao.UserDao;
import com.hxd.springbootelasticsearch.modules.user.entity.User;
import com.hxd.springbootelasticsearch.modules.user.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User save(User user) {
       return this.userDao.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userDao.findById(id);
    }

    @Override
    public User update(User user) {
        return this.userDao.save(user);
    }

    @Override
    public void deleteById(Long id) {
        this.userDao.deleteById(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return this.userDao.findAll(pageable);
    }
}
