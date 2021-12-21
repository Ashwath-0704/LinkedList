package DataStructur;

public class LinkedListRunner<T> {
	private final MyLinkedList<T> LinkedListRunner;

	public LinkedListRunner() {
		LinkedListRunner = new MyLinkedList<T>();
	}

	/*
	 * Adding the nodes
	 */
	public void add(node<T> i) {
		LinkedListRunner.add(i);
	}

	/*
	 * Appending the nodes
	 */
	public void append(node<T> i) {
		LinkedListRunner.append(i);
	}

	/*
	 * Getting head of linked list peak
	 */
	public node<T> peak() {
		return LinkedListRunner.head;
	}

	/*
	 * Pop the head of the linked list
	 */
	public node<T> popHeadNode() {
		return LinkedListRunner.popHeadNode();
	}

	/*
	 * Pop the last node of the linked list
	 */
	public node<T> popTailNode() {
		return LinkedListRunner.popTailNode();
	}

	/*
	 * Displaying the current linked list nodes
	 */
	public void printStack() {
		LinkedListRunner.printMyNode();
	}

	/*
	 * Checking for size of linked list
	 */
	public void empty() {
		LinkedListRunner.empty();
	}

	/*
	 * Sorting the nodes linked list
	 */
	public void sort() {
		LinkedListRunner.sort();
	}

	/*
	 * Inserting the new node between the nodes
	 */
	public void insertNodesBewteenTheNodes(node<T> currentNode, node<T> newNode) {
		LinkedListRunner.insertNodesBewteenTheNodes(currentNode, newNode);
	}

	/*
	 * finding the nodes
	 */
	public node<T> search(node<T> srchNode) {
		return LinkedListRunner.search(srchNode);
	}

	/*
	 * linked list runtime main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListRunner<Integer> linkedList = new LinkedListRunner<>();
		MyLinkedList<Integer> linkedlist1 = new MyLinkedList<Integer>();

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
