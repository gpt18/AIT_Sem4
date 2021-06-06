package files;
abstract class Animal{
    public abstract void animalSound(); 
    public void sleep(){
        System.out.println("Zzz");
    }
}
class Pigs extends Animal{
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
public class abstraction_8 {
    public static void main(String[] args) {
        Pigs mypPigs=new Pigs();
        mypPigs.animalSound();
        mypPigs.sleep();
    }
}
