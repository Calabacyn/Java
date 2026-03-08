package persona;

public class Persona {

    private static int contadorPersonas=0;
    private String nombre;
    private String apellido;
    private int idPersona;

    // Contrutor

    public Persona( String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;

        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return  "ID: " + this.idPersona
                + ", Nombre: " + this.nombre
                + ", apellido: " + this.apellido;
    }
    void mostrarPersona(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public  static int getContadorPersonas(){
        return  Persona.contadorPersonas;
    }
}
