package com.yq.mapper;

import com.yq.model.User;

import java.util.List;
import java.util.Map;

/**
 * 用户持久层接口
 */
public interface UserMapper {

   //查询用户列表
   List<User> queryUserList(Map<String,Object> map);
   //查询用户
   int queryUser(Map<String,Object> map);
   //新增用户
   void addUser(Map<String,Object> map);
   //更新用户
   void updateUser(Map<String,Object> map);

   void updateUserById(Map<String,Object> map);

   void delUser(Map<String,Object> map);

   //修改用户密码
   void updateUserPass(Map<String,Object> map);
}
