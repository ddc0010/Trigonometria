package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.TrigonometriaMates;

class TestsTrigonometrias {

	@Test
    void testSquare() {
		TrigonometriaMates mathOps = new TrigonometriaMates();
        int cuadradoEsperado = 16;
        int cuadradoObtenido = mathOps.cuadrado(4);
        assertEquals(cuadradoEsperado, cuadradoObtenido);
    }
    
    @Test
    void testSqrt() {
    	TrigonometriaMates mathOps = new TrigonometriaMates();
        double raizEsperada = 5.0;
        double raizObtenida = mathOps.raizCuadrada(25);
        assertEquals(raizEsperada, raizObtenida, 0.001); // delta de 0.001 para comparación de doubles
    }
    
    @Test
    void testSqrtNegative() {
    	TrigonometriaMates mathOps = new TrigonometriaMates();
        mathOps.cuadrado(-1);
    }
    
    @Test
    void testGcd() {
    	TrigonometriaMates mathOps = new TrigonometriaMates();
        int gcdEsperado = 6;
        int gcdObtenido = mathOps.maximoComunDivisor(54, 24);
        assertEquals(gcdEsperado, gcdObtenido);
    }
    
    @Test
    void testPower() {
    	TrigonometriaMates mathOps = new TrigonometriaMates();
        int potenciaEsperada = 27;
        int potenciaObtenida = mathOps.exponente(3, 3);
        assertEquals(potenciaEsperada, potenciaObtenida);
    }

}
