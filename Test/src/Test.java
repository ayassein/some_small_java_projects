import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Test extends JFrame implements ActionListener 
{
	JLabel l;
	JButton b,v;
	int c=0;
	 public Test(){
		super("Final Exam");
		this.setSize(200,100);
		
		b=new JButton("Left");
		v=new JButton("Right");
		l=new JLabel("Left");
		this.setLayout(new FlowLayout());
		add(b);add(v);add(l);
		b.addActionListener(this);
		v.addActionListener(this);
		
		
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Test();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//b.setText("Left");
		c++;
		if(c==2)c=0;
		switch(c){
		case 0:l.setText("Right");break;
		case 1:l.setText("Left");break;
		
		}}
		
	}


