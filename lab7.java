/*7. Write a program with class variable that is available for all instances of a class. Use
static variable declaration. Observe the changes that occur in the object’s member
variable values.*/

class student{

    static String collagename="Acharya";
    int rollno;
    String name;
    student(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;

    }
    void display()
    {

        System.out.println(rollno+"\t"+name+"\t"+collagename);

    }

}
public class lab7{
    public static void main(String[] args) {
        System.out.println("object sharing static variable collagename");
        student s1=new student(1,"rakesh");
        student s2= new student(2, "nita");
        System.out.println("Rollno"+"\t"+"Name"+"\t"+"collageName");
        s1.display();
        s2.display();
        System.out.println("After changing static variable ");
        System.out.println("Rollno"+"\t"+"Name"+"\t"+"collageName");
        s1.collagename="Acharya instutue of graduate studies";
        s1.display();
        s2.display();

    }
}