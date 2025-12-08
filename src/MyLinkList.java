public class MyLinkList {

    Node root;
    int size = 0;
    Node currentItem;
    Node nextItem;
    boolean firstNext = true;

    public MyLinkList (Node root){
        this.root = root;
        this.currentItem = root;
        size++;
    }

    public void addLink(Node newRightLink){
        root.setNext(newRightLink);
    }

    public void printList(){
        System.out.println("----- Contents of List -----");
        root.printList();
        System.out.println("----- Last Item ------");
    }

    public boolean hasNext(){
        if(currentItem.hasNext()){
            return true;
        }
        return false;
    }

   public Node next(){
        if(firstNext){
            firstNext = false;
            return currentItem;
        }

        if(currentItem != null) {
            nextItem = currentItem.next();
            currentItem = currentItem.next();
            return nextItem;
        }

        return null;
   }

   public static Node createNode(int number, String string){
        TestObj testy = new TestObj(number, string);
        Node nodey = new Node(testy);
        return nodey;
   }

}
