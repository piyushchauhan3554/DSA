import java.util.*;
class Fibonacci{
  // using loop
  public static int nthFibLoop(int n){
    if(n==0) return 0;
    if(n==1) return 1;

    int[] fib=new int[n+1];

    fib[1]=1;

    for(int i=2;i<=n;i++) fib[i]=fib[i-1]+fib[i-2];

    return fib[n];
  }

  // using recursion
  public static int nthFibRecursion(int n){
    if(n<=1) return n; // n==0 || n==1 return n
    return nthFibRecursion(n-1)+nthFibRecursion(n-2);
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();

    System.out.print(nthFibRecursion(n));
  }
}