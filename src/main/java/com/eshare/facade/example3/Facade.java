package com.eshare.facade.example3;
/**
 * ����������ϵͳ����۶���
 */
public class Facade {
	/**
	 * �ͻ�����Ҫ�ģ�һ���򵥵ĵ��ô������ɵĹ���
	 */
	public void generate(){
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}
