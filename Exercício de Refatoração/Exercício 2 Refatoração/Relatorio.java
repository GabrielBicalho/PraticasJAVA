loja pacote ;

importação java.time.DayOfWeek;
importação java.time.LocalDate;
importar java.util.ArrayList;

 classe pública Relatorio implementa InterfaceRelatorio {

    total duplo = 0,0;
    ArrayList<Produto> produtos;

    @Override
    público duplo somaPrecos(ArrayList<Produto> produtos) {
        
        ( Produto produto : produtos) {
 total += produto. getPreco() * produto. getQuantidade();
        }
        retorno total;
    }

    @Override
    público duplo aplicarDesconto() {
        cliente booleanoVIP = falso;

        se (clienteVIP) {
 total *= 0,90;
        } mais {
 total *= 0,95;
        }
        retorno total;
    }

    @Override
     vazio público taxaEntrega() {
        DayOfWeek diaSemana = LocalDate. agora(). getDayOfWeek();
        se (diaSemana == DayOfWeek. DOMINGO) {
 total += 10,00;
        } mais {
 total += 5,00;
        }
    }

     vazio público total() {
        Sistema. para fora. println (total);

    }

}