public interface Vechicle {
	String veh = "Start";
	String veh1 = "Move";
	String veh2 = "Stop";
	
	public default String Break() {
		return "break";
	}
	public default String Accelator() {
		return "move";
	
	}
	public static String signals() {
		return "right & left";
	}
	
}



