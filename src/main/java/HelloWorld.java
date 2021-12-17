public class HelloWorld {
    
    public String sameReturnValue(String s) {
        if(true) {
            System.out.println("Hello");   
        }
        if(true) {
            System.out.println("Hello");   
            System.out.println("Hello");   
            System.out.println("Hello");   
        }
        return s;
    }
}
