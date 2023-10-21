import java.util.Scanner;

public class MinMaxChallange {
    public static void main(String[] args) {
        int counter = 0;
        double max = 0;
        double min = 0;
        double current = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            counter++;
            System.out.println("Enter number #" + counter +":");
            String inputNumber = scanner.nextLine();
            try {

                current = Double.parseDouble(inputNumber);
                if (counter == 1 || current < min){
                    min = current;
                }
                if (counter == 1 || current > max){
                    max = current;
                }

            } catch (NumberFormatException badInput){
                break;
            }
        }

        if (counter > 0 ){
            System.out.println("Min Value Is : " + min + " Max Value Is : " + max);
        } else {
            System.out.println("No Valid Data Entered");
        }
    }

    
}
