import java.util.*;
public class Q1sorting{
	public static void insertionSort(int a1[]){
		int n=a1.length;
		int num=a1[n-1];
		for(int i=n-2;i>=0;i--){
			if(a1[i]>num){
				a1[i+1]=a1[i];
				display(a1);
			}
			else{
				a1[i+1]=num;
				display(a1);
				break;
			}
			if((i==0)&&(a1[i]>num)){
				a1[i]=num;
				display(a1);
			}
		}
	}
	static void display(int a1[]){
		for(int ans:a1){
			System.out.print(ans + " ");
		}
		System.out.println();
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a1[]={1,2,4,5,3};
		insertionSort(a1);
	}
}