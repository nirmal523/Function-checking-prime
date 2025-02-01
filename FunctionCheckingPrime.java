import java.util.Scanner;


public class FunctionCheckingPrime {
    public static void main(String[] args) {
        System.out.println("enter a numbrer =");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
int result=shiva(b);
System.out.print("the given number is "+result);
sc.close();

        
    }
    public static int shiva(int b){
           if(b%2!=0){
            System.out.println("it is an prime ");
           }
          else{
            System.out.println("it is not prime");
          }

           return b;
    }
}
