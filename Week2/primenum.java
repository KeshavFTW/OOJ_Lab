import java.util.Scanner;
public class primenum{
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if((n%i)==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the intervals ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Prime numbers in given interval are ");
		for(int i=n;i<=m;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
}