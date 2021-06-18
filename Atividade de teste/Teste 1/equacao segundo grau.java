pacote equacao;

 classe pública EquacaoSegundoGrau {
	duplo a, b, c;

	 equacaoSegundoGrau público() {

	}

	público EquacaoSegundoGrau(duplo a, duplo b, duplo c) {
		isso. a = a;
		isso. b = b;
		isso. c = c;
	}

	público duplo getDelta() {
		devolver Matemática. pow(isso. b, 2) - 4 * isso. a * isso. c;
	}

	público duplo getX() {
		retorno -isso. b / (2 * isso. a);
	}

	público duplo getX1() {
		retorno (-isso. b + Matemática. sqrt(isso. getDelta()) / (2 * isso. a);
	}

	público duplo getX2() {
		retorno (-isso. b - Matemática. sqrt(isso. getDelta()) / (2 * isso. a);
	}
}