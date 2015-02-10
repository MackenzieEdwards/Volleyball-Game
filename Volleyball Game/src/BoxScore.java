import java.util.ArrayList;

public class BoxScore extends Position
	{
	
	private void print(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void stats(VbStats mb, VbStats rs, VbStats oh)
		{
		float pct = (float) 0.000;
		float totalPct = (float) 0.000;
		int totalKills = 0;
		int totalHits = 0;
		int totalErrors = 0;
		
		System.out.println();
		System.out.println("Volleyball Match Box Scores");
		System.out.println("---------------------------");
		System.out.println("Position   Kills   Attempts   Errors   Hitting %");
		System.out.println("---------- -----   --------   ------   ---------");
		// calculate the stats
		System.out.print("Middle      " + mb.getKills() + "        " + mb.getAttempts() + "         " + mb.getErrors() + "       ");
		
		if(mb.getAttempts()>0)
			pct = (float)(mb.getKills()-mb.getErrors())/(mb.getAttempts());
		else 
			pct = (float) 0.000;
		
		System.out.printf("% 5.3f", pct);
		System.out.println();
		
		System.out.print("Right Side  " + rs.getKills() + "        " + rs.getAttempts() + "         " + rs.getErrors() + "       ");
		
		if(rs.getAttempts() > 0)
			pct = (float)(rs.getKills()-rs.getErrors())/rs.getAttempts();
		else
			pct = (float) 0.000;
		
		System.out.printf("% 5.3f", pct);
		System.out.println();
		
		System.out.print("Outside     " + oh.getKills() + "        " + oh.getAttempts() + "         " + oh.getErrors() + "       ");
		
		if(oh.getAttempts()> 0)
			pct = (float)(oh.getKills()-oh.getErrors())/oh.getAttempts();
		else
			pct = (float) 0.000;
		
		System.out.printf("% 5.3f", pct);
		System.out.println();
		System.out.println("---------- -----   --------   ------   ---------");
		System.out.printf("%10s","Totals");
		totalKills = (mb.getKills()+rs.getKills()+oh.getKills());
		System.out.printf("% 4d",totalKills);
		totalHits = (mb.getAttempts()+rs.getAttempts()+oh.getAttempts());
		System.out.printf("%9d",totalHits);
		totalErrors = (mb.getErrors()+rs.getErrors()+oh.getErrors());
		System.out.printf("%10d",totalErrors);
		totalPct = (float)(totalKills-totalErrors)/totalHits;
		System.out.printf("% 12.3f", totalPct);
		// (kills - errors)/ attempts
		//example:
		//int stats = (int) (((kills - errors) / attempts) * 1000);
		//System.out.println(stats);
		}

	}
