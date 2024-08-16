package Singleton_Class;

public class SIngleton {
    public static void main(String[] args) {
     ABC obj = ABC.getInstance();
    }
}

class ABC{
    static ABC obj = new ABC();
    private ABC(){

    }
    public static ABC getInstance(){
        return obj;
    }

    void startApplication(){
        System.out.println("Application is starting...");
    }
}

