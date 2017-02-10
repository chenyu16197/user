package com.web.network.result.base;

public class BaseResult {

	private Boolean isSuccess = false;
	private Object items;
	private String message;

	public Boolean isSuccess() {
		return isSuccess;
	}
	public void isSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Object getItems() {
		return items;
	}
	public void setItems(Object items) {
		this.items = items;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
