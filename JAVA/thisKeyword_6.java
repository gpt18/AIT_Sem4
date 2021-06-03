public class thisKeyword_6 {
    int a=10;
    static int b=20;
    void GFG(){
        this.a=100;
        System.out.println(a);
        this.b=600;
        System.out.println(b);
    }
    public static void main(String[] args) {
        new thisKeyword_6().GFG();
    }
}
