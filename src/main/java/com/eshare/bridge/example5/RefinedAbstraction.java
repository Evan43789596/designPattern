package com.eshare.bridge.example5;
/**
 * ������Abstraction����Ľӿڹ���
 */
public class RefinedAbstraction extends Abstraction {
	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}
	/**
	 * ʾ��������ʵ��һ���Ĺ��ܣ����ܻ�ʹ�þ���ʵ�ֲ��ֵ�ʵ�ַ�����
	 * ���Ǳ���������Ŀ�����ʹ��Abstraction�ж���ķ�����
	 * ͨ�����ʹ��Abstraction�ж���ķ�������ɸ���Ĺ���
	 */
	public void otherOperation(){
		//
	}
}
