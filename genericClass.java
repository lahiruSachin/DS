class A <T>{
	T v;
	void add(T v){
		this.v=v;
	}
	T get(){
		return v;
	}
}

class App{
	public static void main(String args[]){
		A <Integer> ob1=new A <Integer>();
		ob1.add(10);
		A <String> ob2 =new A <String>();
		ob2.add("Amma");
		
		System.out.println(ob1.get());
		System.out.println(ob2.get());
	}
	
}