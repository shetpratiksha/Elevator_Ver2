package Elevator;


public abstract class Button {

	
		
		protected String StateName;
			
			abstract void switchState(Context c);

			public String getStateName() {
				return StateName;
			}


}
