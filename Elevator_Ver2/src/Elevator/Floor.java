package Elevator;

public class Floor {
	
	public Integer floor_no;
	public Floor_Button up_button=null;
	public Floor_Button down_button=null;
	
	public Floor(Integer floor_no,Floor_Button up_button,Floor_Button down_button) 
	{
		// TODO Auto-generated constructor stub
		this.floor_no=floor_no;
		this.up_button=up_button;
		this.down_button=down_button;
	}
	

}
