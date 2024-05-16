package atividade10;

import javax.swing.JOptionPane;

public class  Tarefa07{
	public class PotenciasDe3variandoDe1a15 {
		public static void main(String[] args) {
			String total = "";
			int i;
			int j;
			int n3 = 3;

			for (i = 1; i <= 15; i++) {
				if (i == 1) {
					total += "3 elevado a " + i + " é " + n3 + "\n";
					i++;
				}
				n3 *= 3;
				total += "3 elevado a " + i + " é " + n3 + "\n";
			}
			JOptionPane.showMessageDialog(null, total, "RESULTADO", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
