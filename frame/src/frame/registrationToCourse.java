package frame;

import java.awt.GridLayout;
import java.awt.event.*;
 
import javax.swing.*;
 
public class registrationToCourse extends JFrame implements ActionListener {
JTextField Tf[];
JLabel Jl[];
public registrationToCourse(){
    super("registration to a new course");
    setSize(300,200);
    Tf=new JTextField[4];
    for(int i=0;i<4;i++)Tf[i]=new JTextField(20);
    JButton b=new JButton("Enter");
    Jl=new JLabel[4];
    Jl[0]=new JLabel("    Name: ");
    Jl[1]=new JLabel("    Id: ");
    Jl[2]=new JLabel("    Department: ");
    Jl[3]=new JLabel("    age: ");
    this.setLayout(new GridLayout(5,2));
    for(int i=0;i<4;i++){  add(Jl[i]);add(Tf[i]);}
      
    add(b);
     
    b.addActionListener(this);
     
    this.setVisible(true);
}
 
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        for(int i=0;i<4;i++) System.out.println(Jl[i].getText()+Tf[i].getText());
         
    }
     
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new registrationToCourse();
    }
 
}