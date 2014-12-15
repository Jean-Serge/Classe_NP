package probleme;

//la classe des instances de Partition
public class PblPartition extends PblDec {

	private final int nb_entiers;
	private final int[] poids;

	public PblPartition(int entiers, int[] poids) {
		this.nb_entiers = entiers;
		this.poids = poids;
	}

	// associe à l’instance de PblPartition une instance équivalente de
	// PblBinPAck
	// doit être de complexité polynomiale
	public PblBinPack redPolyTo() {
		int size = 0;

		for (int i = 0; i < nb_entiers; i++) {
			size += poids[i];
		}

		return new PblBinPack(nb_entiers, poids, size / 2, 2);
	}

	@Override
	public boolean aUneSolution() {
		return redPolyTo().aUneSolution();
	}

	@Override
	public String toString() {
		String retour = "";

		retour += "Il y a " + this.nb_entiers + " entiers.\n";
		for (int i = 0; i < poids.length; i++)
			retour += "L'objet n°" + i + " pèse " + poids[i] + "\n";

		return retour;
	}
}