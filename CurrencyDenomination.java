import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenomination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		printCurrentcyDenomination(arr,size,amount);
	}

	private static void printCurrentcyDenomination(int[] arr, int size,int amount) {
		Arrays.sort(arr);

		for(int i=size-1;i>=0;i--) {
			int res = 0;

			while(amount>=arr[i] && (amount-arr[i])>=0) {
				amount -=arr[i];
				res++;
			}
			if(res!=0) {
				System.out.println(arr[i] +" : "+res);
			}
			if(amount==0) {
				break;
			}
		}

	}
}
