package virat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

public class A {
//writing to file
	@Test	
public void Write() throws IOException {
	
//File f=new File("E:\\viratkohli.txt");
FileWriter fw=new FileWriter("E:\\viratkohli.txt");
BufferedWriter bw=new BufferedWriter(fw);
bw.write("hi");
bw.newLine();
bw.write("ajay");
bw.flush();
	}
	
	//reading from file
	@Test
	public void Read() throws IOException{
		java.io.FileReader fr=new java.io.FileReader("E:\\ajay.txt");
		BufferedReader br=new BufferedReader(fr);
		String x="";
	while ((x=br.readLine())!=null) {
		System.out.println(x);
		
	}
	}
}

