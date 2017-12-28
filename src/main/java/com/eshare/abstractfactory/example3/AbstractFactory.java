package com.eshare.abstractfactory.example3;
/**
 * ���󹤳��Ľӿڣ��������������Ʒ����Ĳ���
 */
public interface AbstractFactory {
	/**
	 * ����CPU�Ķ���
	 * @return CPU�Ķ���
	 */
	public CPUApi createCPUApi();
	/**
	 * ��������Ķ���
	 * @return ����Ķ���
	 */
	public MainboardApi createMainboardApi();
}