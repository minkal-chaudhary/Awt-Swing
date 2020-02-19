import java.awt.*;
import java.awt.event.*;
class Calci2 implements ActionListener
{
String s1,s2,s3,s4,s5;
int c;
Frame f;
Button [] b;
TextField tf;
Calci2(String s)
{
f=new Frame(s);
tf=new TextField("");
tf.setBounds(100,50,400,100);
f.add(tf);
b=new Button[20];
String[] s1={"CE","C","<x|","/","7","8","9","X","4","5","6","-","1","2","3","+","+-","0",".","="};

for(int i=0;i<20;i=i+1)
{
b[i]=new Button(s1[i]);
if(i<4)
{b[i].setBounds(100*(i+1),200,100,100);
b[i].addActionListener(this);
}
if(i<8&&i>3)
{
b[i].setBounds(100*(i-3),300,100,100);
b[i].addActionListener(this);
}
if(i>7&&i<12)
{b[i].setBounds(100*(i-7),400,100,100);
b[i].addActionListener(this);
}
if(i>11&&i<16)
{b[i].setBounds(100*(i-11),500,100,100);
b[i].addActionListener(this);
}
if(i>15&&i<20){
b[i].setBounds(100*(i-15),600,100,100);
b[i].addActionListener(this);
}
f.add(b[i]);
}
f.addWindowListener(new WindowEventListener()
{public void windowClosing(WindowEvent e)
{System.exit(0);}});

f.setBounds(50,0,600,800);
f.setLayout(null);
f.setVisible(true);
} 
public boolean point(String s3)
{
char [] arr=s3.toCharArray();
 for(int i=0;i<arr.length;i++)
 {
  if(arr[i]=='.')
  return true;
 }
return false;
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b[0])
{
tf.setText("");
}
if(e.getSource()==b[1])
{tf.setText("");
}
if(e.getSource()==b[2])
{
tf.setText("");
}
if(e.getSource()==b[3])
{s2=tf.getText();
 tf.setText("");
c=1;
}
if(e.getSource()==b[4])
{
s3=tf.getText();
s4="7";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[5])
{
s3=tf.getText();
s4="8";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[6])
{
s3=tf.getText();
s4="9";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[7])
{
s2=tf.getText();
tf.setText("");
c=2;
}
if(e.getSource()==b[8])
{
s3=tf.getText();
s4="4";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[9])
{
s3=tf.getText();
s4="5";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[10])
{
s3=tf.getText();
s4="6";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[11])
{
s2=tf.getText();
tf.setText("");
c=3;
}
if(e.getSource()==b[12])
{
s3=tf.getText();
s4="1";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[13])
{
s3=tf.getText();
s4="2";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[14])
{
s3=tf.getText();
s4="3";
s5=s3+s4;
tf.setText(s5);
}

if(e.getSource()==b[15])
{
s2=tf.getText();
tf.setText("");
c=4;
}
if(e.getSource()==b[16])
{
tf.setText("");
}
if(e.getSource()==b[17])
{
s3=tf.getText();
s4="0";
s5=s3+s4;
tf.setText(s5);
}
if(e.getSource()==b[18])
{
s3=tf.getText();
if(point(s3))
  {tf.setText("");}
else
{
 s3=tf.getText();
 s4=".";
 s5=s3+s4;
 tf.setText(s5);
}
}
if(e.getSource()==b[19])
{
s1=tf.getText();
if(c==1)
{
if(Integer.parseInt(s1)==0)
tf.setText("infinite");
else{
float n=Float.parseFloat(s2)/Float.parseFloat(s1);
tf.setText(String.valueOf(n));
}}
if(c==2)
{float n=Float.parseFloat(s2)*Float.parseFloat(s1);
tf.setText(String.valueOf(n));
}
if(c==3)
{float n=Float.parseFloat(s2)-Float.parseFloat(s1);
tf.setText(String.valueOf(n));
}
if(c==4)
{float n=Float.parseFloat(s2)+Float.parseFloat(s1);
tf.setText(String.valueOf(n));
}

}
}
public static void main(String [] args)
{
Calci2 c=new Calci2("Calculator");
}}