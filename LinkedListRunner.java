package DataStructur;

public class LinkedListRunner<T> {
	/*
	 * linked list runtime main
	 */
	public static void main(String[] args) {

		MyLinkedList<Integer> linkedlist1 = new MyLinkedList<Integer>();

		Mynode1<Integer> head = new Mynode1<Integer>(70);
		Mynode1<Integer> secondNode = new Mynode1<Integer>(30);
		Mynode1<Integer> thirdNode = new Mynode1<Integer>(56);
		Mynode1<Integer> fourth = new Mynode1<Integer>(80);

		// (adding nodes)
		linkedlist1.add(head);
//		linkedlist1.add(secondNode);
		linkedlist1.add(thirdNode);

		// (Dispalying the current nodes)
		linkedlist1.printMyNode();

		// ( append the nodes )
//		linkedlist1.append(thirdNode);
		linkedlist1.append(fourth);
//		linkedlist1.append(head);
		linkedlist1.insertNodesBewteenTheNodes(thirdNode, secondNode);
		linkedlist1.printMyNode();
		// (pop the nodes head and tail)
//		linkedlist1.popHeadNode();
		linkedlist1.popTailNode();
//		linkedlist1.search(secondNode);
		linkedlist1.sort();
		// (Dispalying the current nodes)
		linkedlist1.printMyNode();
//		linkedlist1.empty();
	}

}
