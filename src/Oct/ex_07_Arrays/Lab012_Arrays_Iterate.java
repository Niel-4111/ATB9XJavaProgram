   package Oct.ex_07_Arrays;

   import java.util.Arrays;

   public class Lab012_Arrays_Iterate {
    public static void main(String[] args) {

        int[] marks = {55, 45, 65, 89, 67, 96, 83};

        //Arrays.sort(marks); //ascending order
        for(int i=0; i< marks.length; i++){
            System.out.println(marks[i]);

        }

        Arrays.sort(marks);
        int item_index = Arrays.binarySearch(marks,96);
        System.out.println(item_index);

    }
}

