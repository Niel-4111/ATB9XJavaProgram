   package Oct.ex_07_Arrays;

   import java.util.Scanner;

   public class Lab014_Arrays_ForEachLoop {
    public static void main(String[] args) {

        int[] a = new int [3];
        a[0] =90;
        a[1] =60;
        a[2] =50;

        for(int i:a){
            System.out.println(i);
        }

        String[] names = {"Nilesh","Harshal","Sonawane"};
        for(String N:names){
            System.out.println(N);
        }


    }
}

