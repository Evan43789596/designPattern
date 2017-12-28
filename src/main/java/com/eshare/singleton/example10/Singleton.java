package com.eshare.singleton.example10;

public class Singleton {
	/**
	 * �Ա���ʵ���ı������volatile������
	 */
	private volatile static Singleton instance = null;
	private Singleton(){
		
	}
	public static  Singleton getInstance(){
		//�ȼ��ʵ���Ƿ���ڣ���������ڲŽ��������ͬ����
		if(instance == null){
			//ͬ���飬�̰߳�ȫ�Ĵ���ʵ��
			synchronized(Singleton.class){
				//�ٴμ��ʵ���Ƿ���ڣ���������ڲ���Ĵ���ʵ��
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

