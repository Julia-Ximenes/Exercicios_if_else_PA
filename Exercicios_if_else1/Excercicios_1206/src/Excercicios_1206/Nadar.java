package Excercicios_1206;

import java.util.Scanner;

public class Nadar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("digite sua idade");
		idade = ler.nextInt();
		
		if (idade <= 8) {
			System.out.println("Infantil");
			
		}	else if (idade < 14) {
		System.out.println("Juvenil A");
			
		} else if  (idade <=17){
		System.out.println("Juvenil B");
		
		} else {
			System.out.println("Adulto");
		}
	}

}

