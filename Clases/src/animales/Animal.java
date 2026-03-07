package animales;

public class Animal {

    public void comer(){
        System.out.println("Como muchas veces al dia");
    }

    public void dormir(){
        System.out.println("Duermo muchas horas al dia");
    }

    public void hacerSonido(){
        System.out.println("Puedo hacer sonido");
    }
} //fin clase Animal

class Perro extends  Animal{

    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

    @Override
    public void dormir(){
        System.out.println("Duermo 15hs horas al dia");
        System.out.println("Metodo clase pabre: " );
        super.dormir();
    }

}

class Gato extends  Animal{

    @Override
    public void hacerSonido(){
        System.out.println("Puedo maullar");
    }

    @Override
    public void dormir(){
        System.out.println("Duermo 20hs horas al dia");
        System.out.println("Metodo clase pabre: " );
        super.dormir();
    }

}

class  PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("**** Ejemplo de herencia / polimorfismo ****");

        System.out.println("Clase Padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        animal1.hacerSonido();

        System.out.println("**** **************** ****");

        System.out.println("Clase Padre, soy un Perro");
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();

        System.out.println("**** **************** ****");

        System.out.println("Clase Padre, soy un Gato");
        var gato1 = new Gato();
        gato1.comer();
        gato1.dormir();
        gato1.hacerSonido();



    }
}