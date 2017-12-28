package com.eshare.command.example7;
import java.util.*;
/**
 * ����Ա��������ϲ˵�,������ִ�е���
 */
public class Waiter {
	/**
	 * ����һ����������󡪡��˵�
	 */
	private MenuCommand menuCommand = new MenuCommand();
	/**
	 * �ͻ����
	 * @param cmd �ͻ���Ĳˣ�ÿ������һ���������
	 */
	public void orderDish(Command cmd){
		//��ӵ��˵���
		menuCommand.addCommand(cmd);
	}
	/**
	 * �ͻ������ϣ���ʾҪִ�������ˣ��������ִ�в˵�����������
	 */
	public void orderOver(){
		this.menuCommand.execute();
	}
}
