package com.MYQQ.user.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{

	//�����ı��򣬰�ť
	JLabel lblQqNum;
	JLabel lblPassword;
	JTextField txtQqNum;
	JTextField txtPassword;
	JButton btnLogin;
	JButton btnCancle;
	public LoginFrame(){
	//�������弰�������
	this.setTitle("QQ��¼");
	this.setSize(300,200);
	this.setVisible(true);
	lblQqNum=new JLabel("QQ�ţ�");
	lblPassword=new JLabel("���룺");
	txtQqNum=new JTextField();
	txtPassword=new JPasswordField();
	btnLogin=new JButton("��¼");
	btnCancle=new JButton("ȡ��");
	//�����ݷ��������
	this.getContentPane().setLayout(null);
	this.getContentPane().add(lblQqNum);
	lblQqNum.setBounds(20, 20, 80, 20);
	this.getContentPane().add(lblPassword);
	lblPassword.setBounds(20,50, 80, 20);
	this.getContentPane().add(txtQqNum);
	txtQqNum.setBounds(80,20, 140, 20);
	this.getContentPane().add(txtPassword);
	txtPassword.setBounds(80, 50 ,140, 20);
	this.getContentPane().add(btnLogin);
	btnLogin.setBounds(60, 100, 80, 20);
	this.getContentPane().add(btnCancle);
	btnCancle.setBounds(160, 100, 80, 20);
	btnLogin.addActionListener(new btnListener(this));
	
}

}
