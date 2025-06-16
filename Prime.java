import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num < 1){
            isPrime=false;
        }
        else 
        for(int i=1;i<num;i++){

        if(num%2==0){
            isPrime=false;
            break;
        }
    }

if(isPrime){
    System.out.println("prime");
    
}
else{
    System.out.println("not a prime");
}
    
}
}
