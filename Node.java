public class Node {
    // Node of a singly linked list of customerRecord
    private customerRecord element;
    private Node next;

    //Create a node with the given element and next node.
    public Node(customerRecord s){element = s; next = null;}
    //Returns the element of this node
    public customerRecord getElement(){return element;}
    //Returns the next node if this node
    public Node getNext(){return next;}
    //Modifier methods:

    //Name: setElement
    //Behavior: Sets the element of this node
    //Parameter: newElement - new element
    //Return: None
    public void setElement(customerRecord newElement){ element = newElement;}

    //Name: setNode
    //Behavior: sets the next node of this node
    //Parameter: newNext - new node
    //Return: None
    public void setNext(Node newNext){next = newNext;}
}
