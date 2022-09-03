package ol;

public class Kilobyte {

	private long kilobyte;
	private long result;
	
	public Kilobyte() {
		
	}

	public long getKilobyte() {
		return kilobyte;
	}

	public void setKilobyte(long kilobyte) {
		this.kilobyte = kilobyte;
	}

	
	public void kilobyteCalc() {
		result = kilobyte / 1000;
		System.out.println("La conversion de "+kilobyte+" kilobytes a Megabytes es: "+result+"\n");
	}
	

}
