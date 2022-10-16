package week1.woongwhee;

import java.util.Scanner;

public class chap01Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            int count=0;
            while(a!=0){
                a=a/10;
                count++;
            }
            System.out.println("그 수는 "+count+"자리입니다.");
        }
    }
}
