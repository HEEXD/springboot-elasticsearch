package com.hxd.springbootelasticsearch.modules.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// 加上了@Document注解之后，默认情况下这个实体中所有的属性都会被建立索引、并且分词
// indexName 索引库的名称，建议以项目的名称命名；type 类型，建议以实体类的名称命名
@Document(indexName = "elasticsearch",type = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 7433437449182930888L;

    private String id;

    private String username;

    private String age;
}
