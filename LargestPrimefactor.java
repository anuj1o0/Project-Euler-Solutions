package ProjectEuler;

import java.util.Scanner;

public class LargestPrimefactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        for(long i=2;i<=a;i++){
            while(a%i==0){
                System.out.println(i+" ");
                a=a/i;
            }
        }
    }
}
