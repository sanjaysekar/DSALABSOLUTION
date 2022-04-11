import java.util.Scanner;

public class TransactionsProcessing {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int n = sc.nextInt();
		System.out.println("Enter the values of array");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNeedToBeAchieved = sc.nextInt();
		System.out.println("Enter the value of target");
		int valueOfTarget = sc.nextInt();
		
		isTargetAchived(arr,n,targetNeedToBeAchieved,valueOfTarget);
		
	}

	private static void isTargetAchived(int[] arr, int n, int targetNeedToBeAchieved, int valueOfTarget) {
		boolean istargetAchieved = false;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(valueOfTarget<=sum) {
				if(targetNeedToBeAchieved>=(i+1)) {
				System.out.println("Target achieved in "+(i+1)+" transactions");
				istargetAchieved = true;
				break;
				}else {
					istargetAchieved = false;
					break;
				}
				
			}
		}
		if(!istargetAchieved) {
			System.out.println("Target not achieved");
		}
	}

}