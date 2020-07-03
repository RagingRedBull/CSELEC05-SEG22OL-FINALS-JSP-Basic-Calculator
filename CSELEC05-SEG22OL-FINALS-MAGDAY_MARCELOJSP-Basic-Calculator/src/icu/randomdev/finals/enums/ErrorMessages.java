package icu.randomdev.finals.enums;

public enum ErrorMessages {
	DIVISION_BY_ZERO("Second input cannot be 0."),
	INVALID_INPUT("One of the inputs is invalid."),
	INVALID_OPERATOR("Invalid operator selected.");
	
	private String msg;
	private ErrorMessages(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
}
