   package Oct.PracticeCodes;

   public class Arrays_Min_Value {
    public static void main(String[] args) {

        int[] marks = {55, 45, 65, 89, 67, 96, 83};

        int min_value = give_min(marks);
        System.out.printf("Min value is %d", min_value);



    }

    static int give_min(int[] marks){
        int min = marks[0];
        for(int i=0; i<marks.length; i++){
            if(marks[i]< min){
                min= marks[i];
            }
        }

        return min;
    }
}

