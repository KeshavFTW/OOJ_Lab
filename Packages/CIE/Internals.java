package CIE;
import java.util.Scanner;
public class Internals extends CIE.Student{
	int[] imarks;
	Scanner sc;
	public Internals(String usn, String name, int sem){
		super(usn, name, sem);
		sc = new Scanner(System.in);
		imarks = new int[5];
	}
	public void setmarks(){
		for(int i=0;i<imarks.length;i++){
			System.out.println("Enter the marks of Subject "+(i+1));
			imarks[i]=sc.nextInt();
		}
	}
}