package week1.KCY9392;
import java.util.Scanner;

public class Main {
    // 연습문제 01
    /*
        네 값의 최댓값을 구하는 max4 메소드를 작성하세요.
        작성한 메소드를 테스트하기위해 main메소드를 포함한 프로그램을 작성해야합니다.
     */
    public static int max4(int a, int b, int c, int d){

        int max = a;
        if(b>a){ // b가 a보다 크다면
            max = b; // b가 큰값으로 저장
            if(c>b){ // c가 b보다 크다면
                max = c; // c가 큰값으로 저장
                if(d>c){ // d가 b보다 크다면
                    max = d; // d가 큰값으로 저장
                }
            }else if(d>b){ // b가 c,a보다 큰 상황에서 d보다 작으면
                max = d; // d가 큰값으로 저장
            }
        }
        return max; // 최댓값 반환
    }


    // 연습문제 02
    /*
        세 값의 최솟값을 구하는 min3메소드를 작성하세요
     */
    public static int min3(int a, int b, int c){

        int min = a;
        if(a>b){
            min = b; // b가 a보다 작은상황
            if(b>c) {
                min = c; // c가 b,a보다 작은상황
            }
        }
        return min;
    }



    // 연습문제 03
    /*
        네 값의 최솟값을 구하는 min4메소드를 작성하시오
     */
    public static int min4(int a, int b, int c, int d){

        int min = a;
        if(min > b){
            min = b;
            if(min > c){
                min = c;
                if(min > d){
                    min = d;
                }
            }else if(min > d){
                min = d;
            }
        }
        return min;
    }


    // 연습문제 04
    /*
        세 값의 대소관계인 13가지 조합의 중앙값을 구하여 출력하는 프로그램을 작성하시오
     */
    /*public static int med3(int a, int b, int c){

        if(a >= b)
            if(b >= c)
                return b; // c <= b <= a
            else if(a <= c)
                return a; // b <= a <= c
            else
                return c; // a <= c <= b
            else if( a > c )
                return a;
            else if( b > c )
                return c;
            else
                return b;
    }
    */

