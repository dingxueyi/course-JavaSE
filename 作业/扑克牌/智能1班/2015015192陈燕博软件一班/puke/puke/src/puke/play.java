package puke;

import java.util.ArrayList;
import java.util.Random;
public class play {

	public static void main(String[] args) {
		//����һ��ArrayList�ļ��ϣ����54���˿���
		ArrayList list1=new ArrayList();
		//����4��ѭ������ʼ��54����
		for(int i=0;i<13;i++){
			list1.add(new puke("����",i+1));
		}
		for(int i=0;i<13;i++){
			list1.add(new puke("��Ƭ",i+1));
		}
		for(int i=0;i<13;i++){
			list1.add(new puke("÷��",i+1));
		}
		for(int i=0;i<13;i++){
			list1.add(new puke("����",i+1));
		}
		list1.add(new puke("����",0));
		list1.add(new puke("С��",0));
		//��ӡ54����,��Ϊ��ӡ����Ϊ��ϣֵ������ת��Ϊpuke���ͣ�Ȼ��ͨ��get�����õ���ɫ����ֵ
		System.out.println("����54���˿ˣ�");
		for(int j = 0;j <list1.size();j++){
			puke a=(puke) list1.get(j);
			System.out.print(a.getHuase()+a.getNumber()+"    ");
		};
		//��ʼ��3�����
		player player1=new player("����",1);
		player player2=new player("����",2);
		player player3=new player("����",3);
		
		Random r = new Random();
		//�����������ҷ��ƣ���һ���ƾʹ�list1��ɾ��һ�ţ������ظ�����
		//���ѡ��ơ�ת��Ϊpuke����������ҵ�list������
		for(int i=0;i<17;i++){
			int n=r.nextInt(list1.size());
			player1.list.add((puke)list1.get(n));
			list1.remove(n);
		}
		for(int i=0;i<17;i++){
			int n=r.nextInt(list1.size());
			player2.list.add((puke)list1.get(n));
			list1.remove(n);
		}
		for(int i=0;i<17;i++){
			int n=r.nextInt(list1.size());
			player3.list.add((puke)list1.get(n));
			list1.remove(n);
		}
		//��ÿ����ҵ��ƴ�ӡ����
		//��Ϊ�ǹ�ϣֵ����Ӧ��ת��Ϊpuke����
		System.out.println();
		System.out.println("���һ��"+player1.getName()+"����"+player1.getlevel());
		for(int i=0;i<player1.list.size();i++){
			puke a=(puke)player1.list.get(i);
			System.out.print(a.getHuase()+a.getNumber()+"   ");
		}
		System.out.println();
		System.out.println("��Ҷ���"+player2.getName()+"����"+player2.getlevel());
		for(int i=0;i<player2.list.size();i++){
			puke a=(puke)player2.list.get(i);
			System.out.print(a.getHuase()+a.getNumber()+"   ");
		}
		System.out.println();
		System.out.println("�������"+player3.getName()+"����"+player3.getlevel());
		for(int i=0;i<player3.list.size();i++){
			
			puke a=(puke)player3.list.get(i);
			System.out.print(a.getHuase()+a.getNumber()+"   ");
		}
		//����ӡ������
		System.out.println();
		System.out.println("�����ǣ�");
		for(int i=0;i<list1.size();i++){
			
			puke a=(puke)list1.get(i);
			System.out.println(a.getHuase()+a.getNumber()+"   ");
		}
		
	}

}
