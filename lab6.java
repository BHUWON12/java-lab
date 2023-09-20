	/*Write a program to perform mathematical operations. Create a class called AddSub
with methods to add and subtract. Create another class called MulDiv that extends
from AddSub class to use the member data of the super class. MulDiv should have
methods to multiply and divide A main function should access the methods and perform
the mathematical operations.*/

 class AddSub{
int n1,n2;
 AddSub(int x,int y)
{
n1=x;
n2=y;
}
    public int add(){

return(n1+n2);
}

public int sub()
{

return(n1-n2);

}

          }
 class MulDiv extends AddSub
{
public MulDiv(int x,int y)
{
    super(x,y);

}
int multi()
{
    return (n1*n2);


}
int div()
{

    return(n1/n2);
}

}

public class lab6{


public static void main(String args[])
{
MulDiv obj=new MulDiv(16,4);

System.out.println("The addition is: "+obj.add());
System.out.println("The subtraction is: "+obj.sub());
System.out.println("The multiplication is: "+obj.multi());
System.out.println("The division is: "+obj.div());
}


}










