package com.hxd.springbootelasticsearch.modules.user.service;

import com.hxd.springbootelasticsearch.modules.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    User save(User user);

    Optional<User> findById(Long id);

    User update(User user);

    void deleteById(Long id);

    Page<User> findAll(Pageable pageable);

}
