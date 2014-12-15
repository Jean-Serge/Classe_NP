package test;

import probleme.PblDec;

public class Test_Partition {

	private static final String path = "donnees/data Reduction/exPartition";

	public static void main(String[] args) {
		LireProbleme lecture;
		PblDec pb;
		for (int i = 1; i <= 4; i++) {
			System.out
					.println("===================================================================");
			lecture = new LireProblemePartition(path + i);
			pb = lecture.determinerProbleme();
			System.out.println(pb.toString());

			if (pb.aUneSolution())
				System.out.println("\nL'exemple n°" + i + " a une solution.\n");
			else
				System.out
						.println("L'exemple n°" + i + " n'a pas de solution.");
			System.out
					.println("===================================================================");
		}
	}

}
