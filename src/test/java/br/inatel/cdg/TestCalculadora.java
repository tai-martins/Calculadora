package br.inatel.cdg;

import br.inatel.cdg.Calculadora;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TestCalculadora {

    private Calculadora calc;
    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testeAdicao() {
        int res = calc.adicao(10,1);
        assertEquals(11, res);
    }

    @Test
    public void testeSubtrair() {
        int res = calc.subtracao(8,5);
        assertEquals(3, res);
    }

    @Test
    public void testeMultiplicar() {
        int res = calc.multiplicacao(4,3);
        assertEquals(12, res);
    }

    @Test
    public void testDivisao() {
        double res = calc.divisao(6,3);
        assertEquals(2, res,0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisaoZero() {
        double res = calc.divisao(5,0);
    }

}
