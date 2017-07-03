
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class game {

	Scanner input = new Scanner(System.in);
	ArrayList<puke> pukeList = new ArrayList<puke>(52);
	ArrayList<players> playersList = new ArrayList<players>(2);
	ArrayList<puke> handList1 = new ArrayList<puke>(26);
	ArrayList<puke> handList2 = new ArrayList<puke>(26);
	
	String[] color = new String[] {"����","����","÷��","����"};
	String[] number = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	
	public void CreateGame(){
		System.out.println("����ϷΪ������Ϸ");
		for(int i =0;i<2;i++){
			System.out.println("������"+(i+1)+"����ҵ�����");
			playersList.add(new players(input.next()));
		}
	}
	public void CreatePuke(){
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				pukeList.add(new puke(color[i],number[j]));
			}
		}
	}
	public void ShuffleTheCards(){
		Random rd = new Random();
		for(int i=0;i<52;i++){
			int j=rd.nextInt(52);
			puke temp=(puke) pukeList.get(i);
			pukeList.set(i,pukeList.get(j));
			pukeList.set(j,temp);
		}
	}
	public void dealCard(){
		for(int i=0;i<52;i++){
			if(i%2== 0){
				handList1.add(pukeList.get(i));
			}
			else{
				handList2.add(pukeList.get(i));
			}
			
		}
	}
	public void gameOn(){
		System.out.println("���"+playersList.get(0).getName()+"������Ϊ��");
		for(puke i:handList1){
			System.out.println(i.getColor()+i.getNumber());
		}
		System.out.println("���"+playersList.get(1).getName()+"������Ϊ��");
		for(puke i:handList2){
			System.out.println(i.getColor()+i.getNumber());
		}
	}
}
