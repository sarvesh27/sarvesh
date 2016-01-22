import java.awt.*;
import java.awt.event.*;
class framelights implements ItemListener
{
Frame f;
Label l;
Checkbox b1,b2,b3;
CheckboxGroup g;
Panel p;
public void itemStateChanged(ItemEvent e)
{
Checkbox c=(Checkbox)e.getSource();
if(c.getLabel().equals("Red"))
{
l.setText("Red Colour...");
}
else
if(c.getLabel().equals("Yellow"))
{
l.setText("Yellow Colour..");
}
else
if(c.getLabel().equals("Green"))
{
l.setText("GreenColour..");
}
}
public framelights()
{
f=new Frame("Frame with Lights");
l=new Label("ColourBox..");
g=new CheckboxGroup();
b1=new Checkbox("Red",g,false);
b2=new Checkbox("Yellow",g,false);
b3=new Checkbox("Green",g,false);
b1.addItemListener(this);
b2.addItemListener(this);
b3.addItemListener(this);
p=new Panel();
p.add(l);
p.add(b1);
p.add(b2);
p.add(b3);
f.add(p);
f.setSize(500,500);
f.setVisible(true);
}
public static void main(String args[])
{
new framelights();
}
}
