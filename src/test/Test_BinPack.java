package test;

import probleme.PblBinPack;

public class Test_BinPack {

	private static final String path = "donnees/data BinPack/exemple";

	public static void main(String[] args) {
		LireProblemeBinPack lecture;
		PblBinPack pb;
		for (int i = 1; i <= 6; i++) {
			System.out
					.println("===================================================================");
			lecture = new LireProblemeBinPack(path + i);
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
