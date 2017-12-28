package com.eshare.abstractfactory.example2;
/**
 * ���󹤳��Ľӿڣ��������������Ʒ����Ĳ���
 */
public interface AbstractFactory {
	/**
	 * ʾ�����������������ƷA�Ķ���
	 * @return �����ƷA�Ķ���
	 */
	public AbstractProductA createProductA();
	/**
	 * ʾ�����������������ƷB�Ķ���
	 * @return �����ƷB�Ķ���
	 */
	public AbstractProductB createProductB();
}