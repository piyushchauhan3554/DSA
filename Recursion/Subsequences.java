import java.util.*;
class Subsequences{
  public static void printSubSeq(int idx,int[] arr,List<Integer> list,int n){
    if(idx==n){
      for(int i=0;i<list.size();i++) {
        System.out.print(list.get(i)+" ");
      }
      if(list.size()==0) System.out.print("{}");
      System.out.println();
      return;
    }

    list.add(arr[idx]);
    printSubSeq(idx+1,arr,list,n);
    list.remove(list.size()-1);
    printSubSeq(idx+1,arr,list,n);
  }
  public static void main(String args[]){
    int arr[]={3,1,2};
    List<Integer> list=new ArrayList<>();
    printSubSeq(0,arr,list,arr.length);
  }
}