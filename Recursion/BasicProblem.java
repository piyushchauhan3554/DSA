import java.util.*;
class BasicProblem{
  // function to print name n times

  public static void printName(int n,int cnt){
    if(cnt==n) return;
    System.out.println("piyush chauhan");
    printName(n,cnt+1);
  }

  // function to print linearly 1 to n

  public static void printOneToN(int num,int n){
    if(num>n) return ;
    System.out.print(num+" ");
    printOneToN(num+1,n);
  }

  // function to print n to 1
  public static void printNTo1(int num,int n){
    if(num<1) return;
    System.out.print(num+" ");
    printNTo1(num-1,n);
  }


  // function to print from 1 to n without doing i+1

  public static void print1ToNBackTrack(int num,int n){

    if(num<1) return;
    print1ToNBackTrack(num-1,n);
    // backtrack step
    System.out.print(num+" ");
  }

  // function to print N to 1 without using num-1

  // approach : return time :- print 

  public static void printNto1BackTrack(int n,int num){
    if(num>n) return;
    printNto1BackTrack(n,num+1);
    // backtrack step
    System.out.print(num+" ");
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    //printName();
    //printOneToN(1,n);

    //printNTo1(n,n);

    // print1ToNBackTrack(n,n);

    printNto1BackTrack(n,1);
  }
}