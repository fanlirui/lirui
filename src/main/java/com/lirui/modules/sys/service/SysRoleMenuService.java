package com.lirui.modules.sys.service;

import java.util.List;



/**
 * 角色与菜单对应关系
 *
 * @date 2017-09-29
 */
public interface SysRoleMenuService {
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
	
}
