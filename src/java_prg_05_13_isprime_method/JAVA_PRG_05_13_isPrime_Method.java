/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_13_isprime_method;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * A prime number is a number that is evenly divisible only by itself and 1.
 * For example, the number 5 is prime because it can be evenly divided only by
 * 1 and 5. The number 6, however, is not prime because it can be divided
 * evenly by 1, 2, 3, and 6.
 * 
 * Write a metho named isPrime, which takes an integer value as an argument
 * and returns true if the argument is a prime number, or false otherwise.
 * Demonstrate the method in a complete program.
 */
public class JAVA_PRG_05_13_isPrime_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int intNumber;
        
        intNumber = getNumber();
        
        if (isPrime(intNumber) == false)
        {
            System.out.println(intNumber + " is not prime.");
        }
        else if (isPrime(intNumber) == true)
        {
            System.out.println(intNumber + " is prime.");
        }
        else
        {
            System.out.println("ERROR DETERMING ISPRIME");
        }
    }
    
    public static int getNumber()
    {
        int intNum;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        do
        {
            System.out.println("Please enter an integer value: ");
            intNum = scrKeyboard.nextInt();
        } while (intNum <= 1 || intNum > 1000000);
        
        return intNum;
    }
    
    public static boolean isPrime(int intNum)
    {
        boolean booIsPrime = false;
        
        for (int i = 1 ; i <= intNum ; i++)
        {
            if (intNum % i == 0 && i != intNum && i != 1)
            {
                booIsPrime = false;
                break;
            }
            else if (intNum % i == 0 && i == intNum)
            {
                booIsPrime = true;
            }
        }
        
        return booIsPrime;
    }
}
