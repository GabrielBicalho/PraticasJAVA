import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int index, soma = 0;
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

		// Somar valores pares do vetor:
		for (int numPar : vetor)
			if (numPar % 2 == 0)
				soma += numPar;
		JOptionPane.showMessageDialog(null, "Soma dos números pares do vetor: " + soma);
	}
}
