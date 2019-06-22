package classs;

 public class Tamgiac implements FG {
	 public double canh1,canh2,canh3;
		public Tamgiac(double canh1, double canh2, double canh3){
			this.canh1= canh1;
			this.canh2= canh2;
			this.canh3 = canh3;
		}
		
		public double CalS(){
			 double p  =(canh1+canh2+canh3)/2;
			return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
		}
		public double CalP() {
			// TODO Auto-generated method stub
			return canh1+canh2+canh3;
		}

	public void println() {
		
		System.out.println("dien tich hinh tam giac:" +CalS());

		System.out.println("chu vi hinh tam giac:" +CalP());
	}

}
