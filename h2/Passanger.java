package h2;

public class Passenger {
private String name;
private int planned;
private int visited;
private boolean ticket;
public Passenger(String name, int planned, int visited, boolean ticket) {
	this.name=name;
	this.planned=planned;
	this.ticket=ticket;
	this.visited=0;
}
public String getName() {
	return name;
}

public int getPlanned() {
	return planned;
}
public int getVisited() {
	return visited;
}
public int nextVisited() {
this.visited= visited +1;
}
public boolean getTicket() {
	return ticket;
}
}