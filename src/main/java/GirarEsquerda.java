public class GirarEsquerda implements InterpretadorExpressao {

	@Override
	public String interpretar(Robo robo) {
		robo.girarEsquerda();
		return robo.getDirecao();
	}
}