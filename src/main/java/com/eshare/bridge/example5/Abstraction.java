package com.eshare.bridge.example5;

/**
 * ������󲿷ֵĽӿ�
 */
public abstract class Abstraction {
	/**
	 * ����һ��ʵ�ֲ��ֵĶ���
	 */
	protected Implementor impl;
	/**
	 * ���췽��������ʵ�ֲ��ֵĶ��� 
	 * @param impl ʵ�ֲ��ֵĶ���
	 */
	public Abstraction(Implementor impl){
		this.impl = impl;
	}
	/**
	 * ʾ��������ʵ��һ���Ĺ��ܣ�������Ҫת��ʵ�ֲ��ֵľ���ʵ�ַ���
	 */
	public void operation() {
		impl.operationImpl();
	}
}

