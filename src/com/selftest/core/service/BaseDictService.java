package com.selftest.core.service;

import java.util.List;

import com.selftest.core.po.BaseDict;

/**
 * �����ֵ�Service�ӿ�
 */
public interface BaseDictService {
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);	
}
