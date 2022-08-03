package integradora1;

import java.util.ArrayList;

public class Funcionario extends Vendedor {

    private int anosAntiguidade;

    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosAntiguidade){
        super.setNome(nome);
        super.setPONTOS_POR_VENDA(5);
        this.anosAntiguidade = anosAntiguidade;
    }

    /*agrega um afiliado ao funcionario, e por sua vez soma os pontos*/
     public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.getNome() + " agora e afiliado de " + super.getNome());
     }

    /*implementacao do metodo abstrato*/
    /*por cada ano de antiguidade obtem 5 pontos, por cada afiliado obtem 5*/
    @Override
    public int calcularPontos() {
        return (this.afiliados.size() * 10) + (super.getVendas() * 5) + (this.anosAntiguidade * 5);
    }
}
