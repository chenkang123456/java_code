package com.yq.common;

import com.yq.model.InfoMsg;
import com.yq.model.ResponseBody;

/**
 * 封装ResponseBody内容
 */
public class AssembleResponseMsg {
    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public <T>ResponseBody success(T data){
        ResponseBody<T> resp=new ResponseBody<T>();
        resp.setData(data);
        InfoMsg info=new InfoMsg();
        resp.setInfo(info);
        return resp;
    }

    /**
     * 失败/异常返回内容
     */
    public <T>ResponseBody failure(int status,String errorCode,String message){
        ResponseBody<T> resp=new ResponseBody<T>();
        resp.setStatus(status);
        InfoMsg info=new InfoMsg();
        info.setCode(errorCode);
        info.setMessage(message);
        resp.setInfo(info);
        return resp;
    }
}
