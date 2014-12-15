package test;

import probleme.PblDec;
import probleme.PblPartition;

public class LireProblemePartition extends LireProbleme {

	public LireProblemePartition(String pathFilename) {
		super(pathFilename);
	}

	@Override
	public PblDec determinerProbleme() {
		PblDec pb;
		int nb_objets;
		int[] poids;

		nb_objets = lire_int();
		poids = new int[nb_objets];
		for (int j = 0; j < poids.length; j++) {
			poids[j] = lire_int();
		}

		pb = new PblPartition(nb_objets, poids);
		return pb;
	}
}
