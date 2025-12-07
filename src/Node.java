public class Node {

    Object value;
    Node nextObj;


    public Node(Object value){
        this.value = value;
    }

    public boolean setNext(Node nextObj){

        if(nextObj != null) {
            this.nextObj = nextObj;
            System.out.printf("The next object has been sucessfully added");
        }
        return false;
    }



}
