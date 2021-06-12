importação java.util.Scanner;  // 1. importando um scanner de classe

public class exercicio_04 {

  público estático vazio principal(String[] args) {
    int i, numero;
    gordura dupla = 1;
    Resposta de cordas;

    Scanner ler = novo Scanner(Sistema. em);  // 2. instanciando e criando um objeto um scanner

    fazer {
        Sistema. para fora. printf("Informe o numero: " );
 resposta = ler. seguinte();
 numero = Inteiro. parseInt(resposta);
        se (numero < 0)
            Sistema. para fora. printf("Numero inválido" );

    } enquanto (numero < 0);
    
    para(i = numero; i > 0; i--)
 gordura *= i;
        
    Sistema. para fora. printf (String. formato("%d! = %.0f", numero, gordura));

  }

}