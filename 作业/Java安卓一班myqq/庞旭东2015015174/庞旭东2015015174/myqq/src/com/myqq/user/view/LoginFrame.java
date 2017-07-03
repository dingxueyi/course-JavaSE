package com.myqq.user.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	
	JLabel lblQqNum;
	JLabel lblPassword;
	JTextField txtQqNum;
	JPasswordField txtPassword;
	JButton btnLogin;
	JButton btnCancle;
	JButton btnregister;
	
	public LoginFrame(){
		lblQqNum=new JLabel("QQ号：");
		lblPassword=new JLabel("密码：");
		txtQqNum=new JTextField();
		txtPassword=new JPasswordField();
		btnLogin=new JButton("登陆");
		btnCancle=new JButton("取消");
		btnregister=new JButton("注册");
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblQqNum);
		lblQqNum.setBounds(20, 20, 80, 20);
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20, 40, 80, 20);
		this.getContentPane().add(txtQqNum);
		txtQqNum.setBounds(80, 20, 140, 20);
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80, 40, 140, 20);
		this.getContentPane().add(btnLogin);
		btnLogin.setBounds(40, 100, 60, 20);
		this.getContentPane().add(btnCancle);
		btnCancle.setBounds(120, 100, 60, 20);
		this.getContentPane().add(btnregister);
		btnregister.setBounds(200, 100, 60, 20);
		
		btnLogin.addActionListener(new BtnListener(this));
		btnregister.addActionListener(new RegisterListener());
		
		this.setTitle("登录");
		this.setSize(300,300);
		this.setVisible(true);
	}

}
