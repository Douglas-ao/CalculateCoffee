package br.com.coffeecalculation.entitie.drink;

import br.com.coffeecalculation.entitie.coffeeshop.Drink;

public class MilkWithChocolate implements Drink{
	private final double MILK_WITH_CHOCOLATE = 2.50;

	@Override
	public double calculate(int value) {
		return MILK_WITH_CHOCOLATE;
	}

}
