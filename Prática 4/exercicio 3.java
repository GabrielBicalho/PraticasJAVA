importação java.util.Scanner;  // 1. importando um scanner de classe

public class exercicio_03 {

  público estático vazio principal(String[] args) {
    int somaFilhos = 0, contador = 0;
    salario duplo = 0, somaSalario = 0;
    Resposta de cordas;
    Scanner ler = novo Scanner(Sistema. em);  // 2. instanciando e criando um objeto um scanner


    Sistema. para fora. printf. " Informeo valor o salário, nota menor que zero fechar o programa: " );
 resposta = ler. seguinte();
 salario = Duplo. parseDouble(resposta);

    enquanto( salario > 0 ){
        somaSalario = somaSalario + salario;

        Sistema. para fora. printf.  );
 resposta = ler. seguinte();
 somaFilhos += Inteiro. parseInt(resposta);
        contador++;

        Sistema. para fora. printf. " Informeo valor o salário, nota menor que zero fechar o programa: " );
 resposta = ler. seguinte();
 salario = Duplo. parseDouble(resposta);

    }
    se (contador > 0 ) {
        Sistema. para fora. printf("\nResultados:\n" );
        Sistema. para fora. printf(\nMédia Salarios..: %20.2f",(duplo) somaSalario / (duplo) contador);
        Sistema. para fora. printf(\nMédia Filhos....: %20.2f",(duplo) somaFilhos / (duplo) contador);
    }

  }

}