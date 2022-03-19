import java.util.Scanner;
class Book{
	private String name;
	private String author;
	private int price;
	private int num_pages;
	public Book(String name, String author, int price, int num_pages){
		this.name=name;
		this.author=author;
		this.price=price;
		this.num_pages=num_pages;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setNum_pages(int num_pages){
		this.num_pages=num_pages;
	}
	public String getName(){
		return name;
	}
	public String getAuthor(){
		return author;
	}
	public int getPrice(){
		return price;
	}
	public int getNum_pages(){
		return num_pages;
	}
	public String toString(){
		return ("Name = "+name+" Author = "+author+" Price = "+price+" Number of pages = "+num_pages);
	}

}
public class BookUse{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of book details you want to enter");
		int num=s.nextInt();
		Book[] barr=new Book[num];
		for(int i=0;i<barr.length;i++){
			System.out.println("Enter the name of book "+(i+1));
			String name=s.next();
			System.out.println("Enter the Author of book "+(i+1));
			String author=s.next();
			System.out.println("Enter the Price of book "+(i+1));
			int price=s.nextInt();
			System.out.println("Enter the Number of pages in that book "+(i+1));
			int num_pages=s.nextInt();
			barr[i]=new Book(name,author,price,num_pages);
		}
		int ch;
		while(true){
			System.out.println("Operations that can be done on book class ");
			System.out.println("1-Set Name of Any book");
			System.out.println("2-Set Author of Any book");
			System.out.println("3-Set Price of Any book");
			System.out.println("4-Set Number of pages of Any book");
			System.out.println("5-Get Name of Any book");
			System.out.println("6-Get Author of Any book");
			System.out.println("7-Get Price of Any book");
			System.out.println("8-Get Number of pages of Any book");
			System.out.println("9-Get details of that book");
			System.out.println("10-Exit");
			ch=s.nextInt();
			int i;
			switch(ch){
				case 1:
				System.out.println("Which book's Name you want to set again");
				i=s.nextInt();
				System.out.println("Enter the name of book "+(i));
				String name=s.next();
				barr[i-1].setName(name);
				break;
				case 2:
				System.out.println("Which book's Author you want to set again");
				i=s.nextInt();
				System.out.println("Enter the Author of book "+(i));
				String author=s.next();
				barr[i-1].setAuthor(author);
				break;
				case 3:
				System.out.println("Which book's Price you want to set again");
				i=s.nextInt();
				System.out.println("Enter the Price of book "+(i));
				int price=s.nextInt();
				barr[i-1].setPrice(price);
				break;
				case 4:
				System.out.println("Which book's number of pages you want to set again");
				i=s.nextInt();
				System.out.println("Enter the Author of book "+(i));
				int num_pages=s.nextInt();
				barr[i-1].setNum_pages(num_pages);
				break;
				case 5:
				System.out.println("Which book's Name you want to get");
				i=s.nextInt();
				System.out.println("Name of book "+i+" "+barr[i-1].getName());
				break;
				case 6:
				System.out.println("Which book's Author you want to get");
				i=s.nextInt();
				System.out.println("Author of book "+i+" "+barr[i-1].getAuthor());
				break;
				case 7:
				System.out.println("Which book's Price you want to get");
				i=s.nextInt();
				System.out.println("Price of book "+i+" "+barr[i-1].getPrice());
				break;
				case 8:
				System.out.println("Which book's Number of pages you want to get");
				i=s.nextInt();
				System.out.println("Number of pages of book "+i+" "+barr[i-1].getNum_pages());
				break;
				case 9:
				System.out.println("Which book's Details you want to get");
				i=s.nextInt();
				System.out.println(barr[i-1].toString());
				break;
				case 10:
				System.exit(0);
				break;
				default:
				System.out.println("Invalid Entry!! try again");
				break;
			}
		}
		
	}
}