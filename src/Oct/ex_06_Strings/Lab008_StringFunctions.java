   package Oct.ex_06_Strings;

public class Lab008_StringFunctions {
    public static void main(String[] args) {


        String str ="Nilesh Sudam Sonawane";

        //substring
        String substring =str.substring(7, 12);
        System.out.println(substring);

        //concatenation
        String Name = "Nilesh";
        String conc = Name.concat(" Sonawane");
        System.out.println(conc);

        //splitting
        String fruits ="Apple,banana,cherry";
        String[] splits = fruits.split(",");
        System.out.println(splits[0]);
        System.out.println(splits[1]);
        System.out.println(splits[2]);

        //CharAt()
        String S4 ="Nilesh";
        System.out.println(S4.charAt(3));

        //indexOf()
        System.out.println(S4.indexOf("l"));


        //Trim() - removes the leading and trailing spaces of string
        String S5 =" Sonawane ";
        System.out.println(S5.trim());

        //contains() - return boolean
        System.out.println(S5.contains("awa"));

        //lastindexOf()
        System.out.println(S5.lastIndexOf("a"));

        //replace()
        System.out.println(S5.replace("S", "T"));

        //startsWith()
        System.out.println(S4.startsWith("Nil"));


    }
}

