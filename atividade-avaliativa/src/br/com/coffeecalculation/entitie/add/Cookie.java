package br.com.coffeecalculation.entitie.add;

import br.com.coffeecalculation.entitie.coffeeshop.Add;

public class Cookie implements Add {
	
	private final double COOKIE = 0.90;

	@Override
	public double calculate(int value) {
		return COOKIE;
	}

}
