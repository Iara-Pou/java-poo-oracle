package simulacion_banco;

public class Cuenta {
	private static int totalCuentas = 0;
	private double saldo;
	private int agencia;
	private int numero;
	// referencio a un Cliente nuevo desde la misma cuenta
	private Cliente titular = new Cliente();

	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No puede tener un valor negativo, asignaremos la agencia central");
			this.agencia = agencia;
		} else {
			this.agencia = agencia;
		}
		totalCuentas++;
		System.out.println("Cuentas creadas: " + totalCuentas);
	}

	public void depositar(double saldoNuevo) {
		this.saldo += saldoNuevo;
	}

	public boolean retirar(double saldoARetirar) {
		boolean haySaldoSuficiente = this.saldo >= saldoARetirar;

		if (haySaldoSuficiente) {
			this.saldo -= saldoARetirar;
		}
		return haySaldoSuficiente;
	}

	public boolean transferir(Cuenta cuentaTransferencia, double saldoTransferencia) {
		boolean haySaldoSuficiente = this.saldo >= saldoTransferencia;
		if (haySaldoSuficiente) {
			this.retirar(saldoTransferencia);
			cuentaTransferencia.depositar(saldoTransferencia);
		}
		return haySaldoSuficiente;
	}
	
	public static int getTotalCuentas() {
	return totalCuentas;	
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public double getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
}
