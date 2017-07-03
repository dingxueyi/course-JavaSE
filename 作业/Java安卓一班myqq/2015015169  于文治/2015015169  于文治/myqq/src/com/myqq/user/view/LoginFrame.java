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
	JButton btnRegister;
	
	public LoginFrame(){
		lblQqNum=new JLabel("QQ号：");
		lblPassword=new JLabel("密码：");
		txtQqNum=new JTextField();
		txtPassword=new JPasswordField();
		btnLogin=new JButton("登录");
		btnRegister=new JButton("注册");
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblQqNum);
		lblQqNum.setBounds(20, 20, 80, 20);
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20, 50, 80, 20);
		this.getContentPane().add(txtQqNum);
		txtQqNum.setBounds(80, 20, 140, 20);
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80, 50, 140, 20);
		this.getContentPane().add(btnLogin);
		btnLogin.setBounds(60, 100, 80, 20);
		this.getContentPane().add(btnRegister);
		btnRegister.setBounds(160, 100, 80, 20);
		
		btnLogin.addActionListener(new BtnListener(this));
		btnRegister.addActionListener(new RegisterListenner(this));
		
		this.setTitle("QQ登录");
		this.setSize(300,200);
		this.setVisible(true);
	}

}
