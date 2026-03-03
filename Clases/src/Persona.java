public class Persona {

    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de Objetos de la Clase Persona");
        Persona objeto1 = new Persona();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();
    }

}
