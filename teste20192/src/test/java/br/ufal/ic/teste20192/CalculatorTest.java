package br.ufal.ic.teste20192;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test

    public void testAdd (){

        Calculator calculadora = new Calculator ();

        assertEquals(2, calculadora.add(1,1));

    }
}
