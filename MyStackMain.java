
public class MyStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<String> my = new MyStack<String>();
		my.print();
		my.push("abc1");
		my.push("abc2");
		my.push("abc3");
		my.print();
		System.out.println("isEmpty value " + my.isEmpty());
		System.out.println("pop value " + my.pop());
		System.out.println("pop value " + my.pop());
		System.out.println("pop value " + my.pop());
		System.out.println("pop value " + my.pop());
		my.print();
		System.out.println("isEmpty value " + my.isEmpty());
		my.print();
		my.peek();
	}

}
