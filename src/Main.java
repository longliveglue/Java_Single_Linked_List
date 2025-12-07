public class Main {

    public static void main(String[] args){

        Node node = new Node(1);
        MyLinkList linkyList = new MyLinkList(node);

        for (int i = 0; i < 30; i++){
            Node newNode = new Node(i);
            linkyList.addLink(newNode);
        }


        linkyList.printList();
    }

}