package Elevator;

public class Context {
	
	private Button state;

	public Context(Button state) {
	
		this.state = state;
	}
	
	public Button getState() {
		return state;
	}

	public void setState(Button state) {
		this.state = state;
	}

	public void switchState(){
		state.switchState(this);
	}
	

}
