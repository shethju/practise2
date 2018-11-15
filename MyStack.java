
public class MyStack<T> {
	MyStackNode<T> tos = null;
	
	public MyStack() {}
	
	public boolean isEmpty() {
		return (tos == null) ? true : false;
	}
	
	public void push(T t) {
		MyStackNode<T> tmp = new MyStackNode<T>(t);
		if (tos == null) {
			tos = tmp;
		} else {
			tmp.nextNode = tos;
			tos = tmp;
		}
	}
	
	public T pop() {
		if (isEmpty()) return null;
		T value = tos.getValue();
		tos = tos.nextNode;
		return value;
	}

	public void peek() {
		// TODO Auto-generated method stub
		
	}
	
	public void print() {
		MyStackNode<T> tosCopy = tos;
		System.out.println("Printing values: ");
		while (tosCopy != null) {
			System.out.println(tosCopy.getValue());
			tosCopy = tosCopy.nextNode;
		}
		System.out.println("Done Printing values: ");
	}
	
}
