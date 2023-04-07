package ProjectEuler;

import java.util.Scanner;

public class MultipleOf3and5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i=0;i<a;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
