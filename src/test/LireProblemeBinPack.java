package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import probleme.PblBinPack;

public class LireProblemeBinPack {

	private InputStream is;

	public LireProblemeBinPack(String pathFilename) {
		try {
			is = new FileInputStream(new File(pathFilename));
		} catch (FileNotFoundException e) {
			System.out.println("Fichier non trouvé : " + pathFilename);
			e.printStackTrace();
		}
	}

	public PblBinPack determinerProbleme() {
		PblBinPack pb;
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

	/**
	 * Lit l'entier sur la prochaine ligne du fichier.
	 * 
	 * @param is
	 *            le flux du fichier à lire
	 * @return l'entier lu
	 */
	private int lire_int() {
		int x = 0, c;
		try {
			while ((c = this.is.read()) != '\n') {
				x *= 10;
				x += c - '0';
			}

		} catch (IOException e) {
			System.out.println("Problème de lecture du fichier.");
			e.printStackTrace();
		}

		return x;
	}
}
