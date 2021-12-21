package DataStructur;

interface node<T> {

	T getData();

	void setData(T data);

	node<T> getNext();

	void setNext(node<T> next);
}

public class Mynode1<T> implements node<T> {

	private T data;
	private node<T> next;

	public Mynode1(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public node<T> getNext() {
		return next;
	}

	public void setNext(node<T> next) {
		this.next = next;
	}

	public String toString() {
		StringBuilder MyNodeString = new StringBuilder();
		MyNodeString.append(data);
		if (next != null) {
			MyNodeString.append("->").append(next);
		}
		return MyNodeString.toString();

	}

}