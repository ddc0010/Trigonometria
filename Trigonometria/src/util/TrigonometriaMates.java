package util;

public class TrigonometriaMates {
	
	/**
     * Calcula el cuadrado de un número entero.
     * 
     * @param n el número para calcular el cuadrado.
     * @return el cuadrado de n.
     */
    public int cuadrado(int n) {
        return n * n;
    }

    /**
     * Calcula la raíz cuadrada de un número entero.
     * 
     * @param n el número para calcular la raíz cuadrada.
     * @return la raíz cuadrada de n.
     * @throws IllegalArgumentException si n es negativo.
     */
    public double raizCuadrada(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return Math.sqrt(n);
    }

    /**
     * Calcula el máximo común divisor (MCD) de dos números enteros.
     * 
     * @param a el primer número.
     * @param b el segundo número.
     * @return el MCD de a y b.
     */
    public int maximoComunDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return maximoComunDivisor(b, a % b);
    }

    /**
     * Calcula la potencia de un número base elevado a un exponente.
     * 
     * @param base el número base.
     * @param exponent el exponente.
     * @return la potencia de base elevado a exponent.
     */
    public int exponente(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

}
