package com.yq.service;

import java.util.List;
import java.util.Map;

public interface ISysAccessLogService {
    //保存日志
    public int saveSysLog(Map<String,Object> map);
    //查看日志列表
    public Map<String,Object> querySysLogList(Map<String,Object> map);
}
