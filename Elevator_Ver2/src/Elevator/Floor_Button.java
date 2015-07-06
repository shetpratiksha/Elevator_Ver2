package Elevator;

public class Floor_Button {
	int Floor_no;
	
	
	Floor_Button(int flow_no)
	{
		this.Floor_no=flow_no;
	}

	void request_elevator(Elevator elevator,int request_floor )
	{
		int current_floor=elevator.CurrentFloor;
		if(elevator.ele_door.state=="close")
		{
			if(request_floor>current_floor)
			{
				for(Integer i=current_floor;i<=request_floor;i++)
				{
					System.out.print(i+"...");
				}
				System.out.println();
				elevator.CurrentFloor=request_floor;
			
			}
			else if(request_floor<current_floor)
			{
				for(Integer i=current_floor;i>=request_floor;i--)
				{
					System.out.print(i+"...");
				}
				System.out.println();
				elevator.CurrentFloor=request_floor;
			}
			else
			{
				System.out.println("Lift is already at the requested floor.");
			}
		}
		else
		{
			System.out.println("The lift is currently open");
		}
	}
}
