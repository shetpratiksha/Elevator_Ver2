package Elevator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Total_Floor=7;
		Elevator elevator;
		Floor []floor;
		
		System.out.println("---------------------------------\n");
		
		Context ca =new Context(new btDWN());
		ca.switchState();
		Elevator_Door ed = new Elevator_Door();
		
		floor=new Floor[Total_Floor];
		floor[0]=new Floor(0, new Floor_Button(0), null);
		for(int i=1;i<Total_Floor-1;i++)
		{
			floor[i]=new Floor(i, new Floor_Button(i), new Floor_Button(i));
			
		}

        floor[Total_Floor-1]=new Floor(Total_Floor-1, null, new Floor_Button(Total_Floor-1));
		
		elevator=new Elevator(Total_Floor, 0);
		
		floor[5].up_button.request_elevator(elevator,5);
		elevator.door_state();
		floor[2].up_button.request_elevator(elevator,2);
		
		Publisher p=new Elevator(2,7);
		Observer o1=new Subscriber();
		//((Elevator)p).setCurrentFloor(3);
		System.out.println("Current lift postion is:"+((Elevator)p).getCurrentFloor());
	
	}

}
