package week4;

public class ThisKeyword {
	
	
	int id;
	String name;
	
	ThisKeyword(int id,String name){
		
		this.id = id;
		this.name = name;
		
	}

	void show() {
		
		System.out.println("Id = "+id+" and name "+name);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword thisname = new ThisKeyword(123,"Mahesh");
		
		thisname.show();
		
	}
	
}
