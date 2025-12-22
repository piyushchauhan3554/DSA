import java.util.*;
class SumEqualToK{
  
  public static void fun(int idx,int[] arr,List<Integer> list,int n,int k,int sum){
    if(idx==n){
      if(sum==k){
      for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
      }
      System.out.println();
    }
    return;
    }


    list.add(arr[idx]); // pick case 
    sum+=arr[idx];
    
    fun(idx+1,arr,list,n,k,sum);

    sum-=list.get(list.size()-1);
    list.remove(list.size()-1); // non pick case

    fun(idx+1,arr,list,n,k,sum);
  }
  public static void main(String args[]){
    int[] arr={3,1,2};
    List<Integer> list=new ArrayList<>();
    fun(0,arr,list,arr.length,3,0);
  }
}