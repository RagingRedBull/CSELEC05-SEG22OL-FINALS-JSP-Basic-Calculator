package icu.randomdev.finals.model;

public class Calculator {
	private double firstInput;
	private double secondInput;
	
	public Calculator() {
		this.firstInput = 0;
		this.secondInput = 0;
	}
	
	public Calculator(double firstInput, double secondInput) {
		this.firstInput = firstInput;
		this.secondInput = secondInput;
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
	
	/* Domain Functions */
	public double doAddition() {
		return this.firstInput + this.secondInput;
	}
	public double doSubtraction() {
		return this.firstInput - this.secondInput;
	}
	public double doMultiplication() {
		return this.firstInput * this.secondInput;
	}
	public double doDivision() {
		return this.firstInput / this.secondInput;
	}
}
