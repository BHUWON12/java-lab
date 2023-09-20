
import java.util.*;
class student
{
    Scanner sc=new Scanner(System.in);

String sid;
String name;
int s1,s2,s3,total;
student()
{


readinfo();

}
public void readinfo()
{

    System.out.println("Enter student details: ");
    System.out.println("enter the valid Sid: ");
    sid=sc.next();
    System.out.println("Enter the Name: ");
    name=sc.next();
    System.out.println("Enter the marks of students (3) subjects");
    s1=sc.nextInt();
    s2=sc.nextInt();
    s2=sc.nextInt();
    if(s1<50 && s2<50 && s3<50)  
    total=0;
    else
    total=s1+s2+s3;
           

}
public void displayinfo()
{
    System.out.println(sid+"\t"+name+"\t"+total);
}

}


public class lab8 {
     /**
     * @param args
     */
    public static void main(String[] args) {
      student s[]= new student[3];
      for(int i=0;i<3;i++)
        s[i]=new student();
        System.out.println("Students details:-");
        System.out.println("SID"+"\t"+"Name"+"\t"+"total");
      for(int i=0;i<3;i++)
      s[i].displayinfo();
    }
    
}
