import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int index;
		int[] vetor = new int[10];
		String numInt;

		// Inicia a leitura do vetor.
		for (index = 0; index < 10; index++) {
			numInt = JOptionPane.showInputDialog("Informe um número inteiro:");
			vetor[index] = Integer.parseInt(numInt);
		}

		// Mostra na tela o vetor de inteiros.
		numInt = "Vetor informado:\n";
		for (index = 0; index < vetor.length; index++)
			numInt += String.format(" vetor[%d]=%4d\n", index, vetor[index]);
		JOptionPane.showMessageDialog(null, numInt);

		// Mostra as posições com números negativos.
		numInt = "Posições contendo os negativos:\n";
		for (index = 0; index < vetor.length; index++)
			if (vetor[index] < 0)
				numInt += String.format("%d: vetor[%d] = %d\n", index, index, vetor[index]);
		JOptionPane.showMessageDialog(null, numInt);
	}
}
