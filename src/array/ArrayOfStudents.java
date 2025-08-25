package array;

class Student {
    String name;
    int roll;
    double marks;
}
public class ArrayOfStudents {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mourya";
        s1.roll = 7;
        s1.marks = 98;

        Student s2 = new Student();
        s2.name = "Sourya";
        s2.roll = 10;
        s2.marks = 99;

//        Student students[] = new Student[] {s1,s2};
        Student students[] = {s1,s2};
        for(Student s : students) {
            System.out.println(s.name + "   " + s.roll + "   " + s.marks);
        }
    }
}
