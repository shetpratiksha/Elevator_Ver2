package Elevator;

public class Elevator_Door {
	
	String state;
	
	Elevator_Door ()
	{
		state="close";
	}

	
	void change_state()
	{
		if(state=="close")
		{
			state="open";
			System.out.println("opening the door");
		}
		else
		{
			state="close";
			System.out.println("close the door");
			
		}
	}
}
