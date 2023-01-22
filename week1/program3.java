package week1;

import java.util.Random;
public class program3 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int computerChoice=rnd.nextInt(20);
        System.out.println("Computer choice : " + computerChoice);
    }
}
