package com.lirui.modules.sys.service;

import com.lirui.modules.sys.entity.SysUserTokenEntity;
import com.lirui.common.utils.R;

/**
 * 用户Token
 *
 * @date 2017-09-29
 */
public interface SysUserTokenService {

	SysUserTokenEntity queryByUserId(Long userId);

	void save(SysUserTokenEntity token);
	
	void update(SysUserTokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
