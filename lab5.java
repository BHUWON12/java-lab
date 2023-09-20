/*Write a java program to add two integers and two float numbers. When no
arguments are supplied, give a default value to calculate the sum. Use function
overloading.*/

class methodoverloading{


int add()
{

    return(11+30);

}
int add(int x, int y)
{

        return (x+y);

}

float add(float a, float b)
{

        return (a+b);
}                       }
class lab5{
public static void main(String args[])
{
methodoverloading mt= new methodoverloading();

System.out.println("the method with no arguments: "+mt.add());
System.out.println("the method int args :"+mt.add(10,55));
System.out.println("The mehtod with float value: "+mt.add(5.6F,5.8F));

}
    

}
