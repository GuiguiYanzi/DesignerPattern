import facadePattern.Facade;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Facade facade=new Facade();
        facade.operation();
    }
}