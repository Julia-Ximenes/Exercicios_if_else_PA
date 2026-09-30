package Excercicios_1206;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2,media, notaExame, mediaExame;
		System.out.println("Digite a primeira nota:");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = ler.nextDouble();
		
		media =((nota1+nota2)/2);
		System.out.println("O sua média é: "+media+"");

		if (media > 6) {
		System.out.println("Aprovado");
		
		} if (media <= 3) {
		System.out.println("Reprovado");
		
		}if (media>3 && media<6) {
		System.out.println("Você precisa da nota do exame para caucalar a próxima média");
		System.out.println("digite sua nota no exame");
		notaExame = ler.nextDouble();
		
		mediaExame = ((media+notaExame)/2);
		
		System.out.println("Sua nova media é: "+mediaExame+"");
		
		if (mediaExame>=6) {
		System.out.println("Aprovado");
		
		} else
		System.out.println("Reprovado");
			
		}
	}

}