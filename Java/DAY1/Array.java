import java.util.Scanner;

public class Array{
     public static void main(String[]args){
		int size;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size"); 
		size=in.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
				arr[i]=in.nextInt();
			}
		int sum=0;
		for(int i=0;i<size;i++){
				sum+=arr[i];
			}
		System.out.println(sum); 
		}
	}