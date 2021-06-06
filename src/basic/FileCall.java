package basic;
import java.util.ArrayList;



public class FileCall {

	public static void main(String[] args) {
		Singly_ll sll1= new Singly_ll();
	
		//String text;
		//for(int i=1;i<=10;i++) {
		//	sll1.add(i);
		//}
        

		//FileHandling.Createfile();
        
		//sll1.delete(1);
		ArrayList<Integer> ll_data = new ArrayList<Integer>();
		ll_data=FileHandling.Readfromfile();
		
		FileHandling.Clearfiledata("C:\\Users\\Ayushi Parikh\\eclipse-workspace\\Linked_List\\Singlyll_File1.txt");

		int len=ll_data.size();
		for(int i=0;i<len;i++)
		{
			sll1.add(ll_data.get(i));
		}
		
		sll1.write_list();
	}
}
