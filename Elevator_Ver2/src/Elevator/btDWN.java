package Elevator;

public class btDWN extends Button {
	

	public btDWN(){
		StateName="Up";
	}
	
	public void switchState(Context c){
	
		BtUP btnup=new BtUP();
		c.setState(btnup);
		System.out.println("Elevator is moving " +btnup.getStateName());
	}

}
