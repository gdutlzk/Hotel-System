package com.it;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Member;
import java.sql.*;
import javax.swing.JTextArea;
import DBConnection.DBConnection;

public class Swing3 extends JFrame{
	int num1,num2,num3,num4,num5;
	String name1,name2,name3,name4,name5;
	int id1,id2,id3,id4,id5;
	static Connection conn;
	static Statement stt;
	static ResultSet set;
    public Swing3(String title){

	  	setTitle("管理系统");
	  	getContentPane().setBackground(new Color(0, 206, 209));
	    setBounds(100, 100,400,1000);
	    getContentPane().setLayout(null);
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(6, 6, 338, 713);
	    getContentPane().add(scrollPane);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
	    scrollPane.setViewportView(panel);
	    panel.setLayout(null);
	    setBounds(100, 100, 350, 800);
	    JLabel lbll = new JLabel("");
	    lbll.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/2.png"));
	    lbll.setBounds(15, 20, 120, 120);
	    panel.add(lbll);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/1.png"));
	    lblNewLabel_1.setBounds(15, 155, 120, 120);
	    panel.add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_3 = new JLabel("");
	    lblNewLabel_3.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/WX20190102-014003.png"));
	    lblNewLabel_3.setBounds(15, 290, 120, 120);
	    panel.add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_5 = new JLabel("");
	    lblNewLabel_5.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/WX20190102-014444.png"));
	    lblNewLabel_5.setBounds(15, 425, 120, 120);
	    panel.add(lblNewLabel_5);
	    
	    JLabel lblNewLabel_7 = new JLabel("");
	    lblNewLabel_7.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/WX20190103-153226.png"));
	    lblNewLabel_7.setBounds(15, 560, 120, 120);
	    panel.add(lblNewLabel_7);
	    
	    JTextArea textArea = new JTextArea();
	    textArea.setBounds(260, 35, 39, 16);
	    panel.add(textArea);
	    
	    JTextArea textArea_1 = new JTextArea();
	    textArea_1.setBounds(260, 176, 39, 16);
	    panel.add(textArea_1);
	    
	    JTextArea textArea_2 = new JTextArea();
	    textArea_2.setBounds(260, 309, 39, 16);
	    panel.add(textArea_2);
	    
	    JTextArea textArea_3 = new JTextArea();
	    textArea_3.setBounds(260, 440, 39, 16);
	    panel.add(textArea_3);
	    
	    JTextArea textArea_4 = new JTextArea();
	    textArea_4.setBounds(260, 581, 39, 16);
	    panel.add(textArea_4);
	    
	    JTextArea textArea_5 = new JTextArea();
	    textArea_5.setBounds(260, 60, 39, 16);
	    panel.add(textArea_5);
	    
	    JTextArea textArea_6 = new JTextArea();
	    textArea_6.setBounds(260, 201, 39, 16);
	    panel.add(textArea_6);
	    
	    JTextArea textArea_7 = new JTextArea();
	    textArea_7.setBounds(260, 334, 39, 16);
	    panel.add(textArea_7);
	    
	    JTextArea textArea_8 = new JTextArea();
	    textArea_8.setBounds(260, 465, 39, 16);
	    panel.add(textArea_8);
	    
	    JTextArea textArea_9 = new JTextArea();
	    textArea_9.setBounds(260, 606, 39, 16);
	    panel.add(textArea_9);
	    
	    JTextArea textArea_10 = new JTextArea();
	    textArea_10.setBounds(260, 88, 39, 16);
	    panel.add(textArea_10);
	    
	    JTextArea textArea_11 = new JTextArea();
	    textArea_11.setBounds(260, 227, 39, 16);
	    panel.add(textArea_11);
	    
	    JTextArea textArea_12 = new JTextArea();
	    textArea_12.setBounds(260, 362, 39, 16);
	    panel.add(textArea_12);
	    
	    JTextArea textArea_13 = new JTextArea();
	    textArea_13.setBounds(260, 493, 39, 16);
	    panel.add(textArea_13);
	    
	    JTextArea textArea_14 = new JTextArea();
	    textArea_14.setBounds(260, 634, 39, 16);
	    panel.add(textArea_14);
	    
	    JButton btnNewButton = new JButton("确认");
	    btnNewButton.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int num = Integer.parseInt(textArea.getText());
	    		String name = textArea_5.getText();
	    		int id =Integer.parseInt(textArea_10.getText());
	    		num1 = num;
	    		name1 = name;
	    		id1 = id;
	    		Update(num1,name1,id1);
	    	}
	    });
	    btnNewButton.setBounds(247, 111, 69, 29);
	    panel.add(btnNewButton);
	    
	    JButton button = new JButton("确认");
	    button.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int num = Integer.parseInt(textArea_1.getText());
	    		num2 = num;
	    		String name = textArea_6.getText();
	    		name2 = name;
	    		int id =Integer.parseInt(textArea_11.getText());
	    		id2 = id;
	    		Update(num2,name2,id2);
	    	}
	    });
	    button.setBounds(247, 255, 69, 29);
	    panel.add(button);
	    
	    JButton button_1 = new JButton("确认");
	    button_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int num = Integer.parseInt(textArea_2.getText());
	    		num3 = num;
	    		String name = textArea_7.getText();
	    		name3 = name;
	    		int id =Integer.parseInt(textArea_12.getText());
	    		id3 = id;
	    		Update(num3,name3,id3);
	    	}
	    });
	    button_1.setBounds(247, 381, 69, 29);
	    panel.add(button_1);
	    
	    JButton button_2 = new JButton("确认");
	    button_2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int num = Integer.parseInt(textArea_3.getText());
	    		num4 = num;
	    		String name = textArea_8.getText();
	    		name4 = name;
	    		int id =Integer.parseInt(textArea_13.getText());
	    		id4 = id;
	    		Update(num4,name4,id4);
	    	}
	    });
	    button_2.setBounds(247, 516, 69, 29);
	    panel.add(button_2);
	    
	    JButton button_3 = new JButton("确认");
	    button_3.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int num = Integer.parseInt(textArea_4.getText());
	    		num5 = num;
	    		String name = textArea_9.getText();
	    		name5 = name;
	    		int id =Integer.parseInt(textArea_14.getText());
	    		id5 = id;
	    		Update(num5,name5,id5);
	    		//System.out.print(num5+name5);	
	    	}
	    });
	    button_3.setBounds(247, 651, 69, 29);
	    panel.add(button_3);  
	    
	    JLabel label_6 = new JLabel("价格");
	    label_6.setBounds(219, 33, 32, 16);
	    panel.add(label_6);
	    
	    JLabel label_7 = new JLabel("价格");
	    label_7.setBounds(219, 176, 32, 16);
	    panel.add(label_7);
	    
	    JLabel label_8 = new JLabel("价格");
	    label_8.setBounds(219, 309, 32, 16);
	    panel.add(label_8);
	    
	    JLabel label_9 = new JLabel("价格");
	    label_9.setBounds(219, 440, 32, 16);
	    panel.add(label_9);
	    
	    JLabel label_10 = new JLabel("价格");
	    label_10.setBounds(219, 581, 32, 16);
	    panel.add(label_10);
	    
	    JLabel lblNewLabel_2 = new JLabel("菜名");
	    lblNewLabel_2.setBounds(219, 60, 29, 16);
	    panel.add(lblNewLabel_2);
	    
	    JLabel label = new JLabel("菜名");
	    label.setBounds(219, 201, 29, 16);
	    panel.add(label);
	    
	    JLabel label_4 = new JLabel("菜名");
	    label_4.setBounds(219, 334, 29, 16);
	    panel.add(label_4);
	    
	    JLabel label_5 = new JLabel("菜名");
	    label_5.setBounds(219, 465, 29, 16);
	    panel.add(label_5);
	    
	    JLabel label_11 = new JLabel("菜名");
	    label_11.setBounds(219, 606, 29, 16);
	    panel.add(label_11);
	    
	    JLabel label_1 = new JLabel("编号");
	    label_1.setBounds(219, 88, 29, 16);
	    panel.add(label_1);
	    
	    JLabel label_2 = new JLabel("编号");
	    label_2.setBounds(222, 229, 29, 16);
	    panel.add(label_2);
	    
	    JLabel label_3 = new JLabel("编号");
	    label_3.setBounds(219, 362, 29, 16);
	    panel.add(label_3);
	    
	    JLabel label_12 = new JLabel("编号");
	    label_12.setBounds(219, 493, 29, 16);
	    panel.add(label_12);
	    
	    JLabel label_13 = new JLabel("编号");
	    label_13.setBounds(219, 634, 29, 16);
	    panel.add(label_13);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(Color.BLUE);
	    panel_1.setBounds(6, 735, 338, 29);
	    getContentPane().add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel_8 = new JLabel("管理系统");
	    lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
	    lblNewLabel_8.setForeground(Color.GREEN);
	    lblNewLabel_8.setBounds(131, 6, 72, 17);
	    panel_1.add(lblNewLabel_8);
	    
	  }
    public void createJFrame3(String title){
    	JFrame jf3 = new Swing3(title);
    	jf3.setLocationRelativeTo(null);//屏幕中央
    	jf3.setVisible(true);
	 }
    public void Update(int num,String name,int id){
    	try {
			conn = DBConnection.getConnection();
			if (conn==null) 
				return;
			
			String UpdateSql = "UPDATE Hotel SET Name =?,Number=? where Id=?";//sql语句格式对？
			PreparedStatement ps = conn.prepareStatement(UpdateSql);
			ps.setString(1,name);
			ps.setInt(2, num);
			ps.setInt(3, id);
			//System.out.print(212);
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
    }
}