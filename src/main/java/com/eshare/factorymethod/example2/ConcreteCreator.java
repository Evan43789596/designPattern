package com.eshare.factorymethod.example2;
/**
 * ����Ĵ�����ʵ�ֶ���
 */
public class ConcreteCreator extends Creator {
	public Product factoryMethod() {
		//�ض��幤������������һ�������Product����
		return new ConcreteProduct();
	}
}

