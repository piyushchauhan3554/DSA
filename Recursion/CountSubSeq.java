class CountSubSeq{
  public static int countSequences(int idx,int[] arr,int sum,int k,int n){
    if(idx==n){
      if(sum==k) return 1;
      return 0;
    }
    return countSequences(idx+1,arr,sum+arr[idx],k,n) + countSequences(idx+1,arr,sum,k,n);
  } 
  public static void main(String args[]){
    int[] arr={1,2,1,2,1};
    System.out.println(countSequences(0,arr,0,2,arr.length));
  }
}