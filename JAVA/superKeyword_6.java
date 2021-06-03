class parent{
    int a=10;
    static int b=20;
}
class Base extends parent{
    
    void rr(){
        System.out.println(super.a);
        System.out.println(super.b);
        
    }
}
class superkeyword_6 {
    public static void main(String[] args) {
        new Base().rr();
    }
}
