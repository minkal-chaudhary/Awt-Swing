import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Puzzle123 implements ActionListener
{
JFrame f;
JButton b[];
JTextField tf;
String arr[]={"1","2","3","4","5","6","7","","8"};

public Puzzle123()
{
f=new JFrame("Puzzle123");
b=new JButton[9];
for(int i=0;i<9;i++)
{
if(i<3)
{b[i]=new JButton(arr[i]);
b[i].setBounds(50*(i+1),100,50,50);
f.add(b[i]);
b[i].addActionListener(this);
}
if(i<6&&i>2)
{
b[i]=new JButton(arr[i]);
b[i].setBounds(50*(i+1-3),150,50,50);
f.add(b[i]);
b[i].addActionListener(this);
}
if(i<9&&i>5)
{
b[i]=new JButton(arr[i]);
b[i].setBounds(50*(i+1-6),200,50,50);
f.add(b[i]);
b[i].addActionListener(this);
}

}
tf=new JTextField("GAME");
tf.setBounds(50,300,150,50);
f.add(tf);


f.setSize(500,800);
f.setLayout(null);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(b[0].getText().equals("1")&&b[1].getText().equals("2")&&b[2].getText().equals("3")&&b[3].getText().equals("4")&&b[4].getText().equals("5")&&b[5].getText().equals("6")&&b[6].getText().equals("7")&&b[7].getText().equals("8")&&b[8].getText().equals(""))
{
tf.setText("Congratulations you won");
}






if(e.getSource()==b[0])
{//tf.setText("First");


if(b[1].getText().equals(""))
{
b[1].setText(b[0].getText());
b[0].setText("");
}
if(b[3].getText().equals(""))
{
b[3].setText(b[0].getText());
b[0].setText("");
}
}

if(e.getSource()==b[1])
{

if(b[0].getText().equals(""))
{
b[0].setText(b[1].getText());
b[1].setText("");
}
if(b[2].getText().equals(""))
{
b[2].setText(b[1].getText());
b[1].setText("");
}
if(b[4].getText().equals(""))
{
b[4].setText(b[1].getText());
b[1].setText("");
}
}


if(e.getSource()==b[2])
{if(b[1].getText().equals(""))
{
b[1].setText(b[2].getText());
b[2].setText("");
}
if(b[5].getText().equals(""))
{
b[5].setText(b[2].getText());
b[2].setText("");
}
}


if(e.getSource()==b[3])
{

if(b[0].getText().equals(""))
{
b[0].setText(b[3].getText());
b[3].setText("");
}
if(b[4].getText().equals(""))
{
b[4].setText(b[3].getText());
b[3].setText("");
}
if(b[6].getText().equals(""))
{
b[6].setText(b[3].getText());
b[3].setText("");
}
}


if(e.getSource()==b[4])
{

if(b[1].getText().equals(""))
{
b[1].setText(b[4].getText());
b[4].setText("");
}
if(b[3].getText().equals(""))
{
b[3].setText(b[4].getText());
b[4].setText("");
}
if(b[5].getText().equals(""))
{
b[5].setText(b[4].getText());
b[4].setText("");
}
if(b[7].getText().equals(""))
{
b[7].setText(b[4].getText());
b[4].setText("");
}
}


if(e.getSource()==b[5])
{

if(b[2].getText().equals(""))
{
b[2].setText(b[5].getText());
b[5].setText("");
}
if(b[4].getText().equals(""))
{
b[4].setText(b[5].getText());
b[5].setText("");
}
if(b[8].getText().equals(""))
{
b[8].setText(b[5].getText());
b[5].setText("");
}
}

if(e.getSource()==b[6])
{

if(b[3].getText().equals(""))
{
b[3].setText(b[6].getText());
b[6].setText("");
}
if(b[7].getText().equals(""))
{
b[7].setText(b[6].getText());
b[6].setText("");
}
}

if(e.getSource()==b[7])
{

if(b[4].getText().equals(""))
{
b[4].setText(b[7].getText());
b[7].setText("");
}
if(b[6].getText().equals(""))
{
b[6].setText(b[7].getText());
b[7].setText("");
}
if(b[8].getText().equals(""))
{
b[8].setText(b[7].getText());
b[7].setText("");
}
}

if(e.getSource()==b[8])
{

if(b[5].getText().equals(""))
{
b[5].setText(b[8].getText());
b[8].setText("");
}
if(b[7].getText().equals(""))
{
b[7].setText(b[8].getText());
b[8].setText("");
}
}

if(b[0].getText().equals("1")&&b[1].getText().equals("2")&&b[2].getText().equals("3")&&b[3].getText().equals("4")&&b[4].getText().equals("5")&&b[5].getText().equals("6")&&b[6].getText().equals("7")&&b[7].getText().equals("8")&&b[8].getText().equals(""))
{
tf.setText("Congratulations you won");
}
}


public static void main(String [] args)
{
Puzzle123 p=new Puzzle123();
}
}