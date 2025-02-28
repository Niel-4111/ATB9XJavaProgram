   package Oct.PracticeCodes;

   public class Arrays_Max_Value {
    public static void main(String[] args) {

        int[] marks = {55, 45, 65, 89, 67, 96, 83};

        int max_value = give_max(marks);
        System.out.printf("Max value is %d", max_value);



    }

    static int give_max(int[] marks){
        int max = marks[0];
        for(int i=0; i<marks.length; i++){
            if(marks[i]>max){
                max= marks[i];
            }
        }

        return max;
    }
}

