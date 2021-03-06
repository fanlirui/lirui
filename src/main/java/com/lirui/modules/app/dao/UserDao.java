package com.lirui.modules.app.dao;

import com.lirui.modules.app.entity.UserEntity;
import com.lirui.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @date 2017-09-29
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
