package br.com.coffeecalculation.entitie.drink;

import br.com.coffeecalculation.entitie.coffeeshop.Drink;

public class Coffee implements Drink {
	
	private final double COFFEE = 1.50;

	@Override
	public double calculate(int value) {
		return COFFEE;
	}
	
	

}
