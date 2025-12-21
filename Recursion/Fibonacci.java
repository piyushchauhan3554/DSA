import java.util.*;
class Fibonacci{
  public static int nthFibLoop(int n){
    if(n==0) return 0;
    if(n==1) return 1;

    int[] fib=new int[n+1];

    fib[1]=1;

    for(int i=2;i<=n;i++) fib[i]=fib[i-1]+fib[i-2];

    return fib[n];
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();

    System.out.print(nthFibLoop(n));
  }
}