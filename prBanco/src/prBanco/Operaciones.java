package prBanco;

public abstract class Operaciones {

	public static void prestamo(Cuenta cuenta, double cantidad) {
		cuenta.setSaldo(cuenta.getSaldo() + cantidad);
	}
	
	public static void transferencia(Cuenta c1, Cuenta c2, double cantidad) {
		c1.setSaldo(c1.getSaldo() - cantidad);
		c2.setSaldo(c2.getSaldo() + cantidad);
	}
	
	public static void bloquear(Cuenta cuenta) {
		cuenta.setEstado("Bloqueada");
	}
	
	public static void desbloquear(Cuenta cuenta) {
		cuenta.setEstado("Activa");
	}
}
