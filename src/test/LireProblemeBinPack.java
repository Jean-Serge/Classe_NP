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
		PblBinPack pb;
		int nb_sacs, nb_objets, cap;
		int[] poids;

		try {
			is = new FileInputStream(new File(pathFilename));
		} catch (FileNotFoundException e) {
			System.out.println("Fichier non trouvé : " + pathFilename);
			e.printStackTrace();
		}
		nb_objets = lire_int(is);
		poids = new int[nb_objets];
		for (int j = 0; j < poids.length; j++) {
			poids[j] = lire_int(is);
		}
		nb_sacs = lire_int(is);
		cap = lire_int(is);

		pb = new PblBinPack(nb_objets, poids, cap, nb_sacs);
	}

	public static void main(String[] args) {
		PblBinPack pb;
		int nb_sacs, nb_objets, cap;
		int[] poids;
		InputStream is = null;
		String filepath = "donnees/data BinPack/exemple";

		for (int i = 1; i <= 6; i++) {

		}

	}

	/**
	 * Lit l'entier sur la prochaine ligne du fichier.
	 * 
	 * @param is
	 *            le flux du fichier à lire
	 * @return l'entier lu
	 */
	private static int lire_int(InputStream is) {
		int x = 0, c;
		try {
			while ((c = is.read()) != '\n') {
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
