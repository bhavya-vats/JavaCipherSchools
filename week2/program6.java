package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program6 {
        int n1,n2,result;
        Scanner sc=new Scanner(System.in);

        void Calculate() {
            try {
            System.out.println("Enter first number: ");
            n1=sc.nextInt();
            System.out.println("Enter second number: ");
            n2=sc.nextInt();

            result=n1/n2;
                    if(n2==0) {
                    throw new ArithmeticException();
                    }
            }

            catch(InputMismatchException ime) {
                //this block executes only if any error occurs at try block.
                System.out.println("Ouch!!! Exception detected.");
            }
            catch(ArithmeticException ae) {
                //this block executes only if any error occurs at try block.
                System.out.println("Ouch!!! Exception detected.");
            }
            finally{
                System.out.println("The division is : "  + result);
            }
            //try is a block of code that we think has probability to throw error at runtime.

            
        }
        public static void main(String[] args) {
            program6 obj=new program6();
            obj.Calculate();
        }
}
