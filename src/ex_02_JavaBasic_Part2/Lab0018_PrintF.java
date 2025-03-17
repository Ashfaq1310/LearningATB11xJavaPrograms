package ex_02_JavaBasic_Part2;

import java.sql.SQLOutput;

public class Lab0018_PrintF {
    public static void main(String[] args) {

        int a=10;
        byte b=12;
        byte c=15;

        System.out.printf("Your Variable is %d", a);

        // %d -> bye, int, long, short----Data Type
        // %s -> String
        // %b -> boolean
        // %f -> float, double
        System.out.println("--");
        System.out.printf(" %d + %d", b, c);


    }
}
