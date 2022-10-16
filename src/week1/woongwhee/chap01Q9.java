package week1.woongwhee;

import java.util.Scanner;

public class chap01Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a값 : ");

        int a= sc.nextInt();

        System.out.print("b값 : ");
        int b=0;
        while (true){
            b= sc.nextInt();
            if(b<a){
                System.out.println("a보다 큰값을 입력하세요");
            }else{
                break;
            }
        }
        System.out.println("b-a는 "+(b-a)+"입니다.");
    }
}
