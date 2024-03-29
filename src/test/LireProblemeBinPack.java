package test;

import probleme.PblBinPack;
import probleme.PblDec;

public class LireProblemeBinPack extends LireProbleme {

	public LireProblemeBinPack(String pathFilename) {
		super(pathFilename);
	}

	@Override
	public PblDec determinerProbleme() {
		PblDec pb;
		int nb_sacs, nb_objets, cap;
		int[] poids;

		nb_objets = lire_int();
		poids = new int[nb_objets];
		for (int j = 0; j < poids.length; j++) {
			poids[j] = lire_int();
		}
		nb_sacs = lire_int();
		cap = lire_int();

		pb = new PblBinPack(nb_objets, poids, cap, nb_sacs);
		return pb;
	}
}
