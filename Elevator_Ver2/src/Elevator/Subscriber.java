package Elevator;


public class Subscriber extends Observer{
	
	int score;

	@Override
	public void attach(Publisher p) {
		p.attach(this);
		
	}

	@Override
	public void detach(Publisher p) {
		// TODO Auto-generated method stub
		p.detach(this);
	}

	@Override
	public void update(Publisher p) {
		// TODO Auto-generated method stub
		score=((Elevator)p).getCurrentFloor();
	}

}
