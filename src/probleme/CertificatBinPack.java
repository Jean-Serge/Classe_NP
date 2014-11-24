package probleme;

import java.util.Random;

/**
 * La notion de certificat pour le problème Bin_Pack
 */
public class CertificatBinPack implements Certificat {

	private final PblBinPack pb; // le problème associé au certificat
	private final int certif[];

	public CertificatBinPack(PblBinPack pb) {
		this.pb = pb;
		this.certif = new int[pb.get_nb_objets()];
	}

	/**
	 * Vérifie qu'avec le certificat courant, aucun sac ne verra sa capacité
	 * dépassée.
	 */
	@Override
	public boolean correct() {
		final int sac[] = new int[certif.length];
		final int cap = pb.get_cap();
		final int poids[] = pb.getPoids();

		// On initialise tous les sacs à leur capacité max
		for (int i = 0; i < certif.length; i++) {
			sac[i] = 0;
		}

		for (int i = 0; i < certif.length; i++) {
			// On retire le poids de l'objet du sac où il est mit
			sac[certif[i]] += poids[i];
			// Si la capacité du sac est dépassée, le certificat est invalide
			if (sac[certif[i]] > cap)
				return false;
		}

		return true;
	}

	@Override
	public boolean estDernier() {
		final int nbObj = this.pb.get_nb_objets();
		for (int i = 0; i < this.certif.length; i++) {
			if (this.certif[i] < nbObj)
				return false;
		}
		return true;
	}

	@Override
	public void next() {
		final int k = this.pb.get_nb_objets();
		int i = k - 1;
		this.certif[i]++;
		while ((i >= 0) && (this.certif[i] >= 4)) {
			this.certif[i] = 0;
			this.certif[i - 1]++;
			i--;
		}

	}

	@Override
	public void alea() {
		final int max = pb.get_nb_sacs();
		final Random r = new Random();

		for (int i = 0; i < certif.length; i++) {
			certif[i] = r.nextInt(max);
		}
	}

	/**
	 * Indique à l'utilisateur dans quel sac mettre chaque objet.
	 */
	@Override
	public void affiche() {
		for (int i = 0; i < certif.length; i++) {
			System.out.println("Mettre l'objet " + i + " dans le sac "
					+ certif[i]);
		}
	}

	// ============================= Facultatif ===============================
	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saisie() {
		// TODO Auto-generated method stub

	}
}
