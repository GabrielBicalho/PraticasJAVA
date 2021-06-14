
pacote refatoracao;

classe pública Refatoracao03 {

   público estático vazio principal(String[] args) {
       vetor duplo1[] = { 90, 88, 78, 76 };
       vetor duplo2[] = { 865, 564, 43, 12 };

       resultadosma duplo;
       resultadosoma1 duplo;

       Soma soma = novo Soma();
       Mídia de mídia = nova mídia();

resultadosoma = soma. somaNumVetor(vetor1);
resultadosoma1 = soma. somaNumVetor(vetor2);

       Sistema. para fora. println (soma. somaNumVetor(vetor1));
       Sistema. para fora. println (soma. somaNumVetor(vetor2));

       Sistema. para fora. println (mídia. calcularMedia(resultadosoma));
       Sistema. para fora. println (mídia. calcularMedia(resultadosoma1););

   }

}