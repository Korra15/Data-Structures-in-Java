package basic;
import java.io.*;
import java.util.ArrayList;


public class FileHandling {
	
	
	public static void Createfile() {
		try {
			File Llfile = new File("Singlyll_File1.txt");
			if(Llfile.createNewFile()) 
				System.out.println("File created: "+Llfile.getName());
			else 
				System.out.println("File already exists");
		}
		catch(IOException e) {
			System.out.println("An error occured");
		}
	}
	
	public static void Writetofile(String text) {
		try {
			//FileWriter writer = new FileWriter("Singlyll_File1.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter("Singlyll_File1.txt", true));

			writer.write(text.trim());
			writer.write("\n");
			writer.close();
			System.out.println("Successfully Written");
		}
		catch(IOException e) {
			System.out.println("An error occured");
		}	
	}
	
	public static void Clearfiledata(String path) {
		try {
			FileWriter writer1 = new FileWriter(path, false);
			PrintWriter pwOb = new PrintWriter(writer1, false);
			pwOb.flush();
			pwOb.close();
			writer1.close();
		} catch (IOException e) {
			System.out.println("Some Error occurred");

		}		
	}
	
	public static ArrayList<Integer> Readfromfile() {
		int tmp;
		ArrayList<Integer> ll_data = new ArrayList<Integer>();
		try 
		{
			BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Ayushi Parikh\\eclipse-workspace\\Linked_List\\Singlyll_File1.txt"));
			String line=reader.readLine();
			while(line!=null) {
				tmp=Integer.parseInt(line.trim());
				ll_data.add(tmp);
				line=reader.readLine();
			}
			reader.close();
			return ll_data;
		}
		catch(IOException e) {
			System.out.println("Some error occured");
		}
		return ll_data;
	}
}

