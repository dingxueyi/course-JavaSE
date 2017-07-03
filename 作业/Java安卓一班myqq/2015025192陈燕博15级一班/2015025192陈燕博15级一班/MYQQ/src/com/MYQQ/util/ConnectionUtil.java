package com.MYQQ.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConnectionUtil {
	static{
		//����������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

public static Connection getCon(){
	//�������ݿ�
	try {
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/myqq_db?useUnicode=true&characterEncoding=UTF-8","root","");
		return con;
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	}
}
//�ر��������ݿ�
public static void closeCon(ResultSet rs,PreparedStatement pstm,Connection con){
	try{
		if(rs!=null)
			rs.close();
		if(pstm!=null)
			pstm.close();
		if(con!=null)
			con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
