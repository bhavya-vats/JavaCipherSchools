package week2;

public class program15 {
    int arg=5;
    void myTest(int arg) { //default constructor
        arg=arg;
    }
    public static void main(String[] args) {
        int arg=10;
        program15 obj=new program15();
        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}

