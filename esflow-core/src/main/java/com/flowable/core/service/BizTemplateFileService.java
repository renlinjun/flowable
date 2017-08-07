package com.flowable.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.flowable.core.bean.BizTemplateFile;
import com.flowable.core.common.service.IBaseService;
import com.flowable.core.common.utils.PageHelper;

public interface BizTemplateFileService extends IBaseService<BizTemplateFile>{

	public PageHelper<BizTemplateFile> findTemplateFlies(PageHelper<BizTemplateFile> page,BizTemplateFile file,boolean islike);

	public void deleteByIds(List<String> list);
	
	public List<BizTemplateFile> findFileByIds(List<String> ids);

	public void saveOrUpdate(BizTemplateFile dataFile, MultipartFile file);
	
	public BizTemplateFile getBizTemplateFile(Map<String,String> params);
}
