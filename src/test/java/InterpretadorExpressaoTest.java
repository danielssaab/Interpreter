

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterpretadorExpressaoTest {

	@Test
	void deveExecutarMovimentoParaFrente() {
		Robo robo = new Robo();
		InterpretadorExpressao interpretador = new InterpretadorComandosRobo("andar 10");
		interpretador.interpretar(robo);
		assertEquals("Posição: (0, 10) Direção: Norte", robo.getPosicao());
	}

	@Test
	void deveExecutarGiroEsquerda() {
		Robo robo = new Robo();
		InterpretadorExpressao interpretador = new InterpretadorComandosRobo("esquerda");
		interpretador.interpretar(robo);
		assertEquals("Posição: (0, 0) Direção: Oeste", robo.getPosicao());
	}

	@Test
	void deveExecutarGiroDireita() {
		Robo robo = new Robo();
		InterpretadorExpressao interpretador = new InterpretadorComandosRobo("direita");
		interpretador.interpretar(robo);
		assertEquals("Posição: (0, 0) Direção: Leste", robo.getPosicao());
	}

	@Test
	void deveExecutarComandosCombinados() {
		Robo robo = new Robo();
		InterpretadorExpressao interpretador = new InterpretadorComandosRobo("andar 5 direita andar 3 esquerda andar 2");
		interpretador.interpretar(robo);
		assertEquals("Posição: (3, 7) Direção: Norte", robo.getPosicao());
	}

	@Test
	void deveRetornarExcecaoParaComandoInvalido() {
		try {
			InterpretadorExpressao interpretador = new InterpretadorComandosRobo("andar 10 voar");
			Robo robo = new Robo();
			interpretador.interpretar(robo);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Comando inválido", e.getMessage());
		}
	}

	@Test
	void deveRetornarExcecaoParaComandoIncompleto() {
		try {
			InterpretadorExpressao interpretador = new InterpretadorComandosRobo("andar");
			Robo robo = new Robo();
			interpretador.interpretar(robo);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Comando inválido", e.getMessage());
		}
	}
}
