public class VbStats 
	{
	private int kills;
	private int attempts;
	private int errors;

	public VbStats(int k, int a, int e)
		{
		kills = k;
		attempts = a;
		errors = e;
		}

	public int getKills()
		{
		return kills;
		}

	public void setKills(int k)
		{
		this.kills = k; 
		}

	public int getAttempts()
		{
		return attempts;
		}

	public void setAttempts(int a)
		{
		this.attempts = a;
		}

	public int getErrors()
		{
		return errors;
		}

	public void setErrors(int e)
		{
		this.errors = e;
		}

	}
