import probleme.Certificat;
import probleme.CertificatBinPack;
import probleme.PblBinPack;

public class MainTest {

	public static void main(String[] args) {
		final int[] poid = { 0, 1, 2, 3 };
		final PblBinPack pb = new PblBinPack(4, poid, 3, 3);
		final Certificat certif = new CertificatBinPack(pb);

		while (!certif.estDernier()) {
			certif.affiche();
			certif.next();
		}
		// System.out.println(certif.estDernier());
		// pb.aUneSolution();
	}

}
