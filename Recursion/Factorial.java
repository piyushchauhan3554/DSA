import java.util.*;
class Factorial{
  // functional method
  public static int findFactorial(int n){
    if(n==1) return 1;
    return n*findFactorial(n-1);
  }

  // parameterized method

  public static void fact(int n,int currFact){
    if(n==1){
      System.out.print(currFact); return;
    }
    fact(n-1 , currFact*n);


  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // System.out.println(findFactorial(n));

    fact(n,1);
  }
}