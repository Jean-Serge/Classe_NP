package probleme;


public class PblSum extends PblDec {

	private final int nb_entiers;
	private final int c;

	public PblSum(int nb_entiers, int c) {
		super();
		this.nb_entiers = nb_entiers;
		this.c = c;
	}

	// associe à l’instance de PblPartition une instance équivalente de
	// PblBinPAck
	// doit être de complexité polynomiale
	public PblBinPack redPolyTo() {
		int[] tab = new int[nb_entiers];
		for (int i = 0; i < nb_entiers; i++)
			tab[i] = i + 1;

		return new PblBinPack(nb_entiers, tab, c, 2);
	}

	public boolean aUneSolution() {
		return redPolyTo().aUneSolution();
	}
}
