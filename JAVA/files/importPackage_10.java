package files;
public class importPackage_10{
    int num1;
    int num2;
    importPackage_10(int n, int m){
        num1=n;
        num2=m;
    }
    public void getmax(){
        if(num1>num2){
            System.out.println("Maximum value of two number is "+num1);
        }
        else{
            System.out.println("Maximum value of two number is "+num2);
            }
    }
    public static void main(String args[]) {
        importPackage_10 current[]=new importPackage_10[3];
        current[1]=new importPackage_10(5,10);
        current[2]=new importPackage_10(123,120);
        for(int i=1;  i<3; i++){
            current[i].getmax();
        }
    }
}

