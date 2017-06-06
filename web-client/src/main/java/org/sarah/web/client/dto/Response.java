package org.sarah.web.client.dto;
/**
 * The class Response.
 * @author chandan
 */
public class Response {

	int code;
	String message;
	public Response(int code) {
		this.code = code;
	}
	
	public Response(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
