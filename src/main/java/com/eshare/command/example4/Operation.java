package com.eshare.command.example4;
/**
 * �����࣬����ʵ�ּӼ�������
 */
public class Operation implements OperationApi{
	/**
	 * ��¼����Ľ��
	 */
	private int result;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public void add(int num){
		//ʵ�ּӷ�����
		result += num;
	}
	public void substract(int num){
		//ʵ�ּ�������
		result -= num;
	}
}
