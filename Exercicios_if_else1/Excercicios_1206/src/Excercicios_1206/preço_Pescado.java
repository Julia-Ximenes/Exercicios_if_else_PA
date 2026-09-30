package Excercicios_1206;

import java.util.Scanner;

public class preço_Pescado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double quantKg, preco, enc ;
		System.out.println("digite a quantidade de peixe(s) por kg");
		quantKg = ler.nextDouble();
		
		
		if (quantKg < 10) {
		preco = 12;
		
		} else {
			preco = 10;
		}
		enc = quantKg*preco;
		System.out.println("O preço da compra será "+enc+"");
	}

	}
