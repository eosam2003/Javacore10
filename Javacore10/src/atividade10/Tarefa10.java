package atividade10;

import java.util.Scanner;

public class  Tarefa10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor indique um valor minimo:");
		float min = scanner.nextFloat();
		System.out.println("Agora indique um valor máximo:");
		float max = scanner.nextFloat();
		System.out.printf("Fahrenheit Celsius\n");
		for (float i = min; i <= max; i += .5) {
			System.out.printf("%6.2f     %6.2f%n", i, ((i - 32.0) * (5.0 / 9.0)));
		}
		scanner.close();
	}
}
