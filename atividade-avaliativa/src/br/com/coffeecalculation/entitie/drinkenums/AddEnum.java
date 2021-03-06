package br.com.coffeecalculation.entitie.drinkenums;

import br.com.coffeecalculation.entitie.add.ChocolatePowder;
import br.com.coffeecalculation.entitie.add.CinnamonPowder;
import br.com.coffeecalculation.entitie.add.CondensedMilk;
import br.com.coffeecalculation.entitie.add.Cookie;
import br.com.coffeecalculation.entitie.add.LemonZest;
import br.com.coffeecalculation.entitie.add.NinhoMilk;
import br.com.coffeecalculation.entitie.add.None;
import br.com.coffeecalculation.entitie.add.SourCreamIce;
import br.com.coffeecalculation.entitie.coffeeshop.Add;

public enum AddEnum {
	
	LEMONZEST {
		@Override
		public Add getAddEnum(int value) {
			return new LemonZest();
		}
	} ,
	CINNAMONP_POWDER {
		@Override
		public Add getAddEnum(int value) {
			return new CinnamonPowder();
		}
	},
	NINHO_MILK {
		@Override
		public Add getAddEnum(int value) {
			return new NinhoMilk();
		}
	},
	SOUR_CREAM_ICE {
		@Override
		public Add getAddEnum(int value) {
			return new SourCreamIce();
		}
	},
	CONDENSED_MILK {
		@Override
		public Add getAddEnum(int value) {
			return new CondensedMilk();
		}
	},
	CHOCOLATE_POWDER {
		@Override
		public Add getAddEnum(int value) {
			return new ChocolatePowder();
		}
	},
	COOKIE {
		@Override
		public Add getAddEnum(int value) {
			return new Cookie();
		}
	},
	NONE {

		@Override
		public Add getAddEnum(int value) {
			return new None();
		}
		
	};
	
	public abstract Add getAddEnum(int value);
	

}
