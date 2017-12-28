package com.eshare.singleton.example3;
/**
 * ����ʽ����ʵ�ֵ�ʾ��
 */
public class Singleton {
	/**
	 * ����һ���������洢�����õ���ʵ����ֱ�������ﴴ����ʵ����ֻ�ᴴ��һ��
	 */
	private static Singleton uniqueInstance = new Singleton();
	/**
	 * ˽�л����췽���������ڲ����ƴ���ʵ������Ŀ
	 */
	private Singleton(){
		//
	}
	/**
	 * ����һ��������Ϊ�ͻ����ṩ��ʵ��
	 * @return һ��Singleton��ʵ��
	 */
	public static Singleton getInstance(){
		//ֱ��ʹ���Ѿ������õ�ʵ��
		return uniqueInstance;
	}
	
	/**
	 * ʾ�ⷽ���������������Լ��Ĳ���
	 */
	public void singletonOperation(){
		//���ܴ���
	}
	/**
	 * ʾ�����ԣ������������Լ�������
	 */
	private String singletonData;
	/**
	 * ʾ�ⷽ�������ⲿͨ����Щ�������������Ե�ֵ
	 * @return ���Ե�ֵ
	 */
	public String getSingletonData(){
		return singletonData;
	}
}
