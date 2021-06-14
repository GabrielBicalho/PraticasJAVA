import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int linha, coluna;
		int[][] matriz = new int[5][5];
		String finalString;

		// Recebe a matriz de inteiros
		for (linha = 0; linha < 5; linha++)
			for (coluna = 0; coluna < 5; coluna++) {
				finalString = JOptionPane.showInputDialog("Informe um nº Inteiro: ");
				matriz[linha][coluna] = Integer.parseInt(finalString);
			}

		imprimir(matriz);

		// Mostra os elementos em posições de linhas pares e colunas impares.
		finalString = "Elementos nas posições de linhas pares e colunas ímpares:\n";
		for (linha = 0; linha < 5; linha += 2) {
			for (coluna = 1; coluna < 5; coluna += 2)
				finalString += String.format("%4d", matriz[linha][coluna]);
			finalString += "\n";
		}
		JOptionPane.showMessageDialog(null, finalString);

		// Mostra a matriz transposta em tela.
		finalString = "Matriz Transposta informada:\n";
		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 5; coluna++)
				finalString += String.format("%4d", matriz[coluna][linha]);
			finalString += "\n";
		}
		JOptionPane.showMessageDialog(null, finalString);

		// Troca os valores da diagonal principal com diagonal secundaria.
		for (linha = 0; linha < 5; linha++) {
			int pos = (matriz[linha].length - 1) - linha;
			int temp = matriz[linha][pos];
			matriz[linha][pos] = matriz[linha][linha];
			matriz[linha][linha] = temp;
		}

		imprimir(matriz);

	}

	public static void imprimir(int mat[][]) {
		// Mostra a matriz em tela
		int linha, coluna;
		String finalString;
		finalString = "Matriz informada:\n";
		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 5; coluna++)
				finalString += String.format("%4d", mat[linha][coluna]);
			finalString += "\n";
		}
		JOptionPane.showMessageDialog(null, finalString);
	}
}
 
