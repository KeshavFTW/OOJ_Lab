class Generic<O,P>{
	O ob1;
	P ob2;
	public Generic(O ob1, P ob2){
		this.ob1=ob1;
		this.ob2=ob2;
	}
	public void getTypeofO(){
		System.out.println("Type of First Object is " + ob1.getClass().getName());
	}
	public void getTypeofP(){
		System.out.println("Type of Second Object is " + ob2.getClass().getName());
	}
	public O getObject(O ob1){
		return ob1;
	}
	public P getObject(){
		return ob2;
	}
}
public class GenericsUse{
	public static void main(String[] args){
		Generic<String,Integer> g1=new Generic<>("Akash",19);
		g1.getTypeofO();
		g1.getTypeofP();
		String name=g1.getObject("Akash");
		Integer age=g1.getObject();
		System.out.println(name+" "+age);
	}

} 