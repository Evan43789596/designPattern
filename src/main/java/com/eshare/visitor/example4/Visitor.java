package com.eshare.visitor.example4;
/**
 * �����߽ӿ�
 */
public interface Visitor {
	/**
	 * ������ҵ�ͻ����൱�ڸ���ҵ�ͻ���ӷ����ߵĹ���
	 * @param ec ��ҵ�ͻ��Ķ���
	 */
	public void visitEnterpriseCustomer(EnterpriseCustomer ec);
	/**
	 * ���ʸ��˿ͻ����൱�ڸ����˿ͻ���ӷ����ߵĹ���
	 * @param pc ���˿ͻ��Ķ���
	 */
	public void visitPersonalCustomer(PersonalCustomer pc);
}

