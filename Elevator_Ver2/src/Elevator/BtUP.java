package Elevator;

public class BtUP extends Button {
	
	
	public BtUP(){
		StateName="Down";
	}
	
	public void switchState(Context c){
		
		btDWN btndwn=new btDWN();
		c.setState(btndwn);
		System.out.println("Elevator is moving " +btndwn.getStateName());
	}

}
