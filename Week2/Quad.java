import java.util.Scanner;
import java.lang.Math;
class Quadfun{
	int a;
	int b;
	int c;
	Quadfun(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int disc(){
		int d;
		d=b*b-(4*a*c);
		return d;
	}
	public void roots(){
		double root1,root2;
		int d=disc();
		if(d>0){
			root1=(-b+Math.sqrt(d))/(2*a);
			root2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Roots are real and distinct Root1 = "+root1+" Root2 = "+root2);
		}
		else if(d==0){
			root1=-b/(2.0*a);
			root2=root1;
			System.out.format("Roots are real and Identical Root1 = %.2f Root2 = %.2",root1,root2);
		}
		else{
			double real=(-b)/(2.0*a);
			double imag=(Math.sqrt(-d))/(2*a);
			System.out.format("Roots are imaginary and Identical Root1 = %.2f + .2%fi Root2 = %.2f - %.2fi",real,imag,real,imag);
		}
	}
}
public class Quad{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the values of A,B,C respectively");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Quadfun qf=new Quadfun(a,b,c);
		qf.roots();
	}
}