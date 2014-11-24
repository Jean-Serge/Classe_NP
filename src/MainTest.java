import probleme.Certificat;
import probleme.CertificatBinPack;
import probleme.PblBinPack;

public class MainTest {

	public static void main(String[] args) {
		final int[] poid = { 0, 1, 2, 3 };
		final PblBinPack pb = new PblBinPack(4, poid, 3, 3);
		final Certificat certif = new CertificatBinPack(pb);

		System.out.println(certif.estDernier());
		while (!certif.estDernier()) {
			certif.affiche();
			System.out.println("\n");
			certif.next();
		}
	}

}
