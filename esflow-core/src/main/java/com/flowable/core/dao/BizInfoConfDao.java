package com.flowable.core.dao;

import java.util.List;
import java.util.Map;

import com.flowable.core.bean.BizInfoConf;
import com.flowable.core.common.dao.IBaseDao;

/**
 * @author 2622
 * @time 2016年5月28日
 * @email lukw@eastcom-sw.com
 */
public interface BizInfoConfDao extends IBaseDao< BizInfoConf>{

	public List<BizInfoConf> findBizInfoConf(BizInfoConf bizInfoConf);

	public BizInfoConf getBizInfoConfByBizId(String bizId);

	public String getTaskAssignee(String bizId);

	public List<BizInfoConf> getBizInfoConf(String bizId);
	
	/**
	 * 工单转派 (不通过工作流)
	 * @param map
	 */
	public void turnTask(Map<String, Object> map);
}
