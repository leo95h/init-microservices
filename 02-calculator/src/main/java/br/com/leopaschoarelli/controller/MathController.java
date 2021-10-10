package br.com.leopaschoarelli.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.leopaschoarelli.exception.UnsuportedMathOperationException;
import br.com.leopaschoarelli.math.SimpleMath;
import br.com.leopaschoarelli.request.converters.NumberConverter;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
	
		return math.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
	
		return math.sub(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/mul/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double mul(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
	
		return math.mul(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
	
		return math.div(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/mean/{numberOne}/{numberTwo}",method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
	
		return math.mean(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/squareRoot/{number}",method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) throws Exception{
		if (!NumberConverter.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
	
		return math.squareRoot(NumberConverter.convertToDouble(number));
	}

}
