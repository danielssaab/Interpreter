public class Posicao implements InterpretadorExpressao {

	@Override
	public void interpretar(Robo robo) {
		System.out.println("Posição Atual: " + robo.getPosicao());
	}
}