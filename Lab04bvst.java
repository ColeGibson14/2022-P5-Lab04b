// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(75,300,275,300);
        g.drawRect(25,200,275,300);
        g.drawLine(25,200,75,300);
        g.drawLine(25,500,75,600);
        g.drawLine(300,200,350,300);
        g.drawLine(300,500,350,600);
        // DRAW SPHERE


        g.drawOval(700,50,250,250);
        g.drawOval(730,50,190,250);
        g.drawOval(760,50,130,250);
        g.drawOval(790,50,70,250);
        g.drawOval(820,50,10,250);

        g.drawOval(700,80,250,190);
        g.drawOval(700,110,250,130);
        g.drawOval(700,140,250,70);
        g.drawOval(700,170,250,10);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS
        //A
        g.fillRect(25,25,75,25);
        g.fillRect(25,50,25,100);
        g.fillRect(50,75,25,25);
        g.fillRect(75,50,25,100);
        //P
        g.fillRect(125,25,25,125);
        g.fillRect(150,25,50,25);
        g.fillRect(175,50,25,50);
        g.fillRect(150,75,25,25);
        //C
        g.fillRect(225,25,25,125);
        g.fillRect(250,25,50,25);
        g.fillRect(250,125,50,25);
        //S
        g.fillRect(325,25,75,25);
        g.fillRect(325,25,25,50);
        g.fillRect(350,75,50,25);
        g.fillRect(375,100,25,50);
        g.fillRect(325,125,50,25);
        g.fillRect(325,75,25,25);
        // DRAW PACMEN FLOWER

        g.fillArc(425,350,80,100,210,290); //left
        g.fillArc(475,300,100,75,135,270); //top
        g.fillArc(550,345,75,100,10,280); //right
        g.fillArc (480,420,100,100,-40,245); //bottom
    }

}


