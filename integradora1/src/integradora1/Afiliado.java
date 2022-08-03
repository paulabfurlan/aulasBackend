package integradora1;

public class Afiliado extends Vendedor{

    public Afiliado(String nome){
        super.setNome(nome);
        super.setPONTOS_POR_VENDA(15);
    }

    @Override
    public int calcularPontos() {
        return super.getVendas() * super.getPONTOS_POR_VENDA();
    }
}
