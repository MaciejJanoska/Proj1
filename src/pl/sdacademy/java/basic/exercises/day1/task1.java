package pl.sdacademy.java.basic.exercises.day1;

public class task1 {
    public static void main(String[] args) {

        displayWorldUsingBinaryFormat();
        System.out.println();
        displayWorldUsingDecimalFormat();
        System.out.println();
        displayWorldUsingHexaFormatFormat();
        System.out.println();
    }

    private static void displayWorldUsingBinaryFormat() {
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }

    private static void displayWorldUsingDecimalFormat() {
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);


    }
    private static void displayWorldUsingHexaFormatFormat() {
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}






