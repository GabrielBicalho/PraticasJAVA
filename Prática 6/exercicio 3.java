import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int index, menor, maior;
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

		// Mostra o menor e o maior valor informado.
		menor = vetor[0];
		maior = vetor[0];
		for (index = 1; index < vetor.length; index++) {
			if (vetor[index] < menor) {
				menor = vetor[index];
			} else {
				for (index = 1; index < vetor.length; index++) {
					if (vetor[index] > maior) {
						maior = vetor[index];
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Menor valor informado: " + menor);
		JOptionPane.showMessageDialog(null, "Maior valor informado: " + maior);
	}
}
