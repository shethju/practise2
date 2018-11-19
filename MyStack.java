package basic.minstack;

public class MyStack<T extends Comparable<T>> {
	MyStackNode<T> tos = null;
	
	//public MyStack() {}
	
	public boolean empty() {
		return (tos == null) ? true : false;
	}
	
	public void push(T t) {
		MyStackNode<T> tmp = new MyStackNode<T>(t); // Note constructor
		if (tos == null) {
			tos = tmp;
			tmp.setMinValue(t);
		} else {
			if (tmp.compareTo(tos) < 0) {
				tmp.setMinValue(t);
			} else {
				tmp.setMinValue(tos.getMinValue());
			}
			tmp.nextNode = tos;
			tos = tmp;
		}
	}
	
	public T pop() {
		if (empty()) return null;
		T value = tos.getValue();
		tos = tos.nextNode;
		return value;
	}

	public T peek() {
		return (empty()) ? null : tos.getValue();
	}
	
	public T getMinValue() {
		return (empty()) ? null : tos.getMinValue();
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
