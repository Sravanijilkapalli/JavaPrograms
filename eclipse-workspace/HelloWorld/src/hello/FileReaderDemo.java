package hello;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
		//approach1: using FileReader and BufferedReader method
		
		FileReader fr = new FileReader("D:\\file.txt");

		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str =br.readLine())!=null) {
			
			System.out.println(str);
		}
		br.close();
		
		//Approach2: File And Scanner class
		
		File file = new File ("D:\\file.txt");
		Scanner sc = new Scanner(file);
		
		//loop statement
		
		/*while(sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
			
		}*/
		
		//Approach3
		sc.useDelimiter("\\z");
		System.out.println(sc.next());

	}
	
	
	

}
