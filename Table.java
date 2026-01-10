import javax.swing.*;    
public class Table {    
    JFrame f;    
    Table(){    
    f=new JFrame();    
    String data[][]={
        {"jhon","jhon@gmail.com","123"}
    }; 
    String column[]={"Name","Email","Password"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(500,500);    
    f.setVisible(true);   
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
}     
public static void main(String[] args) {    
    new Table();    
}    
}  