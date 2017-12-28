package com.eshare.command.example5;
/**
 * ������󣬱�����Ѽ
 */
public class DuckCommand implements Command{
	private CookApi cookApi = null;
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	
	public void execute() {
		this.cookApi.cook("������Ѽ");
	}
}
