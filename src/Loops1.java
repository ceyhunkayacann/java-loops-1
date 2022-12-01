import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        int userInput;
        int iCount = 0;
        int total = 0;
        int result;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        userInput = input.nextInt();

        for (int i = 0; i < userInput; i++) {
            if(i % 3 == 0 && i % 4 == 0) {

                total = total + i;
                iCount++;
            }
        }

        result = total / iCount;

        System.out.println(result);
    }
}



