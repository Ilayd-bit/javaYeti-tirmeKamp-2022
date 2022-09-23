package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// Yazılımda en önemli olgu değişimdir.
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager()); //istersek tarım istersek öğretmen manager gönderilebilir.Nedeni base kredi manager ikisininde annesi

	}

}
