package com.lirui.modules.job.dao;

import com.lirui.modules.job.entity.ScheduleJobLogEntity;
import com.lirui.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @date 2017-09-29
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
