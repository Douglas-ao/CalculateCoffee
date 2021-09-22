package br.com.coffeecalculation.entitie.size;

import br.com.coffeecalculation.entitie.coffeeshop.Size;

public class Medium implements Size{

	private final int MEDIUM = 20;
	
	@Override
	public double calculate(int value) {
		return MEDIUM;
	}

}
