package atividade10;

import java.util.Scanner;

public class Tarefa08{
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cálculo de potência");

		System.out.println("Entre com a base");
		int base = sc.nextInt();

		System.out.println("Entre com o expoente");
		int exp = sc.nextInt();

		int potencia = 1;
		int count = 1;

		while (count <= exp) {
			potencia *= base;
			count++;
		}
		System.out.println(base + " ^ " + exp + " = " + potencia);
		sc.close();
	}
}
