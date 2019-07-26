package com.huang.submodel.service;

import com.huang.submodel.dao.UserMapper;
import com.huang.submodel.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public String getUserInfo(User loginUser){
        Logger logger = LoggerFactory.getLogger(getClass());
        User user = userMapper.getUserByName(loginUser.getName(),loginUser.getPassword());
        if(user == null){
            logger.info("登录失败");
            return "Fail to login!!";
        }else{
            logger.info("登录成功");
            return "Success to login!!!!!";
        }


    }


}
