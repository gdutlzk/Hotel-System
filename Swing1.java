package com.it;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;
import java.util.Arrays;
import javax.swing.*;

public class Swing1 extends JFrame{
	public Swing1() {
	}
  public void createjframe(String title){
    JFrame jf = new JFrame(title);
    jf.setDefaultCloseOperation(3);
    jf.setSize(380, 200);
    jf.setLocationRelativeTo(null);
    jf.setResizable(false);
    jf.getContentPane().setLayout(new FlowLayout());
    
    JLabel l1 = new JLabel("账号：");
    JTextField te1 = new JTextField(30);
    JLabel l2 = new JLabel("密码：");
    JPasswordField te2 = new JPasswordField(30);
    //te2.setEchoChar(65311);
    
    jf.getContentPane().add(l1);
    jf.getContentPane().add(te1);
    jf.getContentPane().add(l2);
    jf.getContentPane().add(te2);
    
    JButton jb1 = new JButton("登陆");
    Swing1.ButtonListener li1 = new Swing1.ButtonListener(te1, te2);
    jb1.addActionListener(li1);
    jf.getContentPane().add(jb1);
    JButton jb2 = new JButton("取消");
    jf.getContentPane().add(jb2);
    jf.setVisible(true);
  }
  
  public void createJFrame2(String title){
    JFrame jf1 = new JFrame(title);
    jf1.setSize(200, 100);
    JLabel jl1 = new JLabel("账号信息错误！");
    jl1.setHorizontalAlignment(0);
    jf1.getContentPane().add(jl1, "Center");
    jf1.setLocationRelativeTo(null);
    jf1.setVisible(true);
  }
  
  //public void createJFrame3(String title) {}
  
  public class ButtonListener implements ActionListener{
    public JTextField te1 = new JTextField();
    public JPasswordField te2 = new JPasswordField();
    
    public ButtonListener(JTextField te1, JPasswordField te2){
      this.te1 = te1;
      this.te2 = te2;
    }
    
    
    
    public void actionPerformed(ActionEvent e){
      String arr[]={"1","2","3","4","5","6","7","8","9"};	
      String ID = this.te1.getText();
      String Password = String.valueOf(this.te2.getPassword());
      int index = Arrays.binarySearch(arr, ID);
      if ((ID.equals("123456")) && (Password.equals("111"))) {
    	  new Swing3("").createJFrame3("管理系统");
      }
      else if(index >= 0){	
    	  new Swing2("",0).createJFrame3("点菜界面",new Integer(ID));
    	  //System.out.print("ddd");
      }
      else{
    	  new Swing1().createJFrame2("错误提示");
      }
    }
  }
} 
 		

