package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Set {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:/51CTO/Java/Grade.txt");

		BufferedWriter bufw = new BufferedWriter(fw);
		
		bufw.write("1��,������,51,61,62");
		bufw.newLine();
		bufw.write("2��,�ǲ�˹,70,71,72");
		bufw.newLine();
		bufw.write("3��,�����,80,81,82");
		bufw.newLine();
		bufw.write("4��,����,100,100,100");

		bufw.flush();

		bufw.close();
	}

}
