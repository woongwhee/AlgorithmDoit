package week1.woongwhee;

public class chap01 {
    public static void main(String[] args) {
        System.out.println("Q1 : "+max4(1,3,5,10));
        System.out.println("Q1 v2 : "+max4v2(1,3,5,10));
        System.out.println("Q2 : "+min3(3,2,-1));
        guguDan();
        guguPlus();
        Nemo(10);
        triangleLB(10);
        triangleLU(10);
        triangleRU(10);
        triangleRB(10);
        spira(10);
        npira(10);
    }

    //Q1
    static int max4(int a,int b,int c, int d){
        if(b>a){
            a=b;
        }
        if(d>c){
            c=d;
        }
        if(c>a){
            a=c;
        }
        return a;
    }
    static int max4v2(int a,int b,int c, int d){
        int max=Math.max(a,b);
        max=Math.max(max,c);
        max= Math.max(max,d);
        return max;
    }
    static int min3(int a,int b,int c){
        if(b>a){
            a=b;
        }
        if(a>c){
            a=c;
        }
        return a;
    }
    static int min4(int a,int b,int c,int d){
        int min=Math.min(a,b);
        min=Math.min(min,c);
        min= Math.min(min,d);
        return min;
    }
    //Q4
    static int med2(int a,int b, int c){
        if(a>=b){
            if(b>=c){
                return b;
            }else if(c>=a){
                return a;
            }else{
                return c;
            }
        }else if(a>c){
            return a;

        }else if(b>c){
            return c;
        }else{
            return b;}

    }
    //Q5 위에경우 조건검사를 최소 2번 최대 3번이지만 아래경우 조건검사를 최소 4번 최대 7번까지 하게된다.
    static int med3(int a, int b , int c){
        if((b>=a&&c<=a)||(b<=a&&c>=a)){
            return a;
        }else if((a>b&&c<b)||(a<b&&c>b)){
            return b;
        }
        return c;
    }
    //Q6 생략.
    //Q7
    static int gaus(int N){
        int result=0;
        if(N%2==0){
            result=(1+N)/(N/2);
        }else{
            result=(1+N)/(N/2)+(N+1)/2;
        }
        return result;
    }
    //Q8
    static int sumof(int a, int b){
        int result=0;
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        for (int i = a; i <=b ; i++) {
            result+=i;
        }
        return result;
    }
    //Q11
    static void guguDan(){
        System.out.println("   | 1  2  3  4  5  6  7  8  9");
        System.out.println("----+----------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(" "+i+" | ");
            for (int j = 1; j <=9 ; j++) {
                if(i*j<10){
                System.out.print(i*j+"  ");
                }else{
                System.out.print(i*j+" ");}
            }
            System.out.println();
        }
    }
    static void guguPlus(){
        System.out.println("   | 1  2  3  4  5  6  7  8  9");
        System.out.println("----+----------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(" "+i+" | ");
            for (int j = 1; j <=9 ; j++) {
                if(i+j<10){
                    System.out.print(i+j+"  ");
                }else{
                    System.out.print(i+j+" ");}
            }
            System.out.println();
        }
    }
    static void Nemo(int N){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
    static void triangleLB(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }static void triangleLU(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }static void triangleRU(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print( "  ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }static void triangleRB(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void spira(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void npira(int n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i*2+1; j++) {
                    System.out.print((i+1)%10);
                }
                System.out.println();
        }
    }
}
