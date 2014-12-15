package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import probleme.PblDec;

public abstract class LireProbleme {

	private InputStream is;

	public LireProbleme(String pathFilename) {
		try {
			is = new FileInputStream(new File(pathFilename));
		} catch (FileNotFoundException e) {
			System.out.println("Fichier non trouvé : " + pathFilename);
			e.printStackTrace();
		}
	}

	public abstract PblDec determinerProbleme();

	/**
	 * Lit l'entier sur la prochaine ligne du fichier.
	 * 
	 * @param is
	 *            le flux du fichier à lire
	 * @return l'entier lu
	 */
	protected int lire_int() {
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
