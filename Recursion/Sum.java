import java.util.*;
class Sum{

  public static int findSum(int n){
    if(n==0) return 0;
    return n+findSum(n-1);
  }

  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n");
  int n=sc.nextInt();


  System.out.print("sum is " +findSum(n));
  
  }
}