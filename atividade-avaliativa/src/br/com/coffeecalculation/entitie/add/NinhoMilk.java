package br.com.coffeecalculation.entitie.add;

import br.com.coffeecalculation.entitie.coffeeshop.Add;

public class NinhoMilk implements Add {
	
	private final double NINHO_MILK = 1.40;
	
	@Override
	public double calculate(int value) {
		return NINHO_MILK;
	}

}
