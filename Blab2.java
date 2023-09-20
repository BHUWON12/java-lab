public class Blab2
{

    public static void main(String[] args)
{
    String city=null;
    try
{

    if(city.equals("BANGALORE"))

    System.out.println("EQUAL");
    else
    System.out.println("NOT EQUAL");
}
catch(NullPointerException e)
{

    System.out.println("Null pointer exception caught..");

}
finally{

        System.out.println("This finally block will be always executed");
}




}

}
