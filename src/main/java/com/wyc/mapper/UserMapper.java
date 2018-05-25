package com.wyc.mapper;

import java.util.List;
import com.wyc.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findByNameAndPassword(String name, String password);

    List<User> findByName(String name);

    int insertUser(@Param("username") String username, @Param("password2")String password2);
}