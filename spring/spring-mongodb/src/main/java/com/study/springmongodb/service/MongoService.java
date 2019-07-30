package com.study.springmongodb.service;

import com.study.springmongodb.pojo.MongoTest;
import com.study.springmongodb.pojo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MongoService {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     *
     * @param userInfo
     */
    public UserInfo save(UserInfo userInfo) {

        UserInfo userInfo1 = mongoTemplate.save(userInfo);
        System.out.println(userInfo1);

        return userInfo1;
    }

    public List<UserInfo> find(String username) {
        Query query = new Query(Criteria.where("username").is(username));
        return mongoTemplate.find(query, UserInfo.class);

    }

    /**
     * 根据用户名查询对象
     *
     * @return
     */
    public UserInfo findTestByName(String name) {
        Query query = new Query(Criteria.where("username").is(name));
        UserInfo userInfo = mongoTemplate.findOne(query, UserInfo.class);
        return userInfo;
    }

    /**
     * 根据用户名查询对象
     *
     * @return
     */
    public UserInfo findTestById(long id) {
        Query query = new Query(Criteria.where("id").is(id));
        UserInfo userInfo = mongoTemplate.findOne(query, UserInfo.class);
        return userInfo;
    }

    /**
     * 更新对象
     */
    public void update(UserInfo userInfo) {
        Query query = new Query(Criteria.where("id").is(userInfo.getId()));
        Update update = new Update().set("password", userInfo.getPassword());
        mongoTemplate.updateFirst(query, update, UserInfo.class);

    }

    public void updateAll(UserInfo userInfo) {
        Query query = new Query(Criteria.where("username").is(userInfo.getUsername()));
        Update update = new Update().set("password", userInfo.getPassword());
        mongoTemplate.updateMulti(query, update, UserInfo.class);

    }

    public void delete(long id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, UserInfo.class);

    }


}
