public class VolleyballStats extends Statics
	{
	private int hitterKills;
	private int hitterAttempts;
	private int hitterErrors;

	public VolleyballStats(int k, int a, int e)
		{
		hitterKills = k;
		hitterAttempts = a;
		hitterErrors = e;
		}

	public int getKills()
		{
		return hitterKills;
		}

	public void setKills(int kills)
		{
		this.hitterKills = kills; 
		}

	public int getAttempts()
		{
		return hitterAttempts;
		}

	public void setAttempts(int attempts)
		{
		this.hitterAttempts = attempts;
		}

	public int getErrors()
		{
		return hitterErrors;
		}

	public void setErrors(int errors)
		{
		this.hitterErrors = errors;
		}

	}
