package integradora1;

//validacao que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {

    private String nome;
    private int vendas = 0;
    private int PONTOS_POR_VENDA;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Metodo que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria()
    {
    	int pontos = this.calcularPontos();
    	String categoria = "";
    	
    	if(pontos < 20)
    		categoria = "Novato";
    	else if((pontos >= 20) && (pontos <= 30))
    		categoria = "Aprendiz";
    	else if((pontos > 30) && (pontos <= 40))
    		categoria = "Bom";
    	else
    		categoria = "Mestre";
    	
    	return "O vendedor " + this.nome + " tem " + pontos + " pontos e esta na categoria " + categoria;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public int getPONTOS_POR_VENDA() {
		return PONTOS_POR_VENDA;
	}

	public void setPONTOS_POR_VENDA(int pONTOS_POR_VENDA) {
		PONTOS_POR_VENDA = pONTOS_POR_VENDA;
	}
}





