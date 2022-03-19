import java.util.Scanner;
import java.lang.Math;

class student
{
    String usn,name;
    int credits[];
    double marks[];
    int n;
    double sgpa;
    Scanner in=new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter the students name: ");
        name=in.nextLine();
        System.out.println("Enter the students USN: ");
        usn=in.nextLine();
        System.out.println("Enter number of subjects: ");
        n=in.nextInt();
        credits=new int[n];
        marks=new double[n];
        System.out.println("Enter details of subject: ");
        for(int i=0;i<n;i++){
        System.out.println("Enter credit of "+(i+1) +" subject: ");
        credits[i]=in.nextInt();
        System.out.println("Enter marks of "+(i+1) +" subject: ");
        marks[i]=in.nextInt();
        }
    }
    void cal()
    {
        int c=0,sg=0,tc=0;
        for(int j=0;j<n;j++){
            tc=tc+credits[j];
        }
        for(int i=0;i<n;i++){
            if(marks[i]>=90 && marks[i]<=100)
            {
                c=c+(10*credits[i]);
            }
            
            else if(marks[i]>=80 && marks[i]<90)
            {
                c=c+(9*credits[i]);
            }
            else if(marks[i]>=70 && marks[i]<80)
            {
                c=c+(8*credits[i]);
            }  
            else if(marks[i]>=60 && marks[i]<70)
            {
                c=c+(7*credits[i]);
            }  
            else if(marks[i]>=50 && marks[i]<60)
            {
                c=c+(6*credits[i]);
            }  
            else if(marks[i]>=40 && marks[i]<50)
            {
                c=c+(5*credits[i]);
            }
            else{
                System.out.println("Failed in subject "+(i+1));
            }
        }
        sgpa=(c/tc);
    }
    void display()
    {
        System.out.println(" ------------- STUDENTS DETAILS-----------");
        System.out.println("USN : "+usn );
        System.out.println(" NAME : "+name);
        System.out.println(" SGPA : "+sgpa);
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		student s1=new student();
		s1.accept();
		s1.cal();
		s1.display();
	}
}