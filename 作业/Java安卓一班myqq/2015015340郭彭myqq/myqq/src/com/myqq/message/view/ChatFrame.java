package com.myqq.message.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class ChatFrame extends JFrame{
	User myself;
	public User getMyself() {
		return myself;
	}

	public void setMyself(User myself) {
		this.myself = myself;
	}
	User another;
	
	public User getAnother() {
		return another;
	}

	public void setAnother(User another) {
		this.another = another;
	}
	JTextArea txtList=null;
	JTextField txtMsg=null;
	JButton btn=null;
	public JTextArea getTxtList() {
		return txtList;
	}

	public void setTxtList(JTextArea txtList) {
		this.txtList = txtList;
	}
	public ChatFrame(User myself, String other){
		this.myself=myself;
		String temp[]=other.split(" ");
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		another=userServiceImpl.listByQqNum(Integer.parseInt(temp[0]));
		JPanel panel=new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());
		
		txtList=new JTextArea(5, 20);
		panel.add(txtList, BorderLayout.CENTER);
		
		JPanel txtPanel=new JPanel();
		txtMsg=new JTextField(10);
		btn=new JButton("发送");
		
		btn.addActionListener(new BtnListener(this));
		
		txtPanel.add(txtMsg);
		txtPanel.add(btn);
		panel.add(txtPanel, BorderLayout.SOUTH);
		
		this.setTitle(temp[1]);
		this.setSize(400,300);
		this.setVisible(true);
		
	}
	public JTextField getTxtMsg() {
		return txtMsg;
	}
}
