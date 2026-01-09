import java.awt.*;
public  class Project{
public static void main(String args[])
{
Frame f= new Frame("Html.form ");
Label  l,l1,l2,l3;
Button b,b1;
TextField t1,t2,t3;

l= new Label("Student Management System.");
l1=new Label("Name : ");
l2= new Label("Email : ");
l3= new Label("Password : ");

l.setBounds(500,90,250,30);
l1.setBounds(50,130,100,30);
l2.setBounds(50,160,100,30);
l3.setBounds(50,180,100,30);

t1= new TextField();
t2= new TextField();
t3= new TextField();

t1.setBounds(200,130,100,30);
t2.setBounds(200,160,100,30);
t3.setBounds(200,180,100,30);

b= new Button("Submit");
b.setBounds(100,300,70,30);
b1=new Button("View Data");
b1.setBounds(100,380,100,30);

f.add(b);
f.add(b1);
f.add(l);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);

f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
}
}