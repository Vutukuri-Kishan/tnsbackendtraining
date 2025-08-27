package tns_backend_training.Basic_Programs;
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 6716;
        s1.sname = "Kishan";
        s1.sbranch = "DS";
        s1.print();

        Student s2 = new Student();
        s2.rollno = 6751;
        s2.sname = "Agastya";
        s2.sbranch = "CSE";
        s2.print();

        Student s3 = new Student();
        s3.rollno = 6708;
        s3.sname = "Rudra";
        s3.sbranch = "AIML";
        s3.print();
    }
    
}
