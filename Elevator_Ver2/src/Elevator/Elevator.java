package Elevator;

public class Elevator extends Publisher {

	int CurrentFloor;
	int TotalFloor;
	Elevator_Door ele_door;
	
	
	Elevator(int c_floor ,int total_floor)
	{
		this.CurrentFloor=c_floor;
		this.TotalFloor=total_floor;
		ele_door = new Elevator_Door();		
	}
	
	public int getCurrentFloor() {
		return CurrentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		CurrentFloor = currentFloor;
	}

	public void sendNotification(){
		for(int i=0;i<o.size();i++){
			o.get(i).update(this);
		}
	}
	
	void door_state()
	{
		ele_door.change_state();
	}

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendNotification(Observer o) {
		// TODO Auto-generated method stub
		
	}
	
}
