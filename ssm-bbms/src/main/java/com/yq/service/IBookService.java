package com.yq.service;

import java.util.Map;

public interface IBookService {
    Map<String,Object> queryBookList(Map<String,Object> map);
    //新增图书
    void addBook(Map<String,Object> map);
    void editBook(Map<String,Object> map);
    void delBook(Map<String,Object> map);

    //借阅图书
    void addSubBook(Map<String,Object> map);

    //归还图书
    void returnBook(Map<String,Object> map);
    //查看借阅图书列表
    Map<String,Object> querySub(Map<String,Object> map);
    //更新图书库存
    void updateInventtories(Map<String,Object> map);
}
