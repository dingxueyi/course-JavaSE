package puke;

import java.util.*;


public class Player {
	private String name;
	private int level;
	public LinkedList<Puke> li = new LinkedList();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public LinkedList<Puke> getCard(){
		return li;
	}
}
