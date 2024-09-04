public class Movimento implements InterpretadorExpressao {

	private int passos;

	public Movimento(int passos) {
		this.passos = passos;
	}

	@Override
	public void interpretar(Robo robo) {
		robo.moverFrente(passos);
	}
}