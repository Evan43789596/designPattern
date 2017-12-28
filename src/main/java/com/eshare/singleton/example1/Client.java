package com.eshare.singleton.example1;

public class Client {
	public static void main(String[] args) {
		//������ȡӦ�����õĶ���
		AppConfig config = new AppConfig();
		
		String paramA = config.getParameterA();
		String paramB = config.getParameterB();
		
		System.out.println("paramA="+paramA+",paramB="+paramB);
	}
}
