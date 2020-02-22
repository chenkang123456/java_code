package com.yq.controller;

import com.yq.common.AssembleResponseMsg;
import com.yq.model.ResponseBody;
import com.yq.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 图书控制层
 */
@RestController
public class BookController {
    @Autowired
    private IBookService bookService;

    @RequestMapping(value = "/queryBookList" ,produces = "application/json;charset=utf-8")
    public ResponseBody queryBookList(@RequestBody Map<String,Object> map){
        Map<String,Object> resultMap = bookService.queryBookList(map);
        return new AssembleResponseMsg().success(resultMap);
    }

    @RequestMapping(value = "/addBook" ,produces = "application/json;charset=utf-8")
    public ResponseBody addBook(@RequestBody Map<String,Object> map){
        try{
            bookService.addBook(map);
            return new AssembleResponseMsg().success("OK");
        }catch (Exception e){
            return new AssembleResponseMsg().failure(200,"error","添加失败");
        }
    }


    @RequestMapping(value = "/editBook" ,produces = "application/json;charset=utf-8")
    public ResponseBody editBook(@RequestBody Map<String,Object> map){
        try{
            bookService.editBook(map);
            return new AssembleResponseMsg().success("OK");
        }catch (Exception e){
            return new AssembleResponseMsg().failure(200,"error","编辑失败");
        }
    }

    @RequestMapping(value = "/delBook" ,produces = "application/json;charset=utf-8")
    public ResponseBody delBook(@RequestBody Map<String,Object> map){
        try{
            bookService.delBook(map);
            return new AssembleResponseMsg().success("OK");
        }catch (Exception e){
            return new AssembleResponseMsg().failure(200,"error","删除失败");
        }
    }

    @RequestMapping(value = "/addSubBook" ,produces = "application/json;charset=utf-8")
    public ResponseBody addSubBook(@RequestBody Map<String,Object> map){
        try{
            bookService.addSubBook(map);
            return new AssembleResponseMsg().success("OK");
        }catch (Exception e){
            return new AssembleResponseMsg().failure(200,"error","借阅失败");
        }
    }

    @RequestMapping(value = "/returnBook" ,produces = "application/json;charset=utf-8")
    public ResponseBody returnBook(@RequestBody Map<String,Object> map){
        try{
            bookService.returnBook(map);
            return new AssembleResponseMsg().success("OK");
        }catch (Exception e){
            return new AssembleResponseMsg().failure(200,"error","归还失败");
        }
    }

    /**
     * 查看借阅图书列表
     * @param map
     * @return
     */
    @RequestMapping(value = "/querySub" ,produces = "application/json;charset=utf-8")
    public ResponseBody querySub(@RequestBody Map<String,Object> map){
        Map<String,Object> resultMap = bookService.querySub(map);
        return new AssembleResponseMsg().success(resultMap);
    }
    /**
     * 更新图书库存
     * @param map
     * @return
     */
    @RequestMapping(value = "/updateInventtories" ,produces = "application/json;charset=utf-8")
    public ResponseBody updateInventtories(@RequestBody Map<String,Object> map){
        bookService.updateInventtories(map);
        return new AssembleResponseMsg().success("OK");
    }
}
