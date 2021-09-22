package br.com.coffeecalculation.entitie.drink;

import br.com.coffeecalculation.entitie.coffeeshop.Drink;

public class CoffeeWithMilk implements Drink {
	private final double COFFEE_WITH_MILK = 1.75;

	@Override
	public double calculate(int value) {
		return COFFEE_WITH_MILK;
	}

}
