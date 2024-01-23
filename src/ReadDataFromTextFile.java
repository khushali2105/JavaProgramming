import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		
		// 1) Using FileReader and BufferReader
		
		FileReader fr  = new FileReader("location of file");
		BufferedReader br  = new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
		br.close();
		
		//2)  Using Scanner and File with loop
		/*
		File file = new File("location of file");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) 
		{
			System.out.println(sc.hasNextLine());
		}
		*/
		
		
		// 3) Using Scanner and File without loop
		
		File file = new File("location of file");
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		

	}

}
