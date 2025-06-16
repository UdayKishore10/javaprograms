import java.util.Scanner;

public class Fibonaic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number:");
        int limit=sc.nextInt();
        int first=0;
        int second=1;
        System.out.println("fiboniac "+ limit +":");
        while(first<=limit){
            System.out.println(first +"" );
            int next=first+second;
            first=second;
            second=next;
        }
    }
    
}
