/*
 * player��
 * ÿ��������Ȼᱻ�����17���ƣ�����ÿ����һ���1����������װ��
 * ÿ�������name���Ժ�level����
 */
package puke;
import java.util.*;
public class player {
	private String name;
	private int level;
	public player(){}
	public player(String name,int level){
		this.name=name;
		this.level=level;
	}
	public LinkedList list=new LinkedList();
	public void setName(String name){
		this.name=name;
		
	}
	public void setLevel(int level){
		this.level=level;
	}
	public String getName(){
		return name;
	}
	public int getlevel(){
		return level;
	}
}
