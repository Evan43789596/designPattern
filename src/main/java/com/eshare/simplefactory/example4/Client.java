package com.eshare.simplefactory.example4;
/**
 * �ͻ��ˣ�����ʹ��Api�ӿ�
 */
public class Client {
	public static void main(String[] args) {
		//��Ҫ�ı䣬û��new Impl()�ˣ�ȡ����֮Factory.createApi()
		//ע�����ﴫ�ݵĲ������޸Ĳ����Ϳ����޸���Ϊ�����Կ���
		Api api = Factory.createApi(2);
		api.test1("��������Ҫ���ţ�ֻ�Ǹ����Զ��ѣ�");
	}
}
