package DataStructur;

public class LinkedListRunner<T> {
	private final LinkedNewList<T> LinkedListRunner;

	public LinkedListRunner() {
		LinkedListRunner = new LinkedNewList<T>();
	}

// Adding the nodes 
	public void add(node<T> i) {
		LinkedListRunner.add(i);
	}

// appending the nodes 
	public void append(node<T> i) {
		LinkedListRunner.append(i);
	}

	public node<T> peak() {
		return LinkedListRunner.head;
	}

	public node<T> popHeadNode() {
		return LinkedListRunner.popHeadNode();
	}

	public node<T> popTailNode() {
		return LinkedListRunner.popTailNode();
	}

	/*
	 * Displaying
	 */
	public void printStack() {
		LinkedListRunner.printMyNode();
	}

	public void empty() {
		LinkedListRunner.empty();
	}

	public void sort() {
		LinkedListRunner.sort();
	}

	public void insertNodesBewteenTheNodes(node<T> currentNode, node<T> newNode) {
		LinkedListRunner.insertNodesBewteenTheNodes(currentNode, newNode);
	}

	public node<T> search(node<T> srchNode) {
		return LinkedListRunner.search(srchNode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListRunner<Integer> linkedList = new LinkedListRunner<>();
		LinkedNewList<Integer> linkedlist1 = new LinkedNewList<Integer>();

		Mynode1<Integer> head = new Mynode1<Integer>(70);
		Mynode1<Integer> secondNode = new Mynode1<Integer>(30);
		Mynode1<Integer> thirdNode = new Mynode1<Integer>(56);
		Mynode1<Integer> fourth = new Mynode1<Integer>(80);

		// (adding nodes)
		linkedList.add(head);
//		linkedList.add(secondNode);
		linkedList.add(thirdNode);

		// (Dispalying the current nodes)
		linkedList.printStack();

		// ( append the nodes )
//		linkedList.append(thirdNode);
		linkedList.append(fourth);
//		linkedList.append(head);
		linkedList.insertNodesBewteenTheNodes(thirdNode, secondNode);
		linkedList.printStack();
		// (pop the nodes head and tail)
//		linkedList.popHeadNode();
		linkedList.popTailNode();
//		linkedList.search(secondNode);
		linkedList.sort();
		// (Dispalying the current nodes)
		linkedList.printStack();
//		linkedList.empty();
	}

}
