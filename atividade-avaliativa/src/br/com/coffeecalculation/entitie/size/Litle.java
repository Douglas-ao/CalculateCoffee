package br.com.coffeecalculation.entitie.size;

import br.com.coffeecalculation.entitie.coffeeshop.Size;

public class Litle implements Size {
	
	private final int LITLE = 0;

	@Override
	public double calculate(int value) {
		return LITLE;
	}

}
