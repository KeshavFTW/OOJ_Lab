import java.util.*;
public class pattren{
	public static void main(String[] args){
	    int k=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of rows you want ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}