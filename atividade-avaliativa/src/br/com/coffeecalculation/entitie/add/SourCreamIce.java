package br.com.coffeecalculation.entitie.add;

import br.com.coffeecalculation.entitie.coffeeshop.Add;

public class SourCreamIce implements Add{
	
	private final double SOUR_CREAM_ICE = 1.75;

	@Override
	public double calculate(int value) {
		return SOUR_CREAM_ICE;
	}

}
