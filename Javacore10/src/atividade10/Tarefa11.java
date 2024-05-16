package atividade10;

import java.util.Scanner;

public class  Tarefa11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	      int i, n, fat;

	      System.out.printf("Informe um numero: ");
	      n = ler.nextInt();

	      fat = 1;
	      for (i=1; i<=n; i++) {
	        fat = fat * i;
	      }
	      System.out.printf("\nO fatorial de %d eh igual a %d.\n", n, fat);
	      ler.close();
	    }	
}
