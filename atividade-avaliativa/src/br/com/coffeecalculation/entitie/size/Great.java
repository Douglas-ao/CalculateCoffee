package br.com.coffeecalculation.entitie.size;

import br.com.coffeecalculation.entitie.coffeeshop.Size;

public class Great implements Size {
	
	private final int GREAT = 35;
	
	@Override
	public double calculate(int value) {
		return GREAT;
	}

}
