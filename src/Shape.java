
public class Shape {
	private int size;
	private int num;
	
	public Shape(int size, int num) {
	this.size = size;
	this.num = num;
	num = num+1;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
