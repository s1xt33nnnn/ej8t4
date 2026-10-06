public class ej8 {
    public static void main(String[] args) {
        int[][] array;
        array = new int[10][10];

        for (int fila= 0; fila < array.length; fila++){
            for (int col = 0; col < array.length; col++){
                System.out.println();
            }
        }

        array[0][4]= 8;
        array[2][6]=8;
        array[3][1]=8;
        array[8][6]=8;

    }
}
