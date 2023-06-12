package LambdaRevision;

public interface Voting {
    String myMethod(String name);
}
class Test{
    public static void printMessage(String name,Voting v){
        String message = v.myMethod(name);
        System.out.println(message);
    }
    public static void main(String[] args) {
        Voting v=(name)->"Hello"+name;
        printMessage("John",v);
    }
}
