package baoco.dev;

import baoco.dev.models.Person;

public class MainApp {
	public static void main(String[] args) {
		final String arrName[] = {"Bao ", "Binh", "Tuan", "Hai","Hung"};
		final int arrOld[] = {11,15,18,40,20};
		
		Person arrPerson[] = new Person[arrName.length];
		for(int i=0; i <  arrPerson.length ; i++) {
		  Person p =new Person (arrName[i], arrOld[i]);
		  arrPerson[i]=p;
		  arrPerson[i].show();
		}
		
		  
		
	}
	
}

