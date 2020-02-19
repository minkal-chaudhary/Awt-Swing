import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class MyEditor implements ActionListener
{
JFrame jf;
JLabel jl;
JTextField jtf;
JTextArea jta,jta1;
JButton jcompile,jrun;
JScrollPane jsp,jsp1;
Runtime r;
String fname,fn;
String result;
String result1,result2;
String str="";
String temp="";
public MyEditor()
{
jf=new JFrame("Editor By Minkal");
jf.setLayout(null);
jl=new JLabel("Enter Class Name");
jl.setBounds(50,10,500,50);
jf.add(jl);
jtf=new JTextField();
jtf.setBounds(50,70,500,50);
jf.add(jtf);
jta=new JTextArea();
jta.setBounds(50,130,500,350);
jf.add(jta);
Focus f=new Focus(this);
jta.addFocusListener(f);
jsp=new JScrollPane(jta);
jsp.setBounds(50,130,500,350);
jf.add(jsp);

jta1=new JTextArea();
jta1.setBounds(50,560,500,350);
jf.add(jta1);
jsp1=new JScrollPane(jta1);
jsp1.setBounds(50,560,500,350);
jf.add(jsp1);
jcompile=new JButton("Compile");
jcompile.setBounds(50,500,150,50);
jf.add(jcompile);
jcompile.addActionListener(this);
jrun=new JButton("run");
jrun.setBounds(250,500,150,50);
jf.add(jrun);
jrun.addActionListener(this);
r=Runtime.getRuntime();
jf.setSize(620,1000);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);
}
public static void main(String... s)throws IOException
{
new MyEditor();
}
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==jcompile)
{
str="";

System.out.println(jcompile);
if(!jtf.getText().equals(""))
{
try{




  

fname=jtf.getText().trim()+".java";
String s1=jta.getText();
PrintWriter bw=new PrintWriter(new FileWriter(fname));
bw.println(s1);
bw.flush();
System.out.println("break");
Process error=r.exec("C:\\Program Files\\Java\\jdk1.8.0_131\\bin\\javac.exe "+fname);
System.out.println("after process");

BufferedReader err=new BufferedReader(new InputStreamReader(error.getErrorStream()));

System.out.println("after buffer");


temp="";
result="";

while(true)
{
String temp=err.readLine();
if(temp!=null)
{

result+=temp+"\n";
}
else
{break;
}
}
System.out.println("before succes");
if(result.equals(""))
{
jta1.setText("Compilation Successful -"+fname);
System.out.println("After compile sucess");
err.close();
}
else
{
jta1.setText(result);
System.out.println("inside result");
}
}catch(Exception e2){System.out.println(e2);}
}

else
jta1.setText("please enter the class name");
}
else if(e.getSource()==jrun)
{
int start=0;
try{
String fn=jtf.getText().trim();

Process p1=r.exec("C:\\Program Files\\Java\\jdk1.8.0_131\\bin\\java "+fn);
BufferedReader br2=new BufferedReader(new InputStreamReader(p1.getErrorStream()));
BufferedReader br3=new BufferedReader(new InputStreamReader(p1.getInputStream()));

result1="";
while(true)
{String temp=br2.readLine();
if(temp!=null)
{

result1+=temp;
result1+="\n";
}
else
break;
}



result2="";
while(true)
{String temp1=br3.readLine();
if(temp1!=null)
{
result2+=temp1;
result2+="\n";
}
else
break;
}
//br2.close();
//br3.close();

jta1.setText(result1+"\n"+result2);
}catch(Exception e3){System.out.println(e3);}
}

}


}
class Focus extends FocusAdapter
{
MyEditor m;
public Focus(MyEditor m)
{
this.m=m;
}
public void focusGained(FocusEvent e)
{
String cname=m.jtf.getText().trim();
m.jta.setText("class "+cname+"\n"+"{"+"\n"+"public static void main(String... s)"+"\n"+"{"+"\n"+"\n"+"}"+"\n"+"}");
}
}