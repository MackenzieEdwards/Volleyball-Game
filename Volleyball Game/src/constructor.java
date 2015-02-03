public class constructor {
	private int height;
	private String color;
	private int number;
	private String state;
	private String name;

	public constructor(String c, int h, int n, String s, String na) {
		height = h;
		color = c;
		number = n;
		state = s;
		name = na;
	}

	public int getHeight()
		{
		return height;
		}

	public void setHeight(int height)
		{
		this.height = height;
		}

	public String getColor()
		{
		return color;
		}

	public void setColor(String color)
		{
		this.color = color;
		}

	public int getNumber()
		{
		return number;
		}

	public void setNumber(int number)
		{
		this.number = number;
		}

	public String getState()
		{
		return state;
		}

	public void setState(String state)
		{
		this.state = state;
		}

	
}
