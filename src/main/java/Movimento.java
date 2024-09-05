public class Movimento implements InterpretadorExpressao {

	private int passos;

	public Movimento(int passos) {
		this.passos = passos;
	}

	@Override
	public String interpretar(Robo robo) {
		robo.moverFrente(passos);
		return null;
	}
}