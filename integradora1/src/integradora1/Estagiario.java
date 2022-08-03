package integradora1;

public class Estagiario extends Vendedor{

    public Estagiario(String nome){
        super.setNome(nome);
        super.setPONTOS_POR_VENDA(5);
    }
	
	@Override
	public int calcularPontos() {
		return super.getVendas() * super.getPONTOS_POR_VENDA();
	}
	
	@Override
	public String mostrarCategoria()
	{
    	int pontos = this.calcularPontos();
    	String categoria = "";
    	
    	if(pontos < 50)
    		categoria = "Estagiario Novato";
    	else 
    		categoria = "Estagiario Experiente";
    	
    	return "O vendedor " + super.getNome() + " tem " + pontos + " pontos e esta na categoria " + categoria;
	}

}
