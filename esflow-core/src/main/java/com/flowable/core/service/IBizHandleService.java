package com.flowable.core.service;

import java.util.List;
import java.util.Map;

import com.flowable.core.common.utils.PageHelper;

public interface IBizHandleService {

	/**
	 * 获取供选人员
	 * @param page
	 * @param params
	 * @return
	 * @
	 */
	public PageHelper<Map<String,Object>> loadMembers(PageHelper<Map<String, Object>> page,Map<String,Object> params) ;
	
	/**
	 * 获取供选部门
	 * @param params
	 * @return
	 */
	public List<Map<String,Object>> loadSectors(Map<String,Object> params);
}
