package br.com.coffeecalculation.entitie.drink;

import br.com.coffeecalculation.entitie.coffeeshop.Drink;

public class Mocha implements Drink{
	
	private final double MOCHA = 4.00;
	
	@Override
	public double calculate(int value) {
		return MOCHA;
	}
	
	

}
