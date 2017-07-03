package com.MYQQ.user.view;

import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import com.MYQQ.entity.user;
import com.MYQQ.message.service.ServerThread;
import com.MYQQ.message.vew.ChatFrame;
import com.MYQQ.user.service.UserserviceImpl;

public class MainFrame extends JFrame{
	public user myself;
	List<user> friends;
	public HashMap<Integer, ChatFrame> chatingFrames=new HashMap<Integer, ChatFrame>();
	JScrollPane userListPanel=null;
	JTree usersTree=null;
	DefaultTreeModel treeModel=null;
	DefaultMutableTreeNode rootNode=null;
	public MainFrame(){}
	public MainFrame(user u) {
		myself=u;
		rootNode = new DefaultMutableTreeNode("�ҵĺ���");  
		treeModel = new DefaultTreeModel(rootNode); 
		usersTree=new JTree(treeModel);
		usersTree.getSelectionModel().setSelectionMode 
	     (TreeSelectionModel.SINGLE_TREE_SELECTION);  
		usersTree.setShowsRootHandles(true);
		userListPanel=new JScrollPane(usersTree);
		//���������Ϣ
		UserserviceImpl userService=new UserserviceImpl();
		friends=userService.listFriends(u.getQqnum());
		for(user temp:friends){		
			DefaultMutableTreeNode node=new DefaultMutableTreeNode(temp.getQqnum()+" "+temp.getName());
			rootNode.add(node);
		}
		usersTree.addMouseListener(new TreeMouseListener(usersTree,myself,this));
		
		this.getContentPane().add(userListPanel);
		this.setTitle(u.getName());
		this.setSize(200, 500);
		this.setVisible(true);
		
		
		new Thread(new ServerThread()).start();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
