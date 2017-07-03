package com.MYQQ.util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.MYQQ.entity.message;
public class Serializableutil {
	public static byte[] serializableMessage(message message1) throws Exception{
		ByteArrayOutputStream byteArrayOutputStream=null;
		ObjectOutputStream  objectOutputStream=null;
		try{
			byteArrayOutputStream=new ByteArrayOutputStream();
			//���ֽ����������Ϊ���Ŀ�ĵأ��������л���
			objectOutputStream =new ObjectOutputStream(byteArrayOutputStream);
			//��message�������л���������ֽ�������
			objectOutputStream.writeObject(message1);
			//�õ��ֽ��������е�����
			return byteArrayOutputStream.toByteArray();
		}finally{
			if(byteArrayOutputStream !=null){
				byteArrayOutputStream.close();
			}
			if (objectOutputStream != null) {
                objectOutputStream.close();
            }
		}
	}
	//�����л�
	public static message unSeralizableMessage(byte[] cache)throws Exception{
		ByteArrayInputStream byteArrayInputStream=null;
		ObjectInputStream  objectInputStream=null;
		try{
			byteArrayInputStream=new ByteArrayInputStream(cache);
			objectInputStream=new ObjectInputStream(byteArrayInputStream);
			return (message)objectInputStream.readObject();
		}finally{
			if(byteArrayInputStream !=null){
				
				byteArrayInputStream.close();
			}
			if(objectInputStream!=null){
				objectInputStream.close();
			}
		}
		
	}
}
