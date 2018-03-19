class GenericStack <T>{
	private int top,maxSize;
	private T[] stack;
	
	GenericStack(int size){
		maxSize=size;
		top=-1;
		stack=(T[])new Object[maxSize];
	}
	 
	
	boolean isEmpty(){
		return (top==-1);
	}
	
	boolean isFull(){
		return (top==maxSize-1);
	}
	
	T peak(){
		if(isEmpty())
			return null;
		return stack[top];
	}
	
	T pop(){
		if(isEmpty())
			return null;
		return stack[top--];
	}
	
	void push(T i){
		if(isFull())
			System.out.println("Stack is Full");
		else
			stack[++top]= i;
	}
	
	public static void main(String args[]){
		GenericStack <Integer> stack1=new GenericStack<Integer>(5);
		stack1.push(67);
		stack1.push(34);
		stack1.push(56);
		stack1.push(77);
		stack1.push(12);
		//stack1.push(51);
		//stack1.print();
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
		
	}
	
}