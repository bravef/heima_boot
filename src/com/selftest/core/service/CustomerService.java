package com.selftest.core.service;

import com.selftest.common.utils.Page;
import com.selftest.core.po.Customer;

public interface CustomerService {
	// ��ѯ�ͻ��б�
	public Page<Customer> findCustomerList(Integer page, Integer rows, 
                                        String custName,String custSource,
                                        String custIndustry,String custLevel);
	/**
	 * �����ͻ�
	 */
	public int createCustomer(Customer customer);
	
	// ͨ��id��ѯ�ͻ�
	public Customer getCustomerById(Integer id);
	// ���¿ͻ�
	public int updateCustomer(Customer customer);
	// ɾ���ͻ�
	public int deleteCustomer(Integer id);

}
