package Evaluation3;

class Student{
    int id=101;
    String name="sujan";
    String Address="Nanded";
 Student(int id,String name, String Address){
     this.id=id;
     this.name=name;
     this.Address=Address;
 }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

class Teacher {


    int id;
    String name;
    String Address;
    Teacher(int id,String name, String Address){
        this.id=id;
        this.name=name;
        this.Address=Address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

public class StudentTeacherDetails {
    public static void main(String[] args) {
        Student student=new Student(1001,"Sujan","Nanded");
        System.out.println(student.toString());
        Teacher teacher=new Teacher(101,"Aarti","Pune");
        System.out.println(teacher.toString());

    }
}

/*===========OUTPUT===============
* Student{id=1001, name='Sujan', Address='Nanded'}
Teacher{id=101, name='Aarti', Address='Pune'}
*
* */