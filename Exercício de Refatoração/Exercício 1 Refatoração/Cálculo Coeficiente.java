principal pacote;

classe pública CalculaCoeficiente {
   privado duplo a, b, c, delta;

   conjunto vazio públicoA(duplo a) {
       isso. a = a;
   }

   vazio público  setB(dupla b) {
       isso. b = b;
   }

   conjunto vazio públicoC (duplo c ) {
       isso. c = c;
   }
   
   calculadora dupla privadaDelta () {
       retorno (Matemática. pow(isso. b, 2) - 4 * isso. a * isso. c); 
   }
   
   caclularaizQuadrada dupla privada() {
       retorno (-isso. c / isso. b);

   }
   
    caclula dupla privadaRaizesReaisIguais () {
       retorno (-isso. b / (2 * isso. a));

   }
   
    caclula dupla privadaRaizesReaisDiferentes(positivo booleano  ) {
       se (positivo) {
           retorno (-isso. b + Matemática. sqrt(isso. delta)) / 2 * isso. a);
       } mais {
           retorno (-isso. b - Matemática. sqrt(isso. delta)) / 2 * isso. a);
       }
   }
   
   calculadora de string privadaEquacao1Grau () {
       Retorno de string = nulo;
       se (isso. b == 0){
           se (isso. c == 0){
retorno   = "\nIgualdade Confirmada" ;
           } mais {
retorno   = "\nCoeficientes informados incorretamente" ;
       
           }
       } mais {
retorno   = "\nEsta é uma equação de 1grau. "  +
                        "\nRaiz quadrada: " +  caclulaRaizQuadrada(); 
       }
       retorno retorno;
   }
   
   calculadora de string privadaEquacao2Grau () {
       Retorno de string = nulo;
       
retorno   = "\nEsta é uma equação de 2grau. " ;
       isso. delta = calculadoDelta();

       se (isso. delta < 0){
retorno =  "\nEsta equação nao tem raizes reais pois \ndelta < 0" ;
       } mais se (isso. delta == 0 ) {
retorno =  "\nEsta equação possui 2 raizes reais iguais pois \ndelta = 0 \nx' = x '' = "  + caclulaRaizesReaisIguais();
       } mais {
retorno =  "\nEsta equação possui 2 raizes reais diferentes pois \ndelta: "  + isso. delta + 
                                " \nx': "  + caclulaRaizesReaisDiferentes(verdade) +
                                "\nx'': " +  caclulaRaizesReaisDiferentes(falso );
       }
       retorno retorno;
   }

     executaCalculo de string público() {
       se (isso. a == 0){
           calculado de retornoEquacao1Grau(); 
       } mais {
            calculado de retornoEquacao2Grau();
       }

   }


}