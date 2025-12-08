public class Node {

    private Object value;
    private Node rightLink;


    public Node(Object value) {
        this.value = value;
        this.rightLink = null;
    }

    public Object getValue() {
        return this.value;
    }

    public void setNext(Node nextNode) {
        if (rightLink == null) {
            this.rightLink = nextNode;
        } else {
            rightLink.setNext(nextNode);
        }
    }

    public Node next() {
        return rightLink;
    }

    public void printList() {
        System.out.println(value);
        if (rightLink != null) {
            rightLink.printList();

        }
    }

    public boolean hasNext(){
        if(rightLink != null){
            return true;
        }
        return false;
    }
}
