package br.com.coffeecalculation.entitie.drinkenums;

import br.com.coffeecalculation.entitie.coffeeshop.Size;
import br.com.coffeecalculation.entitie.size.Great;
import br.com.coffeecalculation.entitie.size.Litle;
import br.com.coffeecalculation.entitie.size.Medium;

public enum SizeEnum {
	
	LITLE {
		@Override
		public Size getSizeEnum(int value) {
			return new Litle();
		}
	},
	
	MEDIUM {
		@Override
		public Size getSizeEnum(int value) {
			return new Medium();
		}	
	},
	GREAT {
		@Override
		public Size getSizeEnum(int value) {
			return new Great();
		}	
	};
	
	public abstract Size getSizeEnum(int value);

}
