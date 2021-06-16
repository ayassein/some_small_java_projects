package mid2;

import java.awt.GridLayout;
import java.awt.event.*;
 
import javax.swing.*;
 
public class FinalExam extends JFrame implements ActionListener {
JLabel Jl;
JButton b,b2;

public FinalExam(){
    super("Final Exam");
    setSize(700,200);
   
    b=new JButton("Right");
    b2=new JButton("Left");
    
    Jl=new JLabel( );
    
    JPanel p = new JPanel();
    p.add(b);  p.add(b2); p.add(Jl);    
    this.setLayout(new GridLayout(1,3));
    add(p);
      
   
     
    b.addActionListener(this);
    b2.addActionListener(this);
     
    this.setVisible(true);
}
 
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    	if(e.getSource()== b)
    		Jl.setText("Right");
    	if(e.getSource()==b2)
    		Jl.setText("Left");
        for(int i=0;i<1;i++) System.out.println(Jl);
         
    }
     
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new FinalExam();
    }
 
}