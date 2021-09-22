package br.com.coffeecalculation.entitie.add;

import br.com.coffeecalculation.entitie.coffeeshop.Add;

public class ChocolatePowder implements Add {
	
	private final double CHOCOLATE_POWDER = 1.50;
	
	@Override
	public double calculate(int value) {
		return CHOCOLATE_POWDER;
	}

}
