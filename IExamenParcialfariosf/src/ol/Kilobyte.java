package ol;

public class Kilobyte {

	private double kilobyte;
	private double result;
	
	public Kilobyte() {
		
	}

	public double getKilobyte() {
		return kilobyte;
	}

	public void setKilobyte(double kilobyte) {
		this.kilobyte = kilobyte;
	}

	
	public void kilobyteCalc() {
		result = kilobyte / 1000;
		System.out.println("La conversion de "+kilobyte+" kilobytes a Megabytes es: "+result+"\n");
	}
	

}
