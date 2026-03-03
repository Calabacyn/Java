public class SintaxisSimplificadaMatriz {
    public static void main(String[] args) {
        // Definimos la matriz
        int[][] matriz = {
                {100,200,300},
                {400,500,600}
        };

        // Recorrer los renglones
        for(int ren = 0 ; ren < matriz.length; ren++){
            // Recorrer las columnas (del renglon que esta como pivote)
            for(int col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
