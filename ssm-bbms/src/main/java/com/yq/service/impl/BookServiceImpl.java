package com.yq.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yq.mapper.BookMapper;
import com.yq.model.Book;
import com.yq.model.BookSub;
import com.yq.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Map<String, Object> queryBookList(Map<String, Object> map) {
        //获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        //每页几条记录
        int pageSize = Integer.parseInt(map.get("pageSize").toString());

        PageHelper.startPage(pageNum,pageSize);
        List<Book> bookList = bookMapper.queryBookList(map);
        PageInfo pageInfo = new PageInfo(bookList);
        long total=pageInfo.getTotal();

        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",bookList);
        return resultMap;
    }
    @Override
    public void addBook(Map<String, Object> map) {
        bookMapper.addBook(map);
    }

    @Override
    public void editBook(Map<String, Object> map) {
        bookMapper.editBook(map);
    }

    @Override
    public void delBook(Map<String, Object> map) {
        bookMapper.delBook(map);
    }

    /**
     * 借阅图书
     * @param map
     */
    @Override
    public void addSubBook(Map<String, Object> map) {
        bookMapper.addSubBook(map);
    }

    @Override
    public void returnBook(Map<String, Object> map) {
        bookMapper.returnBook(map);
    }

    @Override
    public Map<String, Object> querySub(Map<String, Object> map) {
        List<BookSub> bookSubList= bookMapper.querySub(map);
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("rows",bookSubList);
        return resultMap;
    }

    /**
     * 更新图书库存
     * @param map
     */
    @Override
    public void updateInventtories(Map<String, Object> map) {
        bookMapper.updateInventtories(map);
    }
}
