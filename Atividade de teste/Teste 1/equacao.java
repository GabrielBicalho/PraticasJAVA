pacote equacao;

 classe pública Equacao {

	duplo a, b, c;
	
	 equacao público() {
		
	}

	 equacaopúblico (duplo a, duplo b, duplo c) {
		isso. b = b;
		isso. c = c;
	}

	 cadeia pública calcularEquacao() {
		Resultado da corda = "";
		se (isso. a == 0)
			se (isso. b == 0)
				se (isso. c == 0)
 resultado = ( "Igualdade confirmada 0 = 0 " );
				mais
 resultado = ( "Coeficientes informados incorretamentes" );
			mais
 resultado = isso. equacaoPrimeiroGrau();
		mais
 resultado = isso. equacaoSegundoGrau();

		resultado de retorno;

	}

	  equacaoprimeirograu privado() {
		EquacaoPrimeiroGrau equacao = novo EquacaoPrimeiroGrau(este. b, isso. c);
		sequência de retorno . formato:"Esta ç uma equação do primerio grau: x = %.2f", equacao. getX());
	}

	equacaoSegundoGrau de String privada() {
        EquacaoSegundoGrau equacao = novo EquacaoSegundoGrau(este. a, isso. b, isso. c);
		Resultado da corda = String. formato"Esta e uma equação do segundo grau. " );

		se (equacao. getDelta() < 0)
 resultado += String. formato("A equação nao raizes reais (delta < 0): (delta = %.2f)", equacao. getDelta());
		mais se (equacao. getDelta() == 00)
 resultado += String. formato:"A equacao possui duas raizs reais iguais: x = %.2f", equacao. getX());
		mais
 resultado += String. formato;
					 "Esta equação possui duas raízes reais diferentes: delta = %.2f, x1 = %.2f, x2 = %.2f"
 equacao. getDelta(), equacao. getX1(), equacao. getX2());

		resultado de retorno;

	}


}