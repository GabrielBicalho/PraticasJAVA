importação java.util.Scanner;  // 1. importando um scanner de classe

public class exercicio_03 {

  público estático vazio principal(String[] args) {
    int i, limInferior, limSuperior;
    Resposta de cordas;

    Scanner ler = novo Scanner(Sistema. em);  // 2. instanciando e criando um objeto um scanner

    Sistema. para fora. printf("Informe o Limite Inferior: " );
 limInferior = ler. nextInt();  // 3. entrada de dados (lendo um valor duplo)

    Sistema. para fora. printf("Informe o Limite Superior: " );
 limSuperior = ler. nextInt();  // 3. entrada de dados (lendo um valor duplo)

    Sistema. para fora. printf("\nResultados:\n" );
    para(i = limInferior; i<= limSuperior; i++){
        
        Sistema. para fora. printf("\n"  + i);
    }

  }

}