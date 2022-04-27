public class Main{

	public static void main(String[] args) {
		
		Binario bin = new Binario();
		Octal oc = new Octal();
		Hexa hex = new Hexa();

		OperacionBinaria octaladaptado = new OctalAdapter(oc);
		OperacionBinaria hexaadaptado = new HexaAdapter(hex);

		System.out.println("Tu operacion se ha relizado ");

		oc.sumaOctal();
		oc.restaOctal();

		System.out.println("tu operacion se ha realizado");

		hex.sumaHexa();
		hex.restaHexa();


	}
}