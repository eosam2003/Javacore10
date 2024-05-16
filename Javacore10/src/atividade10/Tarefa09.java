package atividade10;

public class  Tarefa09 {
	public static void main(String[] Args) {
		int anterior = 1, posterior = 1, auxiliar, contadora = 1;

		do {

			System.out.print(anterior + " ");
			auxiliar = anterior + posterior;
			anterior = posterior;
			posterior = auxiliar;
			contadora++;
		} while (contadora <= 15);

	}
}
