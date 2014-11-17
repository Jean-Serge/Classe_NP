/**
 * La classe des problèmes BinPack
 */
public class PblBinPack extends PblDec {
	
	private int nb_objets; // nb d’objets
	private int poids[]; // poids des objets
	private int cap; // capacité du sac
	private int nb_sacs; // nb de sacs

	// =========================== Constructeurs ============================

	public PblBinPack(int n, int p[], int c, int nbs) {
		// juste le constructeur A ECRIRE
		this.nb_objets = n;
		this.poids = p;
		this.cap = c;
		this.nb_sacs = nbs;
	}

	// ============================ Accesseurs ==============================
	
	public int get_nb_objets(){
		return this.nb_objets;
	}
	
	public int get_cap(){
		return this.cap;
	}
	
	public int[] getPoids(){
		return this.poids;
	}
	
	public int get_nb_sacs(){
		return this.nb_sacs;
	}
	
	
	// ============================ Fonctions ===============================
	
	/**
	 * Retourne Vrai ssi il existe une mise en sachets possible, 
	 * i.e. si l’instance du pb est positive.
	 * @return true ssi il existe une mise en sachet possible
	 */
	public boolean aUneSolution() {
		// fonctionnera par recherche exhaustive
		// A ECRIRE
		
		return false;
	}

	/**
	 *  Teste au hasard une mise en sachets et retourne Vrai si elle est valide
	 *  chaque mise en sachets doit pouvoir être générée par une exécution.
	 *  @return true si la mise en sachet générée est valide
	 */
	public boolean aUneSolutionNonDéterministe() {
		Certificat certif = new CertificatBinPack(this);
		certif.alea();
		certif.affiche();
		return certif.correct();
	}
}
