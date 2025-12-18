package h2;

import java.util.ArrayList;
import java.util.List;

public class Bus {
private ArrayList<Passenger> passengers;

public Bus() {
	this.passengers= new ArrayList<>();
}

public void enterBus(Passenger p) {
	passengers.add(p);
}

public void exitBus() {
	for (int i= 0; i<passengers.size(); i++) {
		if(passengers.get(i).getPlanned()==passengers.get(i).getVisited()) {
			passengers.remove(i);
		}
	}
}
public void nextStop(Passenger[] boarding) {
	for(int i=0; i<passengers.size();i++) {
		passengers.get(i).nextVisited();
	}exitBus();
	for (Passenger p: boarding) {
		enterBus(p);
	}
}
public void nextStop() {
for(int i=0; i<passengers.size();i++) {
	passengers.get(i).nextVisited();
}exitBus();
}
public void findPassengersWithoutTickets() {
	ArrayList<Passenger> PassengersWithoutTicket = new ArrayList<>();
	for (int i= 0; i<passengers.size(); i++) {
		if (passengers.get(i).getTicket()==false) {
			Passenger p = passengers.get(i);
			passengers.remove(i);
			PassengersWithoutTicket.add(p);
		}
	}
}

public void transferPassengers(Bus otherBus, String[] passengerNames) {
	List<String> namesToTransfer =List.of(passengerNames);
	ArrayList<Passenger> transferred= new ArrayList<>();
	passengers.removeIf(p ->{
		if(namesToTransfer.contains(p.getName())) {
			transferred.add(p);
			return true;
		}return false;
	});
	otherBus.passengers.addAll(transferred);
}
}


