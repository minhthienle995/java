package classs;

class setEdges
{
	private float w,h;
	public void setEdges(float W, float H)
	{
		w=W;
		h=H;
	}
	public float dtich()
	{
		return w*h;
	}
}

public class class2 {

	public static void main(String[] args)
	{
		setEdges r;
		r = new setEdges();
		r.setEdges(10.0f, 5.0f);
		float dientich = r.dtich();
		System.out.println( " Diện tich hình chữ nhật là:" + dientich);
	}

}
