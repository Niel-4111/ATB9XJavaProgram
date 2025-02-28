package Oct.PracticeCodes;

import java.util.Scanner;

public class CreatingFunction_Calculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = sc.nextInt();

        System.out.println("Enter number 2");
        int b = sc.nextInt();

        int result = sum_of_numbers(a,b);
        System.out.println("Sum of a & b is = "+result);

        sc.close();
    }

     static int sum_of_numbers(int a, int b) {

        return a+b;
    }
}

