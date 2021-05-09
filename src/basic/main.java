package basic;


public class main {

	public static void main(String[] args) {
		Singly_ll sll1= new Singly_ll();
		for(int i=1;i<=10;i++) {
			sll1.add(i);
		}

		sll1.print_list();
		
		sll1.delete(11);
	}
}
