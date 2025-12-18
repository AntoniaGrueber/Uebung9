package h1;

import java.util.ArrayList;


public class PrioListe {
	private ArrayList<Patient> myList;
	
public PrioListe(){
	this.myList= new ArrayList<>();
}
	
public void addPatient(Patient p) {
	for (int i=0; i < myList.size(); i++) {
		if (p.getPrio()<myList.get(i).getPrio()) {
			myList.add(i,p);
			return;
		}
	}myList.add(p);
}

public Patient getNextPatient() {
	if(myList.isEmpty()) {
		return null;
	}return myList.remove(0);
}
public int getPosition(Patient p) {
	for(int i=0; i<myList.size(); i++) {
		if(myList.get(i)==p) {
			return i;
		}
	}return -1;
}
}
