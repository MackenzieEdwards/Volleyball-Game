public class BoxScore extends Position {

	public static void stats(VbStats mb, VbStats rs, VbStats oh) {
		double pct = (float) 0.000;
		double totalPct = (float) 0.000;
		int totalKills = 0;
		int totalHits = 0;
		int totalErrors = 0;

		System.out.println();
		System.out.println("Volleyball Match Box Scores");
		System.out.println("---------------------------");
		System.out.println("Position   Kills   Attempts   Errors   Hitting %");
		System.out.println("---------- -----   --------   ------   ---------");
		// calculate the stats
		 System.out.printf("%-10s","Middle");
		 System.out.printf("%4s",mb.getKills());
		 System.out.printf("%10s",mb.getAttempts());
		 System.out.printf("%10s",mb.getErrors());

		if (mb.getAttempts() > 0)

			pct = (float) (mb.getKills() - mb.getErrors()) / (mb.getAttempts());
		else
			pct = (float) 0.000;

		System.out.printf("%12.3f",pct);
		System.out.println();

		System.out.printf("%-10s","Rightside");
		System.out.printf("%4s",rs.getKills());
		System.out.printf("%10s", rs.getAttempts());
		System.out.printf("%10s",rs.getErrors());
		
		if (rs.getAttempts() > 0)
			pct = (float) (rs.getKills() - rs.getErrors()) / rs.getAttempts();
		else
			pct = (float) 0.000;

		System.out.printf("%12.3f", pct);
		System.out.println();
		
		System.out.printf("%-10s","Outside");
		 System.out.printf("%4s",oh.getKills());
		 System.out.printf("%10s",oh.getAttempts());
		 System.out.printf("%10s",oh.getErrors());
		 
		if (oh.getAttempts() > 0)
			pct = (float) (oh.getKills() - oh.getErrors()) / oh.getAttempts();
		else
			pct = (float) 0.000;

		System.out.printf("%12.3f", pct);
		System.out.println();
		System.out.println("---------- -----   --------   ------   ---------");
		System.out.printf("%-10s", "Totals");
		totalKills = (mb.getKills() + rs.getKills() + oh.getKills());
		System.out.printf("%4s", totalKills);
		totalHits = (mb.getAttempts() + rs.getAttempts() + oh.getAttempts());
		System.out.printf("%10s", totalHits);
		totalErrors = (mb.getErrors() + rs.getErrors() + oh.getErrors());
		System.out.printf("%10s", totalErrors);
		totalPct = (float) (totalKills - totalErrors) / totalHits;
		System.out.printf("%12.3f", totalPct);
	}

}
