import java.util.*;
class Reverse{

  public static void reverseArray(int[] arr,int i,int n){
    if(i>n/2) return;
    // swapping 

    int temp=arr[i];
    arr[i]=arr[n-1-i];
    arr[n-1-i]=temp;

    reverseArray(arr,i+1,n);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int[] arr=new int[n];

    System.out.println("enter array elements");
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    // sc.close();

    System.out.print("original array is :- ");
    for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    System.out.println();


    reverseArray(arr,0,n);


    System.out.print("reversed array is :- ");
    for(int i=0;i<n;i++) System.out.print(arr[i]+" ");

  }
}