package com.yq.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yq.mapper.SysAccessLogMapper;
import com.yq.service.ISysAccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SysAccessLogServiceImpl implements ISysAccessLogService {
    @Autowired
    private SysAccessLogMapper sysAccessLogMapper;

    /**
     * 保存日志
     * @param map
     * @return
     */
    @Override
    public int saveSysLog(Map<String, Object> map) {
        return sysAccessLogMapper.saveSysLog(map);
    }

    /**
     * 查看日志列表
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> querySysLogList(Map<String, Object> map) {
        //获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        //每页几条记录
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String,Object>> resultList = sysAccessLogMapper.querySysLogList(map);
        PageInfo pageInfo = new PageInfo(resultList);
        long total = pageInfo.getTotal();
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",resultList);
        return resultMap;
    }
}
