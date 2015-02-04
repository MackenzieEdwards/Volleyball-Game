public class constructor
	{
	private int kills;
	private int attempts;
	private int errors;

	public constructor(int k, int a, int e)
		{
		kills = k;
		attempts = a;
		errors = e;
		}

	public int getKills()
		{
		return kills;
		}

	public void setKills(int kills)
		{
		this.kills = kills;
		}

	public int getAttempts()
		{
		return attempts;
		}

	public void setAttempts(int attempts)
		{
		this.attempts = attempts;
		}

	public int getErrors()
		{
		return errors;
		}

	public void setErrors(int errors)
		{
		this.errors = errors;
		}

	}
