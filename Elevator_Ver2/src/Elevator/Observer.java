package Elevator;

public abstract class Observer {

	public abstract void attach(Publisher p);
	public abstract void detach(Publisher p);
	public abstract void update(Publisher p);
}
