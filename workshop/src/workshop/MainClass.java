package workshop;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class MainClass {
	public static void main(String[] args) throws IOException {
		File aFile = new File("sample.txt");
		if(!aFile.exists()) {
			System.out.println("the file does not exist");
			System.out.println("Now creating a file");
			aFile.createNewFile();
			System.out.println("The file has been created");
		}
		FileWriter fw = new FileWriter(aFile, true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("first line\n");
		bw.write("second line\n");
		bw.close();
		//fw.close();

		FileReader fr = new FileReader(aFile);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int numLines = 0;
		for(line = br.readLine();line!=null;line=br.readLine()) {
			System.out.println("Before processing");
			System.out.println(line);
			StringTokenizer st = new StringTokenizer(line, "@#++");
			System.out.println(st);
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
			++numLines;
		}
		System.out.print("this file has "+numLines+" lines");
		br.close();
	}
}
