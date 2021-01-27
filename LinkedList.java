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

    int remove(int data) {
        // search got the data and remove from the list
        return 0;
    }

    void display() {
        // implement the display functionality.

    }
}