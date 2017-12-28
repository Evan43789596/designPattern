package com.eshare.command.example9;

public class Invoker {
	public void startPrint(Command cmd){	
		System.out.println("��Invoker�У��������ǰ");
		cmd.execute();
		System.out.println("����������");
	}
}