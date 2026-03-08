package persona;

public class PruebaPersona {

    public static void main(String[] args) {
        System.out.println("Creacion de Objetos de la Clase persona.Persona");

        System.out.println("****************************************************");


        Persona objeto1 = new Persona( "Maria", "Lopez");
        System.out.println(objeto1.toString());

        Persona objeto2 = new Persona( "Juan", "Lopez");
        System.out.println(objeto2.toString());

        System.out.println("Variable estatica: "+Persona.getContadorPersonas());

    }
}
