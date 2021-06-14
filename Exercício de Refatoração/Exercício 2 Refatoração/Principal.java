loja pacote ;

importação java.time.DayOfWeek;
importação java.time.LocalDate;
importar java.util.ArrayList;
importação loja. Produto;
importação loja. Relatorio;

 classe pública Principal {

    público estático vazio principal(String[] args) {
        cliente booleanoVIP = falso;
        Produto p1 = novo Produto("Arroz", 5, 18.75);
        Produto p2 = novo Produto("Feijão", 1, 4.95);
        Produto p3 = novo Produto("Leite", 1, 3.49);
        ArrayList<Produto> produtos =  nova ArrayList();
 produtos. adicionar(p1);
 produtos. adicionar(p2);
 produtos. adicionar(p3);

        Relatorio relatorio = novo Relatorio();
        
 relatorio. somaPrecos(produtos);
 relatorio. taxaEntrega();
 relatorio. aplicarDesconto();
 relatorio. total();
        
    }
}