class LinkedList {
    Node head;
    int length;
    Node last;

    LinkedList() {
        head = null;
        length = 0;
        last = null;
    }

    void add(int data) {
        // create the new node with the given data
        Node node = new Node(data);
        // check it the node is the first node or not
        if (head == null) {
            // if it is first node then update the head and last;
            head = node;
            last = head;
        } else {
            // add the node to the last of the list
            last.next = node;
            // update the last
            last = last.next;
        }
        length++;
        return;
    }

    void remove(int key) {
        // Store head node 
        Node temp = head, prev = null; 
  
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) return; 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 
        return;
    }

    void display() {
        Node node = head; 
        while (node != null) 
        { 
            System.out.print(node.data+" "); 
            node = node.next; 
        } 
    }
}
