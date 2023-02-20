package simulacion_banco;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(01);
		Cuenta cuenta2 = new Cuenta(01);
		
		cuenta1.depositar(500);
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta2.getSaldo());
		
		boolean puedeTransferir = cuenta1.transferir(cuenta2, 300);
		if(puedeTransferir){
			System.out.println("Transferencia exitosa");
		}else{
			System.out.println("No puede transferir");
		}
		
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta2.getSaldo());

	}

}
