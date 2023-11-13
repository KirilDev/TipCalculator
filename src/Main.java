import java.util.Scanner;
public class Main {
    //Here is a method where is doing all calculations
    static void calculation(){
        System.out.println("Welcome to The Tip Calculator!\n");
        System.out.println("At First, Enter Check Sum");
        //Here program want to get the sum of check
        Scanner scanner_of_check = new Scanner(System.in);
        int answer_check = scanner_of_check.nextInt();

        System.out.println("Now enter your procent of work = 20% - perfect, 10% - good, 5% - why i live today?");
        //After it, program ask about serving and ask to enter the percentage
        Scanner scanner_of_percentage = new Scanner(System.in);
        int answer_percentage = scanner_of_percentage.nextInt();

        //Here is a switch where we manage the data
        switch (answer_percentage) {
            case 20:
                System.out.println(answer_check * 0.2 + " $");
                break;
            case 10:
                System.out.println(answer_check * 0.1 + " $");
                break;
            case 5:
                System.out.println(answer_check * 0.05 + " $");
                break;
            default:
                //If was entered uncorrected percentage, program recall this function
                System.out.println("Try again!!\n");
                calculation();
        }
    }
    public static void main(String[] args) {
        calculation();
    }
}
