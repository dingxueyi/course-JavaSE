package com.MYQQ.entity;
import java.util.Date;
public class user {
	private int qqnum;//qq��
	private String name;//�ǳ�
	private String password;//����
	private Date time;//����ʱ��
	private String sex;//�Ա�
	private String introduce;//���˼��
	private String ip;//ip
	public int getQqnum() {
		return qqnum;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setQqnum(int qqnum) {
		this.qqnum = qqnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

}
