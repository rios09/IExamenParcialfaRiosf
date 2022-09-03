package ol;

public class ByteClass {

	private long byteNum;
	private long result;
	
	public ByteClass() {
		
	}

	public long getByteNum() {
		return byteNum;
	}

	public void setByteNum(long byteNum) {
		this.byteNum = byteNum;
	}
	
	public void byteCalc() {
		result = byteNum / 1000;
		System.out.println("La conversion de "+byteNum+" Bytes a kilobytes es: "+result+"\n");
	}
	
}
