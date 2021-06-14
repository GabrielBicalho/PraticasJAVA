importação java.util.Scanner;  // 1. importando um scanner de classe

exercicio_nao_refatorado de classe pública{

  público estático vazio principal(String[] args) {
    duplo a, b, c, delta;

    Scanner ler = novo Scanner(Sistema. em);  // 2. instanciando e criando um objeto um scanner
 
    // 3. entrada de dados (lendo um valor duplo)
    Sistema. para fora. printf("Informe o 1 coeficiente: " );
 a = ler. nextDouble();

    Sistema. para fora. printf("Informe o 2 coeficiente: " );
 b = ler. nextDouble();

    Sistema. para fora. printf("Informe o 3 coeficiente: " );
 c = ler. nextDouble();

    se (a == 0){
        se (b == 0){
            se (c == 0){
                Sistema. para fora. printf("\nIgualdadeConfirmada". );
            } mais{
                Sistema. para fora. printf("\nCoeficientes informados incorretamente" );
        
            }
        }
        mais{
            Sistema. para fora. printf("\nEsta é uma equação de 1 grau. " );
            Sistema. para fora. printf("\nRaiz quadrada: "  + (c / b));
        }
    }
    mais {
        Sistema. para fora. printf("\nEsta é uma equação de 2 grau. " );
 delta = Matemática. pow(b, 2) - 4 * a * c;

        se (delta < 0){
            Sistema. para fora. printf( "\nEsta equação nao tem raizes reais pois \ndelta < 0" );
        }
        mais se (delta == 0 ) {
            Sistema. para fora. printf("\nEsta equação possui 2 raizes reais iguais pois \ndelta = 0 \nx' = x '' = "  + (b / ( (2 * a));
        } 
        mais {
            Sistema. para fora. printf( "\nEsta equação possui 2 raizes reais diferentes pois \ndelta: "  + delta + 
                                 " \nx': "  + ((-b + Matemática. sqrt(delta)) / 2 * a) +
                                 "\nx'': "  + ((-b - Matemática. sqrt(delta)) / 2 * a));
        }
    }








  }

}