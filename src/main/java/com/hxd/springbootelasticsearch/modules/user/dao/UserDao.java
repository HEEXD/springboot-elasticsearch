package com.hxd.springbootelasticsearch.modules.user.dao;

import com.hxd.springbootelasticsearch.modules.user.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserDao extends ElasticsearchRepository<User, Long> {


}
