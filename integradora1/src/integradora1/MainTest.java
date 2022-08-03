package integradora1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;
    Estagiario est1, est2;

    @BeforeEach
    public void doBefore() {
        func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        func2 = new Funcionario("Maria",1);
        func2.vender(1);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        afi3 = new Afiliado("José");

        func1.addAfiliado(afi1);
        
        est1 = new Estagiario("Paula");
        est1.vender(15);
        
        est2 = new Estagiario("Vinicius");
        est2.vender(5);
    }

    @Test
    public void mostrarVendedores() {
        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
        System.out.println(est1.mostrarCategoria());
        System.out.println(est2.mostrarCategoria());
        
        assertEquals("O vendedor Pedro tem 30 pontos e esta na categoria Aprendiz",func1.mostrarCategoria());
        assertEquals("O vendedor Maria tem 10 pontos e esta na categoria Novato",func2.mostrarCategoria());
        assertEquals("O vendedor Ramon tem 60 pontos e esta na categoria Mestre",afi1.mostrarCategoria());
        assertEquals("O vendedor Paulo tem 15 pontos e esta na categoria Novato",afi2.mostrarCategoria());
        assertEquals("O vendedor José tem 0 pontos e esta na categoria Novato",afi3.mostrarCategoria());
        assertEquals("O vendedor Paula tem 75 pontos e esta na categoria Estagiario Experiente",est1.mostrarCategoria());
        assertEquals("O vendedor Vinicius tem 25 pontos e esta na categoria Estagiario Novato",est2.mostrarCategoria());
    }

}