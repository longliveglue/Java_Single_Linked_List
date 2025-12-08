public class TestObj {
    public int number;
    public String string;

    public TestObj(int number, String string){
        this.number = number;
        this.string = string;
    }

    public int getNumber(){
        return number;

    }

    public String getString(){
        return string;
    }

    public boolean updateNumber(int number){
        this.number = number;
        return true;
    }

    public boolean updateString(String string){
        this.string = string;
        return true;
    }



}
