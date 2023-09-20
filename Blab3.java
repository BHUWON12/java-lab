import java.awt.*;
public class Blab3{
Blab3(){
    Frame fm= new Frame();
fm.setTitle("My first frame");
Label lb= new Label("Welcome to GUI programming");
fm.add(lb);
fm.setSize(300,300);
fm.setVisible(true);
}

public static void main(String[] args)
{
    Blab3 p= new Blab3();
}
}
