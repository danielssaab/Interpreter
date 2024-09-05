public class GirarDireita implements InterpretadorExpressao {

	@Override
	public String interpretar(Robo robo) {
		robo.girarDireita();
		return robo.getDirecao();
	}
}