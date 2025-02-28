   package Oct.ex_06_Strings;

public class Lab009_StringBuffer_StringBuilder {
    public static void main(String[] args) {


        StringBuffer strbuf=new StringBuffer("Nilesh Sonawane");

        strbuf.append("Sonawane");
        System.out.println(strbuf);
        strbuf.reverse();
        System.out.println(strbuf);

        StringBuilder strbuil = new StringBuilder("HelloWorld");
        strbuil.append("Sonawane");
        System.out.println(strbuil);
    }
}

