package files;
public class student_11 {
    int id;
    String name;
    student_11(){
        System.out.println("This is default constructor");
    }
    student_11(int i, String n){
        id = i;
        name = n;
    }
    public static void main(String[] args) {
        student_11 s = new student_11();
        System.out.println("In default constructor values:\n");
        System.out.println("Student id: "+s.id+"\nStudent name: "+s.name);
        System.out.println("\nParameterized constructor values:\n");
        student_11 student = new student_11(10,"David");
        System.out.println("Student id: "+student.id+"\nStudent name: "+student.name);
    }
}
