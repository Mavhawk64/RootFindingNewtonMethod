import java.util.*;
public class NewtonMethod
{
    public static void main(String[] args) {
        double root = 1;
        System.out.println("Enter in the root/power you would like to solve (i.e. 2 for square root, 3 for cube root, ...)");
        Scanner scan = new Scanner(System.in);
        root = scan.nextDouble();
        System.out.println("Enter your base (i.e for root 2 of 8, enter 8)");
        double base = scan.nextDouble();
        System.out.println("Enter a reasonable guess for the root\nNote: This will affect the outcome!");
        double guess = scan.nextDouble();
        System.out.println("How many iterations would you like to do?");
        int iterations = scan.nextInt();
        System.out.println("The root of x^(" + root + ") - (" + base + ") = " + newtonMethod(root,base,guess,iterations));
    }
    
    private static double newtonMethod(double root, double base, double guess, int iterations){
        if(iterations == 0) return guess;
        return newtonMethod(root,base,guess - (Math.pow(guess, root) - base) / (root * Math.pow(guess,root-1)),iterations-1);
    }
}
