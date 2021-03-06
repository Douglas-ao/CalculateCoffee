package br.com.coffeecalculation.entitie.drinkenums;

import br.com.coffeecalculation.entitie.coffeeshop.Drink;
import br.com.coffeecalculation.entitie.drink.Coffee;
import br.com.coffeecalculation.entitie.drink.CoffeeWithMilk;
import br.com.coffeecalculation.entitie.drink.EspressoPanna;
import br.com.coffeecalculation.entitie.drink.MilkWithChocolate;
import br.com.coffeecalculation.entitie.drink.Mocha;

public enum DrinkEnum {
	COFFEE {
		@Override
		public Drink getDrinkEnum(int value) {
			return new Coffee();
		}
	},
	COFFEE_WITH_MILK {

		@Override
		public Drink getDrinkEnum(int value) {
			return new CoffeeWithMilk();
		}

	},
	MILK_WITH_CHOCOLAT {
		
		@Override
		public Drink getDrinkEnum(int value) {
			return new MilkWithChocolate();
		}

	},
	MOCHA {
		
		@Override
		public Drink getDrinkEnum(int value) {
			return new Mocha();
		}
	},
	ESPRESSO_PANNA {
		@Override
		public Drink getDrinkEnum(int value) {
			return new EspressoPanna();
		}
	};

	public abstract Drink getDrinkEnum(int value);

}
