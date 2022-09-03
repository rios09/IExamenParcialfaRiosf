package ol;

public class ByteClass {

	private double byteNum;
	private double result;
	
	public ByteClass() {
		
	}

	public double getByteNum() {
		return byteNum;
	}

	public void setByteNum(double byteNum) {
		this.byteNum = byteNum;
	}
	
	public void byteCalc() {
		result = byteNum / 1000;
		System.out.println("La conversion de "+byteNum+" Bytes a kilobytes es: "+result+"\n");
	}
	
}
