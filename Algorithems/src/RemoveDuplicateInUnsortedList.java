import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInUnsortedList {
	
	public static Node removeDuplicate(Node head) {
		if (head == null) {
			return null;
		}
		Node newHead = new Node(head.value);
		Node newCurrentNode = newHead;
		Set<Integer> set = new HashSet<Integer>();
		Node currentNode = head;
		while (currentNode != null) {
			if (!set.contains(currentNode.value)) {
				
				set.add(currentNode.value);
				newCurrentNode.next = new Node(currentNode.value);
				newCurrentNode = newCurrentNode.next;
			}
			currentNode = currentNode.next;
		}
		return newHead;
	}
	
	public Node removeDupilicateNode(Node root)
	{
		
	}
	
	public void mergeSort(int[] array)
	{
		sort(array, 0, array.length);
	}
	
	private static void sort(int[] array, int start, int end)
	{
		if(start < end)
		{
			int mid = start + (end - start) / 2;
			
			sort(array, start, mid);
			sort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}
	
	private static void merge(int[] array, int start, int mid, int end)
	{
		int len1 = mid - start + 1;
		int len2 = end - mid;
		
		int[] left = ArrayUtils.
	}
	
	
	public static void main(String[] args)
	{
		Node head = new Node(1);
		head.appendToTail(2);
		head.appendToTail(12);
		head.appendToTail(3);
		head.appendToTail(1);
		head.appendToTail(12);
		head.appendToTail(2);
		System.out.println(removeDuplicate(head).printAllNodes());
	}
}
