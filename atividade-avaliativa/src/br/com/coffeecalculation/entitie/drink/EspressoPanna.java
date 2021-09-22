package br.com.coffeecalculation.entitie.drink;

import br.com.coffeecalculation.entitie.coffeeshop.Drink;

public class EspressoPanna implements Drink{
	
	private final double ESPRESSO_PANNA = 4.50;

	@Override
	public double calculate(int value) {
		return ESPRESSO_PANNA;
	}

}
