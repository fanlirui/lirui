package com.lirui.modules.job.dao;

import com.lirui.modules.job.entity.ScheduleJobEntity;
import com.lirui.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 *
 *
 * @date 2017-09-29
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
