package com.it;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.*;



import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import DBConnection.DBConnection;

public class Swing2 extends JFrame{
	int price;
	private Connection conn;
	private Statement stt;
	private ResultSet set;
	private int tableindex;
	
	 public void createJFrame3(String title,int tablenumber){
		  System.out.println(tablenumber);
		  tableindex=tablenumber;
		  System.out.println(tableindex);
		  JFrame jf4 = new Swing2(title,tableindex);
		  jf4.setLocationRelativeTo(null);//屏幕中央
		  jf4.setVisible(true);
		  //System.out.println(price);	   测试
		
	}
	
    public Swing2(String title,int tablenumber2){
    	tableindex=tablenumber2;
    	int num[] = new int[5];
    	String name[] = new String[5];
		try {
			conn = DBConnection.getConnection();
			if(conn == null)
				return;
			String sql = "select * from Hotel";
			stt =  conn.createStatement();
			set = stt.executeQuery(sql);
			int i=0;
			while(set.next()){
				//for (int i = 0; i < name.length; i++) {
					name[i] = set.getString(1);
					System.out.println(set.getString(1));
					num[i] = Integer.parseInt(set.getString(2));
					i++;
				//}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}   
	  	setTitle("点菜系统");
	  	getContentPane().setBackground(new Color(0, 206, 209));
	    setBounds(100, 100, 350, 950);
	    getContentPane().setLayout(null);
	    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(6, 6, 338, 675);
	    getContentPane().add(scrollPane);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
	    scrollPane.setViewportView(panel);
	    setBounds(100, 100, 350, 750);
	    panel.setLayout(null);
	    JLabel lbll = new JLabel("");
	    lbll.setBounds(15, 20, 120, 120);
	    lbll.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/2.png"));
	    panel.add(lbll);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(Color.BLUE);
	    panel_1.setBounds(6, 693, 338, 32);
	    getContentPane().add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel_9 = new JLabel();
	    //lblNewLabel_9.setText(String.valueOf(price));
	    lblNewLabel_9.setBounds(155, 6, 61, 16);
	    panel_1.add(lblNewLabel_9);
	        
	    JLabel label = new JLabel();
	    label.setText(String.valueOf(num[0]));
	    label.setBounds(147, 90, 59, 16);
	    panel.add(label);
	    
	    JLabel label_6 = new JLabel();
	    label_6.setText(String.valueOf(num[1]));
	    label_6.setBounds(145, 233, 61, 16);
	    panel.add(label_6);
	    
	    JButton button = new JButton("加入购物车");
	    button.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int priceString = Integer.parseInt(label.getText());
	    		price += priceString;
	    		lblNewLabel_9.setText(String.valueOf(price));
	    	}
	    });
	    button.setBounds(227, 85, 117, 29);
	    panel.add(button);
	    
	
	    
	    JLabel label_1 = new JLabel();
	    label_1.setText(name[0]);
	    label_1.setBounds(25, 15, 61, 16);
	    panel.add(label_1);
	    
	    JLabel lblNewLabel = new JLabel();
	    lblNewLabel.setText(name[1]);
	    lblNewLabel.setBounds(25, 150, 61, 16);
	    panel.add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setBounds(15, 155, 120, 120);
	    lblNewLabel_1.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/1.png"));
	    panel.add(lblNewLabel_1);
	    
