
public class MyStackNode<T> {
	private T t;
	public MyStackNode<T> nextNode = null;
	public MyStackNode(T tValue) {
		t = tValue;
	}
	public T getValue() { return t; }
}
