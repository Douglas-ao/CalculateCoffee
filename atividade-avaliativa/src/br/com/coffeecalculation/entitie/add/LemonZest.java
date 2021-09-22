package br.com.coffeecalculation.entitie.add;

import br.com.coffeecalculation.entitie.coffeeshop.Add;

public class LemonZest implements Add{
	
	private final double LEMON_ZEST = 0.50;

	@Override
	public double calculate(int value) {
		return LEMON_ZEST;
	}

}
