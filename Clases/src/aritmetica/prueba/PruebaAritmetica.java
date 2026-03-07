package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        System.out.println("*** Ejemplo aritmetica.Aritmetica ***");
        var aritmetica1 = new Aritmetica( 7, 8);
        System.out.println("aritmetica1.getOperando1() = " + aritmetica1.getOperando1());
      aritmetica1.setOperando1(9);
        System.out.println("aritmetica1.getOperando1() = " + aritmetica1.getOperando1());
    aritmetica1.sumar();



    }
}
