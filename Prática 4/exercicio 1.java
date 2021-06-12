importação java.util.Scanner;  // 1. importando um scanner de classe

exercicio_01 de classe pública {

  público estático vazio principal(String[] args) {
    int falta = 0,
    contadorAlunosNotaMaiorIgual90 = 0,
    contadorAlunosReprovados = 0,
    contadorNotas = 0;
    nota dupla = 0, menorNota = 0, maiornota = 0, somaNotas = 0;
    Resposta de cordas;

    Scanner ler = novo Scanner(Sistema. em);  // 2. instanciando e criando um objeto um scanner

    Sistema. para fora. printf( "Informe o valor a nota [0 a 100]: nota menor que zero fecha o programa: " );
 resposta = ler. seguinte();
 nota = Duplo. parseDouble(resposta);

    menorNota = nota;
    maiornota = nota;

    enquanto(nota >= 0 ){
        Sistema. para fora. printf( "Informe o valor a numero de faltas [0 a 150]:" );
 resposta = ler. seguinte();

 falta = Inteiro. parseInt(resposta);

        se(nota >= 90)
            contadorAlunosNotaMaiorIgual90++;

        se( nota < 70 || falta > 20)
            contadorAlunosReprovados++;

        se(nota < menorNota)
            menorNota = nota;

        se( nota > maiornota)
            maiornota = nota;

        contadorNotas++;
        somaNotas += nota;

        Sistema. para fora. printf( "Informe o valor a nota [0 a 100]: nota menor que zero fecha o programa: " );
 resposta = ler. seguinte();
 nota = Duplo. parseDouble(resposta);

    }

    Sistema. para fora. printf("\nResultados:\n" );
    Sistema. para fora. printf("\nAlunos com nota superior a 90: " +  contadorAlunosNotaMaiorIgual90); 
    Sistema. para fora. printf("\nAlunos reprovados: "  + contadorAlunosReprovados);
    Sistema. para fora. printf("\nMenor nota: "  + menorNota);
    Sistema. para fora. printf("\nMaior nota: "  + maiornota);
    Sistema. para fora. printf("\nMédia das notas: "  + (duplo) somaNotas / (duplo) contadorNotas);

  }

}