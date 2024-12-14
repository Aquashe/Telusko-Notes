class Student {
    int rollno;
    String name;
}

public class ObjectsArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "hari";
        s1.rollno = 1;

        s2.name = "Kiran";
        s2.rollno = 2;

        Student students[] = new Student[2];
        students[0] = s1; 
        students[1] = s2; 

        for (Student x : students) {
            System.out.println("Name: " + x.name + " Rollno: " + x.rollno);
        }
    }
}