public class VbStats //extends Statics
	{
	private int hitterKills;
	private int hitterAttempts;
	private int hitterErrors;

	public VbStats(int k, int a, int e)
		{
		hitterKills = k;
		hitterAttempts = a;
		hitterErrors = e;
		}

	public int getKills()
		{
		return hitterKills;
		}

	public void setKills(int k)
		{
		this.hitterKills = k; 
		}

	public int getAttempts()
		{
		return hitterAttempts;
		}

	public void setAttempts(int a)
		{
		this.hitterAttempts = a;
		}

	public int getErrors()
		{
		return hitterErrors;
		}

	public void setErrors(int e)
		{
		this.hitterErrors = e;
		}

	}
