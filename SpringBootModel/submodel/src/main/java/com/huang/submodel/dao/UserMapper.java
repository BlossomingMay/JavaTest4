package com.huang.submodel.dao;


import com.huang.submodel.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getUserByName(@Param("firstName") String firstName,@Param("lastName") String lastName);

}
