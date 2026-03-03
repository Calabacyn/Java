public class Subcadenas {

    public static void main(String[] args) {
        // Subcadenas
        var cadena = "Hola Mundo";
        // subcadenas Hola y Mundo
        // substring(indice_inicio, indice_fin + 1)
        var subcadena1 = cadena.substring(0, 4);
        System.out.println("Subcadena Hola: " + subcadena1);
        var subcadena2 = cadena.substring(5, 10);
        System.out.println("subcadena Mundo: " + subcadena2);
    }

}
