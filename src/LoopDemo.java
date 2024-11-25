import java.util.Scanner;

public class LoopDemo {

    public void loopDemoOne() {
        //Example 1: Program to print a text 5 times
        int n = 5; // Assigning 5 to n
        //for loop
        for (int i = 1; i <= n; i++) { // for loop equation to run 5 time
            System.out.println("Java is fun");
        }
    }

    //Example 2: Display Sum of n Natural Numbers
    public void loopDemoTwo() {
        int sum = 0;
        int n = 1000;
        //for loop
        for(int i = 1; i <= n; ++i) {
            //body inside for loop
            sum += i; //sum = sum + i
        }
        System.out.println("Sum is: " + sum);
    }

    public void palindromeExample() {
        String original = "";
        String reverse = ""; //Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine(); //racecar
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }
    }

    public void pyramidExample(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
