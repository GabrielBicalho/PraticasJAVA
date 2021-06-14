principal pacote;

importação java.util.Scanner;

 classe pública principal {
	

	público estático vazio principal(String[] args) {
	    duplo a, b, c;
	 
 a = lerNumero("Informe o 1 coeficiente: " );
 b = lerNumero("Informe o 2 coeficiente: " );
 c = lerNumero("Informe o 3 coeficiente: " );
	    
		CálculoCoeficiente cálculo = novo CalculaCoeficiente();
	    
 cálculo. setA(a);
 cálculo. setB(b);
 cálculo. setC(c);
	    
	    Sistema. para fora. println (cálculo. executaCalculo());

	}
	
	privado estático duplo lerNumero(String titulo) {
	    Scanner ler = novo Scanner(Sistema. em);
		valor duplo;
	    Sistema. para fora. printf(titulo);
 valor = ler. nextDouble();
	    valor de retorno;
	}

}