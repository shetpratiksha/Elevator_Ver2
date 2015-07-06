package Elevator;

import java.util.ArrayList;

public abstract class Publisher {
	
ArrayList<Observer> o= new ArrayList<Observer>();
	
	public abstract void attach(Observer o);
	public abstract void detach(Observer o);
	public abstract void sendNotification(Observer o);

}
