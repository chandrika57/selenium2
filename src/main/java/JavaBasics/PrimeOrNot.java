package JavaBasics;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        int n =sc.nextInt();
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;

            }
        }
        if(count<=2){
            System.out.println("It is prime");
        }
        else{
            System.out.println("It is not prime");
        }
    }

}
