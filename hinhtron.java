package interface1;

public class hinhtron implements Toanhoc{
	public double bankinh;
	public double pi=3.14;
	public hinhtron (double r) {
		this.bankinh=r;
		
	}
	public double calS() {
		return pi*pi*bankinh;
	}
	public double calP() {
		return pi*bankinh;
	}
	@Override
	public void println() {
		// TODO Auto-generated method stub
		System.out.println("dien tich hinh hinhtron:" +calS());

		System.out.println("chu vi hinh hinhtron:" +calP());
	}
	}


