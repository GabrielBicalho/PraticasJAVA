principal pacote;

importação equacao. Equacao;
importação java.util.Locale;

 classe pública Principal {

	público estático vazio principal(String[] args) {
		Equacao equacao;

 equacao = novo Equacao(0, 0, 0);
		Sistema. para fora. println(equacao. calcularEquacao());

 equacao = novo Equacao(0, 0, 8);
		Sistema. para fora. println(equacao. calcularEquacao());

 equacao = novo Equacao(0, 2, -8);
		Sistema. para fora. println(equacao. calcularEquacao());

 equacao = novo Equacao(10, -4, 12);
		Sistema. para fora. println(equacao. calcularEquacao());

 equacao = novo Equacao(4, -4, 1);
		Sistema. para fora. println(equacao. calcularEquacao());

 equacao = novo Equacao(1, 6, 7);
		Sistema. para fora. println(equacao. calcularEquacao());
