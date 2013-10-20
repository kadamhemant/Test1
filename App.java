package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class FileOperations{
	String d1;
	protected void FileCreate(String S1) throws IOException{
		 d1="C:\\testing\\"+S1+".txt";
		File f = new File(d1);
		
		f.createNewFile();
		
		
		System.out.println("File created Successfully");
	}
	
	protected void FileWrite(String S2) throws IOException{
		FileWriter FW = new FileWriter(d1);
		BufferedWriter out = new BufferedWriter(FW);
		out.append(S2);
		out.flush();
		out.close();
		System.out.println("File data written successfully");
		FileReader FR = new FileReader(d1);
		BufferedReader bfr = new BufferedReader(FR);	
		String x ="";
		
		
		//System.out.println(bfr.readLine());
		//System.out.println(bfr.readLine());
		//System.out.println(bfr.readLine());
		
		
		while((x = bfr.readLine()) != null){
			System.out.println("Data you entered in the file is \n" +x);
		}
			
		bfr.close();
	}
	
	
}


public class App {
public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter file name to create a file");
		
		String FileName=in.nextLine();
		FileOperations obj1 = new FileOperations();
		obj1.FileCreate(FileName);
		
		
		System.out.println("Enter file data to be written in file");
		
		String FilewriteData=in.nextLine();
		obj1.FileWrite(FilewriteData);
		
		in.close();	
	}

}
