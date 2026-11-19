import java.util.Scanner;

public class ASCII {
    // Global Variable
    static int asciiNum = 0;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Asking user to input number between 32 and 127
        do {
            System.out.print("Type any number between 32 and 127: ");
            asciiNum = keyboard.nextInt();
          // Rules in case user breaks them
            if (asciiNum < 32 || asciiNum > 127) {
                System.out.println("Invalid Number!! Please try again");
            } else if (asciiNum == 32) {
                System.out.println("YOur number is " + asciiNum + ", which is a space");
                break;
            } else {
                convertToASCII(asciiNum);
            }
        } while (asciiNum < 32 || asciiNum > 127);

        System.out.print("Program terminated normally");

        keyboard.close();
    }
    // Method to convert number to character
    public static int convertToASCII(int asciiNum) {
        char symbol = (char) asciiNum;
        System.out.println("Your number is " + asciiNum + ", which is " + symbol);
        return asciiNum;
    }
}
