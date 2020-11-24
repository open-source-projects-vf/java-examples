public class HelloWorld {
    
    public String sameReturnValue(String s) {
        return s;
    }

    public void unusedParameter(String s) {
        if(true) {}
        System.out.println("Hello world!");
    }
    
    public void unusedParameterWithAlwaysTrueClosure(String s) {
        if(true) {}
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sameReturnValue("hi"));
    }
}
