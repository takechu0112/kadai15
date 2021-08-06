public class Main {

	public static void main(String[] args) {
		Dengen d;

		d = new AcAdapter();
		int denatsu = d.kyuuden();
		System.out.println( denatsu + "V で給電されています" );
	}
}

abstract class Dengen { // Targetクラス
	public abstract int kyuuden(); // request()メソッド
}

class JapaneseConsent{
	public int power() {
		return 100;
	}
}

class AcAdapter extends Dengen{
	private JapaneseConsent consent = new JapaneseConsent();

	@Override
	public int kyuuden() {
		return(int)(consent.power() * 0.16);
	}
}
