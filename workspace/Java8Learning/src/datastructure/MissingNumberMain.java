package datastructure;
public class MissingNumberMain {
 
 public static void main(String[] args) {
   
  int[] arr1={7,5,6,1,4,2};
  System.out.println("Missing number from array arr1: "+missingNumber(arr1));
  int[] arr2={5,3,1,2};
  System.out.println("Missing number from array arr2: "+missingNumber(arr2));
  int[] arr3={15,13,11,12};
  System.out.println("Missing number from array arr2: "+missingNumber(arr3));
 
 }
 
 public static int missingNumber(int[] arr)
 {
  int n=arr.length+1;
  int sum=n*(n+1)/2;
  System.out.println(sum);
  int restSum=0;
  for (int i = 0; i < arr.length; i++) {
   restSum+=arr[i];
  }
  System.out.println(restSum);
  int missingNumber=sum-restSum;
  return missingNumber;
 }
}