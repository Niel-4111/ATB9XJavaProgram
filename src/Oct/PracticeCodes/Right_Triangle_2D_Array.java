   package Oct.PracticeCodes;

   import java.util.Scanner;

   public class Right_Triangle_2D_Array {
    public static void main(String[] args) {

     /*
        *
        **
        ***
        ****
        *****
        *******
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of a pattern");
        int n = sc.nextInt();

        for (int i=0; i<n;i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

