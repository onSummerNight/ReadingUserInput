import java.util.Scanner;

public class Challange {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (counter = 1; counter <= 5; counter++){
            try {
                System.out.println("Enter number #" + counter +":");
                String inputNumber = scanner.nextLine();
                sum = sum + Integer.parseInt(inputNumber);
            } catch (NumberFormatException badInput){
                System.out.println("Invalid number");
                counter--;
            }
        }
        System.out.println("And The Result Is :" + sum);
    }

}