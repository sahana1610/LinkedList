
public class SinglyLinkedList {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList(); 
		  
        list = insert(list, 10); 
        list = insert(list, 20); 
        list = insert(list, 30); 
        list = insert(list, 40); 
        list = insert(list, 50); 
        list = insert(list, 60); 
        list = insert(list, 70); 
        list = insert(list, 80); 
        printList(list); 
        
        list = deleteByKey(list, 30);
        
        printList(list); 
		
	}

	Node head; // head of list 
	  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static SinglyLinkedList insert(SinglyLinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty,then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
    
    public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) 
    { 
        // Store head node 
        Node currNode = list.head, prev = null; 
  
        // CASE 1:If head node itself holds the key to be deleted 
        if (currNode != null && currNode.data == key) { 
            list.head = currNode.next; // Changed head 
            System.out.println(key + " found and deleted"); 
            return list; 
        } 
  
        // CASE 2:If the key is somewhere other than at head   
        while (currNode != null && currNode.data != key) { 
            // If currNode does not hold key 
            // continue to next node 
            prev = currNode; 
            currNode = currNode.next; 
        } 
  
        // Therefore the currNode shall not be null
        if (currNode != null) { 
            // Since the key is at currNode 
            prev.next = currNode.next; 
  
            // Display the message 
            System.out.println(key + " found and deleted"); 
        } 
  
        // CASE 3: The key is not present 
        if (currNode == null) { 
            // Display the message 
            System.out.println(key + " not found"); 
        } 
  
        // return the List 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(SinglyLinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.println(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
}
