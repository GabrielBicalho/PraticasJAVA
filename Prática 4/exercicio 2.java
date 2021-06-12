importação java.util.Scanner;  // 1. importando um scanner de classe

public class exercicio_02 {

  público estático vazio principal(String[] args) {
    canal int = 0,
    totalPessoas = 0,
    pessoasCanal4 = 0,
    pessoasCanal5 = 0,
    pessoasCanal7 = 0,
    pessoasCanal12 = 0;
    Resposta de cordas;

    Scanner ler = novo Scanner(Sistema. em);  // 2. instanciando e criando um objeto um scanner

    Sistema. para fora. printf( "Informe o canal [4, 5, 7, 12]: " );
 resposta = ler. seguinte();
 canal = Inteiro. parseInt(resposta);

    enquanto(canal != 0 ){
        switch(canal){
            caso 4:
                Sistema. para fora. printf( "Informe o numero de pessoas assistindo ao canal 4: " );
 resposta = ler. seguinte();
 pessoasCanal4 += Inteiro. parseInt(resposta);
 totalPessoas += Inteiro. parseInt(resposta);
                quebrar;
            caso 5:
                Sistema. para fora. printf( "Informe o numero de pessoas assistindo ao canal 5: " );
 resposta = ler. seguinte();
 pessoasCanal5 += Inteiro. parseInt(resposta);
 totalPessoas += Inteiro. parseInt(resposta);
                quebrar;
            case 7:
                Sistema. para fora. printf( "Informe o numero de pessoas assistindo ao canal 7: " );
 resposta = ler. seguinte();
 pessoasCanal7 += Inteiro. parseInt(resposta);
 totalPessoas += Inteiro. parseInt(resposta);
                quebrar;
            case 12:
                Sistema. para fora. printf( "Informe o numero de pessoas assistindo ao canal 12: " );
 resposta = ler. seguinte();
 pessoasCanal12 += Inteiro. parseInt(resposta);
 totalPessoas += Inteiro. parseInt(resposta);
                quebrar;
        }
        Sistema. para fora. printf( "Informe o canal [4, 5, 7, 12]: " );
 resposta = ler. seguinte();
 canal = Inteiro. parseInt(resposta);

    }

    Sistema. para fora. printf("\nResultados:\n" );
    Sistema. para fora. printf("\nTotal Pessoas no Canal %3d: Total de Pessoas: %3d - Representando: %9,2f%",4, pessoasCanal4, ((dupla ) pessoasCanal4 / (totalPessoas)) * 100 );
    Sistema. para fora. printf("\nTotal Pessoas no Canal %3d: Total de Pessoas: %3d - Representando: %9,2f%",5, pessoasCanal5, ((dupla ) pessoasCanal5 / (totalPessoas)) * 100 );
    Sistema. para fora. printf("\nTotal Pessoas no Canal %3d: Total de Pessoas: %3d - Representando: %9,2f%",7, pessoasCanal7, ((dupla ) pessoasCanal7 / (totalPessoas)) * 100 );
    Sistema. para fora. printf("\nTotal Pessoas no Canal %3d: Total de Pessoas: %3d - Representando: %9,2f%",12, pessoasCanal12, ((dupla ) pessoasCanal12 / (totalPessoas)) * 100 );

  }

}