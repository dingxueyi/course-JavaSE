package com.MYQQ.entity;
import java.io.Serializable;
import java.util.Date;
public class message implements Serializable{
	private int id;//��Ϣ����ˮ��
	private String content;//��Ϣ������
	private int sender;//��Ϣ�ķ�����
	private int receiver;//��Ϣ �Ľ�����
	private Date sendTime;//��Ϣ�ķ���ʱ��
	private Date receiveTime;//��Ϣ�Ľ���ʱ��
	private int state;//��Ϣ��״̬���Ѷ���ɾ��������
	public message(){}
	public message(int id,String content,int sender,int receiver,Date sendTime,Date receiveTime,int state){
		this.id=id;
		this.content=content;
		this.sender=sender;
		this.receiver=receiver;
		this.sendTime=sendTime;
		this.receiveTime=receiveTime;
		this.state=state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public Date getSendtime() {
		return sendTime;
	}
	public void setSendtime(Date sendtime) {
		this.sendTime = sendtime;
	}
	public Date getReceivetime() {
		return receiveTime;
	}
	public void setReceivetime(Date receivetime) {
		this.receiveTime = receivetime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
