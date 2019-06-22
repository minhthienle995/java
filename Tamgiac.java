package classs;

public class Tamgiac {

	public class tamgiac {
		public double canh1,canh2,canh3;
		public tamgiac(double canh1, double canh2, double canh3){
			this.canh1= canh1;
			this.canh2= canh2;
			this.canh3 = canh3;
		}
		public double p=(canh1+canh2+canh3)/2;
		public double calS(){
			return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
		}

		public double calP() {
		
			return canh1+canh2+canh3;
		}
	}
}
