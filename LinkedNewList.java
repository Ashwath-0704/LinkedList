package DataStructur;

public class LinkedNewList<T> {
	int size;
	public node<T> head;
	public node<T> tail;

	public LinkedNewList() {
		this.head = null;
		this.tail = null;
	}

	/*
	 * Adding the nodes
	 * 
	 */
	public void add(node<T> data) {
		if (this.tail == null) {
			this.tail = data;
		}
		if (this.head == null) {
			this.head = data;
			System.out.println("Added " + this.head);
		} else {
			node<T> tempNode = this.head;
			this.head = data;
			System.out.println("Added " + this.head);
			this.head.setNext(tempNode);
		}
	}

	/*
	 * Deleting the nodes at head
	 */
	public node<T> popHeadNode() {
		node<T> temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	/*
	 * Appending the nodes at last
	 */
	public void append(node<T> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/*
	 * Deleting the nodes at head
	 */
	public node<T> popTailNode() {
		node<T> temp = this.head;

		while (!temp.getNext().equals(tail)) {
			temp = temp.getNext();
		}
		this.head = temp;
		temp = temp.getNext();
		System.out.println(temp);
		return temp;
	}

	/*
	 * Insert the new node between two Nodes
	 */
	public void insertNodesBewteenTheNodes(node<T> currentNode, node<T> newNode) {
		node<T> temp = currentNode.getNext();
		currentNode.setNext(newNode);
		newNode.setNext(temp);
	}

	/*
	 * Checking the Linked List
	 */
	boolean empty() {
		// Checking if head node points to null
		if (head == null) {
			System.out.println("\nLinked List is empty");
			return true;
		}
		System.out.println("\nLinked List is not empty");
		return false;
	}

	public node<T> search(node<T> srchNode) {
		node<T> tempNode = this.head;
		int count = 0;
		Boolean elem_found = false;
		while (tempNode.getNext() != null && (elem_found.equals(false))) {
			if (tempNode.getData().equals(srchNode.getData())) {
				elem_found = true;
				break;
			}
			tempNode = tempNode.getNext();
			count++;
		}
		if (elem_found.equals(false)) {
			count = -1;
		}
		System.out.println("\nYour linked list values are : (" + tempNode + ")");
		return tempNode;
	}

	/*
	 * Displaying the nodes
	 */
	public void printMyNode() {
		System.out.println("\n_____________________\nCurrent nodes are : " + head);
	}
	/*
	 * sort 
	 */
	public <T extends Comparable<T>> void sort() {
		node<T> current = (node<T>) head, index = null;
		empty();
		while (current != null) {
			index = current.getNext();
			while (index != null) {
				if ((current.getData().compareTo(index.getData()) > 0)) {
					T temp = current.getData();
					current.setData(index.getData());
					index.setData(temp);
				}
				index = index.getNext();
			}
			current = current.getNext();
		}
	}
}
