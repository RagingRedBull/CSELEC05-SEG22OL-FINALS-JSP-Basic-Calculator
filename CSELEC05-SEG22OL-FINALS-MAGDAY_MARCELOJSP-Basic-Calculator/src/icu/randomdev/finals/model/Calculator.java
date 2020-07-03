package icu.randomdev.finals.model;

import icu.randomdev.finals.enums.ErrorMessages;
import icu.randomdev.finals.exceptions.InvalidOptionException;

public class Calculator {
	private double firstInput;
	private double secondInput;
	private int operationCode;

	public Calculator() {
		this.firstInput = 0;
		this.secondInput = 0;
		this.operationCode = 0;
	}

	public Calculator(double firstInput, double secondInput, int operationCode) {
		this.firstInput = firstInput;
		this.secondInput = secondInput;
		this.operationCode = operationCode;
	}

	public double getFirstInput() {
		return firstInput;
	}

	public void setFirstInput(double firstInput) {
		this.firstInput = firstInput;
	}

	public double getSecondInput() {
		return secondInput;
	}

	public void setSecondInput(double secondInput) {
		this.secondInput = secondInput;
	}

	public int getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(int operationCode) {
		this.operationCode = operationCode;
	}

	/* Domain Functions */
	public boolean validateInputs() {
		boolean isValidInputs = true;
		if (operationCode > 3 || operationCode < 0) {
			throw new InvalidOptionException(ErrorMessages.INVALID_INPUT.getMsg());
		}
		// input 2 should not be 0
		if (secondInput == 0 && operationCode == 3) {
			throw new ArithmeticException(ErrorMessages.DIVISION_BY_ZERO.getMsg());
		}
		return isValidInputs;
	}

	public double doOperation() {
		double answer = 0;
		switch (operationCode) {
		case 0:
			answer = doAddition();
			break;
		case 1:
			answer = doSubtraction();
			break;
		case 2:
			answer = doMultiplication();
			break;
		case 3:
			answer = doDivision();
		default:
			break;
		}
		return answer;
	}

	private double doAddition() {
		return this.firstInput + this.secondInput;
	}

	private double doSubtraction() {
		return this.firstInput - this.secondInput;
	}

	private double doMultiplication() {
		return this.firstInput * this.secondInput;
	}

	private double doDivision() {
		return this.firstInput / this.secondInput;
	}
}
