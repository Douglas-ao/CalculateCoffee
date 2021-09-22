package br.com.coffeecalculation.entitie.add;

import br.com.coffeecalculation.entitie.coffeeshop.Add;

public class CinnamonPowder implements Add {
	
	private final double CINNAMON_POWDER = 0.75;

	@Override
	public double calculate(int value) {
		return CINNAMON_POWDER;
	}

}
