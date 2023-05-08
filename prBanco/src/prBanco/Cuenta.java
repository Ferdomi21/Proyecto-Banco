package prBanco;

public class Cuenta {

	private int iban;
	private double saldo;
	private String estado;

	public Cuenta(int iban, double saldo, String estado) {
		this.iban = iban;
		this.saldo = saldo;
		this.estado = estado;
	}

	public int getIban() {
		return iban;
	}

	public void setIban(int iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cuenta con iban=" + iban + ", saldo=" + saldo + ", estado=" + estado;
	}

}
