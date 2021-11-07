public class foo {  
    static int fubar = 42;  
    foo getFoo()  
    {  
        return null;  
    }  
    public static void main(String args[])  
    {  
        foo foo = new foo(); 
        System.out.println(foo.getFoo().fubar);  
    }  
} 