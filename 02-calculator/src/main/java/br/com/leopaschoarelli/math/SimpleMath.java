package br.com.leopaschoarelli.math;

import br.com.leopaschoarelli.exception.UnsuportedMathOperationException;

public class SimpleMath {

	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}

	public Double sub(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}

	public Double mul(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}

	public Double div(Double firstNumber, Double secondNumber) {
		if (secondNumber.equals(0d)) {
			throw new UnsuportedMathOperationException("Impossible to divide by 0!");
		}
		return firstNumber / secondNumber;
	}

	public Double mean(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber)/2;
	}

	public Double squareRoot(Double number) {
		return (Double) Math.sqrt(number);
	}

}
