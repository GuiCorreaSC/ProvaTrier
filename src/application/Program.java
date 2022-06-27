package application;

import java.util.Locale;

import entities.ItemDeVenda;
import entities.Produto;
import entities.StatusVenda;
import entities.Venda;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Produto p1 = new Produto(123, "Dorflex", 5);
		Produto p2 = new Produto(2054, "Anador", 8);
		Produto p3 = new Produto(54, "Rivotril", 7);

		ItemDeVenda i1 = new ItemDeVenda(545, p1, 1, 10.99);
		ItemDeVenda i2 = new ItemDeVenda(5640, p2, 10, 20.98);
		ItemDeVenda i3 = new ItemDeVenda(456, p3, 12, 8.90);

		Venda v1 = new Venda(1, 150.54, i1, StatusVenda.EM_ANDAMENTO);

		System.out.println(v1);
	}
}
