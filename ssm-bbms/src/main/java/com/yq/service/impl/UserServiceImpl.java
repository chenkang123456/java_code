package com.yq.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yq.mapper.UserMapper;
import com.yq.model.User;
import com.yq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户业务层实现类
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    /**
     *  查询用户列表
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> queryUserList(Map<String, Object> map) {
        //获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        //每页几条记录
        int pageSize = Integer.parseInt(map.get("pageSize").toString());

        PageHelper.startPage(pageNum,pageSize);
        List<User> userList=userMapper.queryUserList(map);
        PageInfo pageInfo = new PageInfo(userList);
        long total=pageInfo.getTotal();

        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",userList);
        return resultMap;
    }

    @Override
    public int queryUser(Map<String, Object> map) {
        return userMapper.queryUser(map);
    }

    @Override
    public void addUser(Map<String, Object> map) {
        userMapper.addUser(map);
    }

    @Override
    public void updateUser(Map<String, Object> map) {
        userMapper.updateUser(map);
    }

    @Override
    public void updateUserById(Map<String, Object> map) {
        userMapper.updateUserById(map);
    }

    @Override
    public void delUser(Map<String, Object> map) {
        userMapper.delUser(map);
    }

    @Override
    public void updateUserPass(Map<String, Object> map) {
        userMapper.updateUserPass(map);
    }


}
