package br.com.coffeecalculation.entitie.add;

import br.com.coffeecalculation.entitie.coffeeshop.Add;

public class CondensedMilk implements Add {
	
	private final double CONDENSED_MILK = 1.85;

	@Override
	public double calculate(int value) {
		return CONDENSED_MILK;
	}

}
