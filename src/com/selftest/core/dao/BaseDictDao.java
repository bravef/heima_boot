package com.selftest.core.dao;

import java.util.List;

import com.selftest.core.po.BaseDict;

/**
 * �����ֵ�
 */
public interface BaseDictDao {
	// �����������ѯ�����ֵ�
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
