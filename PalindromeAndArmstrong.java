/**
 Program to check palindrome and armstrong.


  @author Jayakrishnan V R
 * @version 1.0
 * @since 2020-11-27
*/

import java.util.Scanner;

//Class declaration
public class PalindromeAndArmstrong {
    public static void main(String[] args) {
        //scanner object formation
        Scanner sc = new Scanner(System.in);

        System.out.println("You can Check for palindrome or armstrong");

        System.out.println("Enter 'p' for checking palindrome or 'a' for armstrong(Enter only in small letters)-");

        String choice = sc.nextLine();

        //selection of operation
        switch (choice) {

            case "a":
                int originalNumber, number, remainder, result = 0;
                System.out.println("Enter the originalNumber to check whether it is armstrong");
                originalNumber = sc.nextInt();
                number = originalNumber;

                //checking whether armstrong
                while (number != 0) {
                    remainder = number % 10;
                    result += Math.pow(remainder, 3);
                    number /= 10;
                }

                if (result == originalNumber) { //declaring the result
                    System.out.println(originalNumber + " is an Armstrong Number.");
                } else {
                    System.out.println(originalNumber + " is not an Armstrong Number.");
                }
                break;

            case "p":
                System.out.println("Enter the Number to be checked whether it is palindrome");
                int n = sc.nextInt();//It is the originalNumber variable to be checked for palindrome
                int r, sum = 0, temp;
                temp = n;

                while (n > 0) { //Checking whether palindrome
                    r = n % 10;  //getting remainder
                    sum = (sum * 10) + r;
                    n = n / 10;
                }
                if (temp == sum) { //Displaying result
                    System.out.println("It is a palindrome Number ");
                } else {
                    System.out.println("It is not a palindrome Number");
                }
                break;
            default: //Output if invalid input is given
                System.out.println("Invalid input,Select 'p' or 'a'");
        }
    }
}

