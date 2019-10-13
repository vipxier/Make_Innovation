
public class RemoveDuplicateInUnsortedList {
	
	public static Node removeDuplicate(Nod head) {
		if (head == null) {
			return null;
		}
		Node newHead = new Node(head.value);
		Node newCurrentNode = newHead;
		Set<Integer> set = new HashSet<Integer>();
		Node currentNode = head;
		while (currentNode != null) {
			if (!set.contains(currentNode.value)) {
				set.add(currentnode.value);
				newCurrentnode.next = new Node(currentNode.value);
			}
			currentNode = currentNode.next;
		}
		return newHead;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("tet");
//		Node head = new Node(1);
//		head.appendToTail(2);
//		head.appendToTail(12);
//		head.appendToTail(3);
//		head.appendToTail(1);
//		head.appendToTail(12);
//		head.appendToTail(2);
	}
}
