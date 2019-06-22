package classs;

public class intf implements FG {
	public double chieudai, chieurong;
	public intf (double w, double l) {
		this.chieudai=l;
		this.chieurong=w;
	}
	public double CalS() {
		return chieudai*chieurong;
	}
	public double CalP() {
		return 2*(chieudai+chieurong);
	}
	@Override
	public void println() {
		// TODO Auto-generated method stub
		System.out.println("chu vi hinh cn:" +CalP());
		System.out.println("dien tich hinh cn:" +CalS());
	}
}

