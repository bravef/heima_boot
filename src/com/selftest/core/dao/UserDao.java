package com.selftest.core.dao;

import org.apache.ibatis.annotations.Param;

import com.selftest.core.po.User;



public interface UserDao {
	/**
	 * ͨ���˺ź������ѯ�û�
	 */
	public User findUser(@Param("usercode") String usercode,
			                @Param("password") String password);
}
