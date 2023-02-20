package simulacion_banco;

public class TestReferencias2 {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(02);
		cuenta1.getTitular().setDni("43627825");
		cuenta1.depositar(3000);
	}

}
