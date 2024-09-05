public class Posicao implements InterpretadorExpressao {

	@Override
	public String interpretar(Robo robo) {
		return ("Posição Atual: " + robo.getPosicao());
	}
}