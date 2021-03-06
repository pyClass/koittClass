package day10;

public class Nemo extends Dohyung {
	private int width;
	private int height;
	
	public Nemo() {
		this(1, 1);
	}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = width * height;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("사각형 - 가  로 : %3d | 세  로 : %3d | 넓  이 : %6.2f\n", width, height, area);
	}

}
