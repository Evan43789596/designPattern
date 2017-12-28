package com.eshare.singleton.example4;

public class Client {
	public static void main(String[] args) {
		//������ȡӦ�����õĶ���
		AppConfig config = AppConfig.getInstance();
		
		String paramA = config.getParameterA();
		String paramB = config.getParameterB();
		
		System.out.println("paramA="+paramA+",paramB="+paramB);
	}
}
