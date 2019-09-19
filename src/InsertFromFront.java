
public class InsertFromFront {
	public static void main(String[] args) {
		InsertFromFront sList = new InsertFromFront();  
		  
        //Adding 10 to the list  
        sList.addAtStart(10);  
        sList.display();  
  
        //Adding 20 to the list  
        sList.addAtStart(20);  
        sList.display();  
  
        //Adding 30 to the list  
        sList.addAtStart(30);  
        sList.display();  
  
        //Adding 40 to the list  
        sList.addAtStart(40);  
        sList.display();  
        
        //Delete from Start
        sList.deleteFromStart();
        sList.display();
   
	}
	
	class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public Node head = null;  
    public Node tail = null;  
  
    //addAtStart() will add a new node to the beginning of the list  
    public void addAtStart(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            Node temp = head;  
            head = newNode;  
            head.next = temp;  
        }  
    }  
    
    public void deleteFromStart() {
    	if(head == null) {
    		System.out.println("List is empty");
    		return;
    	}else {
    		if(head != tail) {
    			head = head.next;
    		}else {
    			head = tail = null;
    		}
    	}
    }
  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
}
