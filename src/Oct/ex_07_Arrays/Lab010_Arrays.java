   package Oct.ex_07_Arrays;

public class Lab010_Arrays {
    public static void main(String[] args) {

        int[] marks = {55, 45, 65, 89, 67, 96, 83};
        System.out.println(marks[4]);
       // System.out.println(marks[40]);// ArrayIndexOutOfBoundsException

        System.out.println(marks.length);

        //type 2
        int[] marks2 = new int[5];
        marks2[0] = 11;
        marks2[1] = 21;
        marks2[2] = 41;
        marks2[3] = 51;
        marks2[4] = 61;
        marks2[5] = 81;



    }
}

