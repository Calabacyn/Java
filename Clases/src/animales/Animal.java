package animales;

public class Animal {

    public void comer(){
        System.out.println("Como muchas veces al dia");
    }

    public void dormir(){
        System.out.println("Duermo muchas horas al dia");
    }
} //fin clase Animal

class Perro extends  Animal{

    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

}

class  PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("**** Ejemplo de herencia ****");
        System.out.println("Clase Padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("Clase Padre, soy un Perro");

        var perro1 = new Perro();
        perro1.hacerSonido();
        perro1.comer();



    }
}