    // 연습문제 05
    /*
        중앙값을 구하는 메소드는 다음과 같이 작성할 수 도 있습니다.
        하지만 med3메소드에 비해 효율이 떨어지는데 그 이유를 작성하시오

        -> med3메소드는 if문과 else if문을 같이 중첩으로 많이 사용하여서
           아래의 메소드보다 더 빨리 처리할 수 있다.
     */
    public static int med3(int a, int b, int c){
        if((b>=a && c <= a) || (b<=a && c>=a))
            return a;
        else if((a>b && c<b) || (a<b && c>b))
            return b;
        return c;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* // 1,2,3
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // 1번
        // System.out.println(max4(a,b,c,d));

        // 2번
        // System.out.println(min3(a,b,c));

        // 3번
        System.out.println(min4(a,b,c,d));
        */


        // 4번 , 5번
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(med3(a,b,c));
        */


        // 6번
        // 연습문제 06
        /*
            실습 1-7에서 while문이 종료될 때 변수 i값이 n+1이 되는 지 확인하세요
        */
        /*System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값 : ");

        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n){
            sum += i;
            i++;
            System.out.println(i);
        }

        System.out.println("1부터 " + n+ "까지의 합은 "+sum+"입니다."); */



        // 연습문제 09
        /*
            오른쪽 결과와 같이 두 변수 a,b에 정수를 입력하고
            b-a를 출력하는 프로그램을 작성하시오
         */
        /*System.out.print("a를 입력하세요 : ");
        int a = sc.nextInt();

        int b = 0;

        do{
            System.out.print("b를 입력하세요 : ");
            b = sc.nextInt();
            if(a >= b) {
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        }while(a >= b);

        System.out.println("b-a는 "+(b-a)+"입니다."); */


        // 연습문제 10
        /*
            양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요
            예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고
            1314를 입력하면 '그 수는 4자리입니다.'라고 출력합니다.
         */
        /*System.out.print("양의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        int count = 0;

        if(num < 10){
            count = 1;
        }else if(num < 100 ){
            count = 2;
        }else if(num < 1000){
            count = 3;
        }else if(num < 10000){
            count = 4;
        }else {
            count = 5;
        }

        System.out.println("그 수는 "+count+"자리입니다."); */


        // 연습문제 11
        /*
            오른쪽 결과와 같이 위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표를 출력하는 프로그램을 작성하세요
            ( 구분선은 수직선(|), 마이너스(-), 플러스(+)기호를 사용하세요
         */
        /*System.out.println("   |  1  2  3  4  5  6  7  8  9");
        System.out.println("---+---------------------------");
        for(int i=1; i<=9; i++){
            System.out.print(i+"  |");
            for(int j=1; j<=9; j++){
                System.out.printf(" %2d", i*j);
            }
            System.out.println();
        }*/


        // 연습문제 12
        /*
            구구단 곱셈표를 변형하여 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요
            ( Q11과 같이 표의 위쪽과 왼쪽에 더하는 수를 출력하세요 )
         */
        /*System.out.println("   |  1  2  3  4  5  6  7  8  9");
        System.out.println("---+---------------------------");
        for(int i=1; i<=9; i++){
            System.out.print(i+"  |");
            for(int j=1; j<=9; j++){
                System.out.printf(" %2d", i+j);
            }
            System.out.println();
        }*/
        
        // 연습문제 13
        /*
            오른쪽 결과와 같이 입력한 수를 한변으로 하는 정사각형을 *를 출력하는 프로그램을 작성하세요
         */
        /*System.out.println("정사각형을 출력합니다");
        System.out.print("변의 길이 : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<= num; i++){
            for (int j=1; j<= num; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        // 연습문제 14-1
        /*
            직각이등변삼각형을 출력하는 부분을 아래와 같은 형식의 메소드로 작성하세요
            - static void triangleLB(int n) // 왼쪽 아래가 직각인 이등변삼각형
         */

        /*System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");*/
        /*System.out.print("몇단 삼각형입니까?");
        int num = sc.nextInt();
        */

        // triangleLB(num); //14-1

        // 연습문제 14-2
        /*
            또 왼쪽위, 오른쪽위, 오른쪽아래가 직각인 이등변삼각형을 출력하는 메소드를 각각 작성하세요
            - static void triangleLU(int n) // 왼쪽위가 직각인 이등변삼각형을 출력
            - static void triangleRU(int n) // 오른쪽위가 직각인 이등변삼각형을 출력
            - static void triangleRB(int n) // 오른쪽 아래가 직각인 이등변삼각형을 출력
         */
        //triangleLU(num); //14-2 (왼쪽위)
        //triangleRU(num); //14-2 (오른쪽위)
        //triangleRB(num); //14-2 (오른쪽아래)


        // 연습문제 15
        /*
            n단의 피라미드를 출력하는 메소드를 작성하세요
            - static void spira(int n)
            (i행에는 (i-1)*2+1개의 *가 출력되게 하세요. 마지막n행에는 (n-1)*2+1개의 *을 출력하게합니다)
         */
        //spira(num);


        // 연습문제 16
        /*
            오른쪽과 같이 아래를 향한 n단의 숫자 피라미드를 출력하는 메소드를 작성하세요
            - static void npira(int n)
            (i행에 출력하는 숫자는 i % 10으로 구하세요)
         */
        //npira(num);
    }


    // 14-1
    public static void triangleLB(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 14-2 (왼쪽위)
    public static void triangleLU(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 14-2 (오른쪽위)
    public static void triangleRU(int n){
        for(int i=1; i<=n; i++){
            for(int k=1;k<i; k++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 14-2 (오른쪽아래)
    public static void triangleRB(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 15
    public static void spira(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<= (i-1)*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void npira(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<= (i-1)*2+1; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}