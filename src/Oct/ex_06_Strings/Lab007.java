package Oct.ex_06_Strings;

public class Lab007 {
    public static void main(String[] args) {


        String name ="nilesh";
        String name2 ="nilesh";
        String name3 ="Nilesh";
       /* name.toUpperCase();
        System.out.println(name); *///this will show lowercase only as the string is Immutable

        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.equals(name2));
        System.out.println(name2.equalsIgnoreCase(name3));



    }
}

