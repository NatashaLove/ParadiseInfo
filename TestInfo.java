public class TestInfo {
	
	public static void main (String [] args) {
		
		System.out.println("Calling PUBLIC STATIC method from another class:");
		ParadiseInfo.displayInfo();
		// this ParadiseInfo method -displayInfo() is public - so another class (in the same folder can use it);
		// this method is static - so no object needed to use the method, only class (ParadiseInfo).
	}
	
}