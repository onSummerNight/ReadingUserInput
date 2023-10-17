public class Main {
    public static void main(String[] args) {
        int currentYear = 2023;
//        String userDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(userDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String userAgeWithPartialyear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialyear);
//        System.out.println("The user says he's " + ageWithPartialYear);

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Welcome to the jungle");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        return "";
    }


}
