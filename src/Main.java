public class Main {

    public static void main(String[] args){

        Node node = new Node(1);
        MyLinkList linkyList = new MyLinkList(node);

        for (int i = 0; i < 10; i++){
            Node newNode = new Node(i);
            linkyList.addLink(newNode);
        }

        while(linkyList.hasNext()){
            Node newNode = linkyList.next();
            System.out.println(newNode.getValue());
        }

        //linkyList.printList();
    }

}
