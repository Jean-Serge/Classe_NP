import java.util.Random;

/**
 * La notion de certificat pour le problème Bin_Pack
 */
public class CertificatBinPack implements Certificat {

	private PblBinPack pb; // le problème associé au certificat
	private int certif[];

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
		int sac[] = new int[certif.length];
		int cap = pb.get_cap();
		int poids[] = pb.getPoids();

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

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void alea() {
		int max = pb.get_nb_sacs();
		Random r = new Random();

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
