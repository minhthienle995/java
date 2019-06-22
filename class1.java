package classs;

class Rectangle
{
	public float w,h;
	public Rectangle ()
	{
		w=0.0f;
		h=0.0f;
	}
	public float calSquare()
	{
		return w*h;
	}
}

public class class1 {

	
	public static void main(String[] args) {
		Rectangle r;
		r = new Rectangle();
		r.h=15.0f;
		r.w=777.0f;
		float dt = r.calSquare();
		System.out.println( " Diện tich hình chữ nhật là:" + dt);

	}
}
