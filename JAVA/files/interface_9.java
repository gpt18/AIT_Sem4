package files;
import java.io.*;
interface interface_9 {
    final int a=10;
void display();
}
class TestClass implements interface_9 {
public void display(){
    System.out.println("Geek");
}
 public static void main(String[] args) {
        TestClass t=new TestClass();
        t.display();
        System.out.println(a);
    } 
}

    
