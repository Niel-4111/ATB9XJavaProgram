   package Oct.ex_07_Arrays;

   public class Lab016_MultiDimensionalArrays_Iterate {
    public static void main(String[] args) {

        int[][] array_2D = new int [3][3];

        // 90, 20, 30
        // 1, 3, 5
        // 2, 4, 6


        array_2D[0][0] =90;
        array_2D[0][1] =20;
        array_2D[0][2] =30;

        array_2D[1][0] =1;
        array_2D[1][1] =3;
        array_2D[1][2] =5;

        array_2D[2][0] =2;
        array_2D[2][1] =4;
        array_2D[2][2] =6;


        for (int i=0; i<array_2D.length; i++){
            for (int j=0; j<array_2D[i].length; j++){
                System.out.print(array_2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}

