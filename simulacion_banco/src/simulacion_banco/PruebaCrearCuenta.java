package simulacion_banco;

public class PruebaCrearCuenta {
	public static void main(String[] args) {
		Cuenta primerCuenta = new Cuenta(01);
		Cuenta segundaCuenta = new Cuenta(01);
		Cliente diego = new Cliente();

		primerCuenta.depositar(300);
		System.out.println(primerCuenta.getSaldo());
		segundaCuenta.depositar(50);
		System.out.println(segundaCuenta.getSaldo());

		primerCuenta.getTitular().setNombre("Diego");
		primerCuenta.getTitular().setDni("454733993");
		//cuando ingreso en el atributo titular, ingreso en otro objeto
		System.out.println(primerCuenta.getTitular().getDni()); 
	}
}
