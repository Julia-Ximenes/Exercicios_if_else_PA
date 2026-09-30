package Excercicios_1206;

import java.util.Scanner;

public class Ano_Bissexeto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano;
		System.out.println("digite o ano");
		ano = ler.nextInt();
		
		if (ano == 0) {
		if (ano % 4 == 0) {
		System.out.println("O ano é bissexto");
			
		} else {
		System.out.println("O ano não é bissexto");
		}
	}

	}
}