	    JButton button_1 = new JButton("加入购物车");
	    button_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int priceSting = Integer.parseInt(label_6.getText());
	    		price += priceSting;
	    		lblNewLabel_9.setText(String.valueOf(price));
	    	}
	    });
	    button_1.setBounds(227, 228, 117, 29);
	    panel.add(button_1);
	    
	    JLabel label_2 = new JLabel();
	    label_2.setText(name[2]);
	    label_2.setBounds(25, 285, 61, 16);
	    panel.add(label_2);
	    
	    JLabel lblNewLabel_3 = new JLabel("");
	    lblNewLabel_3.setBounds(15, 290, 120, 120);
	    lblNewLabel_3.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/WX20190102-014003.png"));
	    panel.add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_4 = new JLabel();
	    lblNewLabel_4.setText(String.valueOf(num[2]));
	    lblNewLabel_4.setBounds(147, 370, 61, 16);
	    panel.add(lblNewLabel_4);
	    
	    JButton button_2 = new JButton("加入购物车");
	    button_2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int priceSting = Integer.parseInt(lblNewLabel_4.getText());
	    		price += priceSting;
	    		lblNewLabel_9.setText(String.valueOf(price));
	    	}
	    });
	    button_2.setBounds(227, 365, 117, 29);
	    panel.add(button_2);
	    
	    JLabel label_3 = new JLabel();
	    label_3.setText(name[3]);
	    label_3.setBounds(25, 420, 61, 16);
	    panel.add(label_3);
	    
	    JLabel lblNewLabel_5 = new JLabel("");
	    lblNewLabel_5.setBounds(15, 425, 120, 120);
	    lblNewLabel_5.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/WX20190102-014444.png"));
	    panel.add(lblNewLabel_5);
	    
	    JLabel lblNewLabel_6 = new JLabel();
	    lblNewLabel_6.setText(name[4]);
	    lblNewLabel_6.setBounds(25, 555, 61, 16);
	    panel.add(lblNewLabel_6);
	    
	    JLabel lblNewLabel_7 = new JLabel("");
	    lblNewLabel_7.setBounds(15, 560, 120, 120);
	    lblNewLabel_7.setIcon(new ImageIcon("/Users/lzk/Documents/workspace/Hotel system/icons/WX20190103-153226.png"));
	    panel.add(lblNewLabel_7);
	    
	    JLabel label_4 = new JLabel();
	    label_4.setText(String.valueOf(num[3]));
	    label_4.setBounds(147, 502, 61, 16);
	    panel.add(label_4);
	    
	    JLabel label_5 = new JLabel();
	    label_5.setText(String.valueOf(num[4]));
	    label_5.setBounds(147, 639, 61, 16);
	    panel.add(label_5);
	    
	    JButton button_3 = new JButton("加入购物车");
	    button_3.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int priceSting = Integer.parseInt(label_4.getText());
	    		price += priceSting;
	    		lblNewLabel_9.setText(String.valueOf(price));
	    	}
	    });
	    button_3.setBounds(227, 497, 117, 29);
	    panel.add(button_3);
	    
	    JButton button_4 = new JButton("加入购物车");
	    button_4.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		int priceSting = Integer.parseInt(label_5.getText());
	    		price += priceSting;
	    		lblNewLabel_9.setText(String.valueOf(price));
	    	}
	    });
	    button_4.setBounds(227, 634, 117, 29);
	    panel.add(button_4);	    	    
	    
	    JLabel lblNewLabel_8 = new JLabel("订单总价：");
	    lblNewLabel_8.setBounds(91, 5, 72, 17);
	    panel_1.add(lblNewLabel_8);
	    
	    JButton button_5 = new JButton("提交订单");
	    button_5.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JFrame jf1 = new JFrame(title);
	    	    jf1.setSize(200, 150);
	    	    
	    	    String AddSQL = "insert into BookOrder values(?,?)";
	    	    conn = DBConnection.getConnection();
	    	    try {
					PreparedStatement ps = conn.prepareStatement(AddSQL);
					System.out.println(tableindex);
					ps.setInt(1, tableindex);
		            //向sql语句的第二个问号添加数据
		            ps.setInt(2,price);
		            ps.executeUpdate();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    
	    	    JLabel jl1 = new JLabel("   订单提交成功！                     ");
	    	    JLabel jl2 = new JLabel("备注");
	    	    JTextField jt = new JTextField("",10);
	    	    JButton jButton = new JButton("确定");
	    	    jf1.getContentPane().setLayout(new FlowLayout(1));
	    	    jf1.getContentPane().add(jl1);
	    	    jf1.getContentPane().add(jl2 );
	    	    jf1.getContentPane().add(jt);
	    	    jf1.getContentPane().add(jButton);
	    	    jf1.setLocationRelativeTo(null);
	    	    jf1.setVisible(true);
	    	    jButton.addMouseListener(new MouseAdapter() {
	    	    	@Override
	    	    	public void mouseClicked(MouseEvent e) {
	    	    		jf1.setVisible(false);
	    	    		
	    	    	}
	    	    });
	    	}
	    });
	    
	    button_5.setBackground(new Color(135, 206, 235));
	    button_5.setBounds(215, 1, 117, 29);
	    panel_1.add(button_5);
	    
	    JButton btnNewButton = new JButton("清空");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		price = 0;
	    		lblNewLabel_9.setText(String.valueOf(price));
	    	}
	    });
	    btnNewButton.setBounds(0, 1, 66, 29);
	    panel_1.add(btnNewButton);
	  }
}
