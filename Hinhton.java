package classs;

public class Hinhton implements FG{
	public double bankinh;
	public double pi=3.14;
	public Hinhton (double r) {
		this.bankinh=r;
		
	}
	public double CalS() {
		return pi*pi*bankinh;
	}
	public double CalP() {
		return pi*bankinh;
	}
	public void println() {
		// TODO Auto-generated method stub
		System.out.println("dien tich hinh hinhtron:" +CalS());

		System.out.println("chu vi hinh hinhtron:" +CalP());
	}
	}


