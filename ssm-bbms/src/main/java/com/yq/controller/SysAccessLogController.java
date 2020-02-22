package com.yq.controller;
import com.yq.common.AssembleResponseMsg;
import com.yq.model.ResponseBody;
import com.yq.service.ISysAccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 日志管理的控制层
 */
@RestController
public class SysAccessLogController {
    @Autowired
    private ISysAccessLogService sysAccessLogService;

    /**
     * 查看日志列表
     * @param map
     * @return
     */
    @RequestMapping(value = "/querySysLogList",produces = "application/json;charset=utf-8")
    public ResponseBody querySysLogList(@RequestBody Map<String,Object> map){
        Map<String,Object> resultMap = sysAccessLogService.querySysLogList(map);
        return  new AssembleResponseMsg().success(resultMap);
    }
}
