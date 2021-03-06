public class Q3Stack{
	int size;
	int top1,top2;
	int a[];
	Q3Stack(int n){
		a=new int[n];
		size=n;
		top1=-1;
		top2=size;
	}
	void push1(int x){
		if(top1<top2-1){
			top1++;
			a[top1]=x;
		}
		else{
			System.out.println("Stack Overflow");
		}
	}
	void push2(int x){
		if(top1<top2-1){
			top2--;
			a[top2]=x;
		}
		else{
			System.out.println("Stack Overflow");
		}
	}
	
	int pop1(){
		if(top1>=0){
			int x=a[top1];
			top1--;
			return x;
		}
		else{
			System.out.println("Stack Underflow");
		}
		return 0;
	}
	int pop2(){
		if(top2<size){
			int x=a[top2];
			top2++;
			return x;
		}
		else{
			System.out.println("Stack Underflow");
		}
		return 0;
	}
	public static void main(String [] args){
		Q3Stack s=new Q3Stack(5);
        s.push1(5);
s.push2(10);
s.push2(15);
s.push1(11);
s.push2(7);	
System.out.println("Popped element from stack1 is "+s.pop1());	
s.push2(40);
System.out.println("Popped element from stack2 is "+s.pop2());
	}
}