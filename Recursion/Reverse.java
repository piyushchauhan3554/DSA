import java.util.*;
class Reverse{

  public static void reverseArray(int[] arr,int si,int ei){
    if(si>=ei) return;
    // swapping 

    int temp=arr[si];
    arr[si]=arr[ei];
    arr[ei]=temp;

    reverseArray(arr,si+1,ei-1);
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


    reverseArray(arr,0,n-1);


    System.out.print("reversed array is :- ");
    for(int i=0;i<n;i++) System.out.print(arr[i]+" ");

  }
}