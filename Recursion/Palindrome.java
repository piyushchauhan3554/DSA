class Palindrome{
  public static boolean isPalindrome(String s,int i,int n){
    if(i>=n/2) return true;
    if(s.charAt(i)!=s.charAt(n-i-1)) return false;
    return isPalindrome(s,i+1,n);
  }
  public static void main(String args[]){
    String s="abba";
    System.out.print(isPalindrome(s,0,s.length()));
  }
}