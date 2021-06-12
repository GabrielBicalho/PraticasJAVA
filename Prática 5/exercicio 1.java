importação java.util.Scanner;  // 1. importando um scanner de classe

exercicio_01 de classe pública {

  público estático vazio principal(String[] args) {
    int i = 0, cont = 0;
    duplo num;
    Scanner ler = novo Scanner(Sistema. em);  // 2. instanciando e criando um objeto um scanner

    para(i = 0; i< 10; i++){
        Sistema. para fora. printf("Informe o um número: " );
 num = ler. nextDouble();  // 3. entrada de dados (lendo um valor duplo)
            
        se (num < 0) 
 Cont++;
    }
    Sistema. para fora. printf(\nQuantidade de Números Negativos: "  + cont);
  }

}