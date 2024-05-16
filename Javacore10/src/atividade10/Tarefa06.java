package atividade10;

import javax.swing.JOptionPane;

public class  Tarefa06 {
	public class NumerosDivisiveisPor4menorque200 {
		public static void main(String[] args) {

			String total = "";
			int i;

			for (i = 1; i < 200; i++) {
				if (i % 4 == 0)
					total += i + ",";
			}

			JOptionPane.showMessageDialog(null, total, "RESULTADO", JOptionPane.PLAIN_MESSAGE);

		}
	}
}
