package com.yq.service;
import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;

import java.util.Map;
/**
 * 用户业务层接口
 */
public interface IUserService {
    Map<String,Object> queryUserList(Map<String,Object> map);
    int queryUser(Map<String,Object> map);
    void addUser(Map<String,Object> map);
    void updateUser(Map<String,Object> map);
    void updateUserById(Map<String,Object> map);
    void delUser(Map<String,Object> map);
    void updateUserPass(Map<String,Object> map);
}
