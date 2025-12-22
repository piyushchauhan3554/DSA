import java.util.*;
class SumEqualToK{
  public static boolean fun(int idx,int[] arr,List<Integer> list,int n,int k,int sum){
    if(idx==n){
      if(sum==k){
      for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
      }
      System.out.println();
      return true;
    }
    return false;
    }


    list.add(arr[idx]); // pick case 
    sum+=arr[idx];
    
    if(fun(idx+1,arr,list,n,k,sum)==true) return true; // no further calls

    sum-=list.get(list.size()-1);
    list.remove(list.size()-1); // non pick case

    if(fun(idx+1,arr,list,n,k,sum)==true) return true;

    return false;
  }
  public static void main(String args[]){
    int[] arr={1,2,1};
    List<Integer> list=new ArrayList<>();
    if(!fun(0,arr,list,arr.length,2,0)) System.out.print("There is not a single subsequence whose sum is equal to k");
  }
}