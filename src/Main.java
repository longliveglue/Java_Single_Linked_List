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

        TestObj obj1 = new TestObj(10, "Tom");
        TestObj obj2 = new TestObj(119, "Laura");
        TestObj obj3 = new TestObj(102, "William");
        TestObj obj4 = new TestObj(103, "Matilda");
        TestObj obj5 = new TestObj(1, "Cookie");

        Node nodeObj1 = new Node(obj1);
        Node nodeObj2 = new Node(obj2);
        Node nodeObj3 = new Node(obj3);
        Node nodeObj4 = new Node(obj4);
        Node nodeObj5 = new Node(obj5);

        MyLinkList objLinkList = new MyLinkList(nodeObj1);
        objLinkList.addLink(nodeObj2);
        objLinkList.addLink(nodeObj3);
        objLinkList.addLink(nodeObj4);
        objLinkList.addLink(nodeObj5);


        Node nObj1 = objLinkList.next();
        TestObj tObj1 = (TestObj) nObj1.getValue();

        System.out.println(tObj1.getNumber() + " " + tObj1.getString());


    }

}
