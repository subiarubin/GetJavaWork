import java.util.Scanner;

public class Minmax {
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			 int arr[] = new int[5];
					 //{10, 4, 5, 4, 8, 10};
			 for(int i=0;i<arr.length;i++)
			 {
				 arr[i]=sc.nextInt();
			 }
			 
	         int max = getMax(arr);
	     System.out.println("Max= "+max);
	 
	    
	     int min = getMin(arr);
	     System.out.println("Min= "+min);
	   }
	 
	   public static int getMax(int[] inputArray){
	     int maxValue = inputArray[0];
	     for(int i=1;i < inputArray.length;i++){
	       if(inputArray[i] > maxValue){
	          maxValue = inputArray[i];
	       }
	     }
	     return maxValue;
	   }
	   public static int getMin(int[] inputArray){
	     int minValue = inputArray[0];
	     for(int i=1;i<inputArray.length;i++){
	       if(inputArray[i] < minValue){
	         minValue = inputArray[i];
	       }
	     }
	     return minValue;
	   }
	}




