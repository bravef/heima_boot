package com.selftest.core.service;

import com.selftest.core.po.User;

public interface UserService {
	// ͨ���˺ź������ѯ�û�
		public User findUser(String usercode,String password);
}
