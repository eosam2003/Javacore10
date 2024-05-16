package atividade10;

import javax.swing.JOptionPane;

public class Tarefa03 {
	public static void main(String args[]) {
		int soma = 0;
		for (int i = 0; i <= 100; i++) {
			soma += i;
		}
		JOptionPane.showMessageDialog(null, "Somatório:" + soma);
	}
}
