package com.power.sql.generator.model;

/**
 * 公共返回结果
 * @author sunyu
 *
 */
public class CommonResult<T> {
	
	/**
	 * 是否成功
	 */
	private boolean success = false;
	/**
	 * 返回信息
	 */
	private String message;
	/**
	 * 
	 */
	private T data;//数据


	private int code;//错误码
	/**
	 * 默认构造器
	 */
	public CommonResult(){
		
	}
	/**
	 * 
	 * @param success
	 * 			是否成功
	 * @param message
	 * 			返回的消息
	 */
	public CommonResult(boolean success,String message){
		this.success = success;
		this.message = message;
	}
	/**
	 * 
	 * @param success
	 * 			是否成功
	 */
	public CommonResult(boolean success){
		this.success = success;
	}
	/**
	 * 
	 * @param success
	 * 			是否成功
	 * @param message
	 * 			消息
	 * @param data
	 * 			数据
	 */
	public CommonResult(boolean success,String message,T data){
		this.success = success;
		this.message = message;
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
