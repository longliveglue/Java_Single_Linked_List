public class MyLinkList {

    Node root;
    int size = 0;

    public MyLinkList (Node root){
        this.root = root;
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


}
