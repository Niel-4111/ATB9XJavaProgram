   package Oct.ex_07_Arrays;

   import java.util.Scanner;

   public class Lab013_Arrays_UserInput {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size=sc.nextInt();

        int [] numbers = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the number "+(i+1));
            numbers[i] = sc.nextInt();

        }

        System.out.println("-------------");

        System.out.println("The numbers are: ");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }




    }
}

