public interface Certificat {

	/**
	 * Retourne True SSi le certificat est valide pour le problème. Doit être de
	 * complexité polynomiale par rapport à la taille du certificat et du
	 * problème
	 *
	 * @return true ssi le certicat est valide pour le problème.
	 */
	public boolean correct(); // algo de vérification A de la définition NP du
	// cours!

	public boolean estDernier();

	/**
	 * Modifie aléatoirement la valeur du certificat. Chaque valeur doit pouvoir
	 * être générée par au moins une exécution.
	 */
	public void alea();

	/**
	 * affiche un certificat
	 */
	public void affiche();

	/* FACULTATIFS */
	/**
	 * Réinitialise le certificat au plus petit pour l’ordre.
	 */
	public void reset();

	/**
	 * Permet la saisie d’un certificat
	 */
	public void saisie();

	/**
	 * Retourne le cerficat.
	 * 
	 * @return
	 */
	public int[] getCertificat();

	/**
	 * Génére le prochain certificat. Ne pas appeler cette méthode avant appeler
	 * au moins une fois la méthode getCertificat().
	 */
	public void next();
}