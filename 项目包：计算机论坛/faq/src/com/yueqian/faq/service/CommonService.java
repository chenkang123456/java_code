package com.yueqian.faq.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.yueqian.faq.common.DBUtils;
import com.yueqian.faq.dao.CategoryDao;
import com.yueqian.faq.dao.ProblemDao;
import com.yueqian.faq.dao.UserDao;
import com.yueqian.faq.domain.StatisticsInfo;

public class CommonService {

	// com.yueqian.faq.service.CommonService
	private Logger logger = Logger.getLogger(CommonService.class.getName());

	private static CommonService instance;

	public synchronized static CommonService getInstance() {
		if (instance == null) {
			instance = new CommonService();
		}
		return instance;
	}

	private CommonService() {

	}

	/**
	 * 获取页面的通用的统计信息
	 * 
	 * @return
	 */
	public StatisticsInfo findStatisticsInfo() {
		StatisticsInfo info = new StatisticsInfo();
		try {
			// 问题分类
			info.setCategoryList(CategoryDao.getInstance().findAllCategories());
			// 积分排行
			info.setUserScores(UserDao.getInstance().findUserByScoresDesc());
			// 问题统计
			ProblemDao.getInstance().countQuestion(info);
			// 用户统计
			UserDao.getInstance().countUserByQuestion(info);
			DBUtils.commit();
		} catch (SQLException e) {
			logger.error("查找问题统计信息时异常:" + e.getMessage());
			DBUtils.rollback();
		}
		return info;
	}
}
