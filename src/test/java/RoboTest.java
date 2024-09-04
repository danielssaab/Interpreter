import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoboTest {

	@Test
	void deveMoverFrente() {
		Robo robo = new Robo();
		InterpretadorExpressao interpretador = new Movimento(5);
		interpretador.interpretar(robo);
		assertEquals("Posição: (0, 5) Direção: Norte", robo.getPosicao());
	}

	@Test
	void deveGirarEsquerda() {
		Robo robo = new Robo();
		InterpretadorExpressao interpretador = new GirarEsquerda();
		interpretador.interpretar(robo);
		assertEquals("Posição: (0, 0) Direção: Oeste", robo.getPosicao());
	}

	@Test
	void deveGirarDireita() {
		Robo robo = new Robo();
		InterpretadorExpressao interpretador = new GirarDireita();
		interpretador.interpretar(robo);
		assertEquals("Posição: (0, 0) Direção: Leste", robo.getPosicao());
	}

	@Test
	void deveExecutarComandosCombinados() {
		Robo robo = new Robo();
		String comandos = "andar 10 direita andar 5 esquerda andar 2 posicao";
		InterpretadorComandosRobo interpretador = new InterpretadorComandosRobo(comandos);
		interpretador.interpretar(robo);
		assertEquals("Posição: (5, 12) Direção: Norte", robo.getPosicao());
	}
}
