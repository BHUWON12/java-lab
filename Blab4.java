import java.awt.*;
public class Blab4 extends Canvas{

public void paint(Graphics g)
{

    g.drawRect(50,75,100,50);
    g.fillRect(50,75,100,50);
    g.drawRoundRect(50,150,100,50,15,15);
    g.fillRoundRect(50,150,100,50,15,15);
    g.drawOval(50,250,100,50);
    g.fillOval(50,250,100,50);
    g.drawArc(10,300,100,50,25,75);
    g.fillArc(10,300,100,50,25,75);


}
public static void main(String[] args)
{
    Blab4 b=new Blab4();
    Frame f= new Frame("Shapes");
    f.add(b);
    f.setSize(400,500);
    f.setVisible(true);

}
}
