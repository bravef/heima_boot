package com.selftest.core.service;

import java.util.List;

import com.selftest.core.po.BaseDict;

/**
 * 数据字典Service接口
 */
public interface BaseDictService {
	//根据类别代码查询数据字典
	public List<BaseDict> findBaseDictByTypeCode(String typecode);	
}
