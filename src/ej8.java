public class ej8 {
    public static void main(String[] args) {
        int[][] array;
        array = new int[10][10];

        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[0].length; col++) {
                array[fila][col] = 1;
            }
        }

        array[0][4] = 8;
        array[2][6] = 8;
        array[3][1] = 8;
        array[8][6] = 8;
        for(int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[fila][col] + " ");
            }
            System.out.println();

        }
    }
}
