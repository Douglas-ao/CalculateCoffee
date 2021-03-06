package br.com.coffeecalculation.runn;

import javax.swing.JOptionPane;

import br.com.coffeecalculation.entitie.coffeeshop.Add;
import br.com.coffeecalculation.entitie.coffeeshop.Drink;
import br.com.coffeecalculation.entitie.coffeeshop.Size;
import br.com.coffeecalculation.entitie.drinkenums.AddEnum;
import br.com.coffeecalculation.entitie.drinkenums.DrinkEnum;
import br.com.coffeecalculation.entitie.drinkenums.SizeEnum;

public class Main {

	public static void main(String[] args) {

		double returnValueAdd = 1;
		double adds = 0;

		String[] buttons = { "Caf?", "Caf? com Leite", "Leite com Chocolate", "Mocha", "Espresso Panna", "Cancelar" };
		int returnValue = JOptionPane.showOptionDialog(null, "Escolha um tipo de bebida para prosseguir: ",
				"Escolha de bebidas", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);

		DrinkEnum drinkEnum = DrinkEnum.values()[returnValue];
		Drink drink = drinkEnum.getDrinkEnum(returnValue);

		String[] button = { "Pequeno", "M?dio", "Grande", "Cancelar" };
		int returnValueSize = JOptionPane.showOptionDialog(null, "Escolha o tamanho para prosseguir: ",
				"Escolha de tamanhos", JOptionPane.WARNING_MESSAGE, 0, null, button, button[0]);

		SizeEnum sizeEnum = SizeEnum.values()[returnValueSize];
		Size size = sizeEnum.getSizeEnum(returnValueSize);

		while (returnValueAdd > 0) {
			String[] buttonAdd = { "Raspas de lim?o", "Canela em p?", "Leite ninho (colher)", "Gelo de creme de leite",
					"Leite condensado (colher)", "Chocolate em p? (colher)", "Cookie", "Finalizar" };
			returnValueAdd = JOptionPane.showOptionDialog(null, "Escolha quantos adicionais quiser: ",
					"Escolha os adicionais", JOptionPane.WARNING_MESSAGE, 0, null, buttonAdd, buttonAdd[0]);

			AddEnum addEnum = AddEnum.values()[(int) returnValueAdd];
			Add add = addEnum.getAddEnum((int) returnValueAdd);
			adds = adds + add.calculate(0);
			returnValueAdd = add.calculate(0);
		}

		double drinks = drink.calculate(0);
		double totalSize = drinks * size.calculate(0) / 100;
		double total = drinks + totalSize + adds;

		JOptionPane.showMessageDialog(null, "Valor Total: " + String.format("%.2f", total));
	}
}
