
pacote refatoracao;

classe pública Soma {

   particular dupla soma;
   público duplo somaNumVetor(duplo[] vetorNum) {
       soma dupla = 0;
       isso. setSoma(soma);
       para (int i = 0; i < 4; i++) {
           soma = soma + vetorNum[i];
       }
       retorno soma;
   }

   vazio público  setSoma( soma dupla) {
       isso. soma = soma;
   }

}