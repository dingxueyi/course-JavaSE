package Summ;

import java.io.BufferedReader;
import java.io.FileReader;

public class avg {
	public static int avgMath(){
		try{
			int sum=0;
			int count=0;
			BufferedReader br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String [] s=line.split(",");
				sum+=Integer.parseInt(s[2]);
				count++;
				line=br.readLine();
			}
			br.close();
			return sum/count;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}
