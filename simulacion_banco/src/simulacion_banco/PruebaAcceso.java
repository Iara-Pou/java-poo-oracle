package simulacion_banco;

public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuentaPrueba = new Cuenta(22);
		Cuenta cuentaPrueba1 = new Cuenta(22);
		Cuenta cuentaPrueba2= new Cuenta(22);
		Cuenta cuentaPrueba3= new Cuenta(22);
		
		cuentaPrueba.depositar(400);
//		cuentaPrueba.setAgencia(01);		
		System.out.println(cuentaPrueba.getSaldo());
		System.out.println(cuentaPrueba.getAgencia());
		
		cuentaPrueba.getTitular().setDni("29292002");
		System.out.println(cuentaPrueba.getTitular().getDni());
		System.out.println(Cuenta.getTotalCuentas());
	}
}
