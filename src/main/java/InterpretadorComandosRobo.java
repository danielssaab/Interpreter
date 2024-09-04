import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorComandosRobo implements InterpretadorExpressao {

	private Stack<InterpretadorExpressao> pilhaInterpretadores;

	public InterpretadorComandosRobo(String contexto) {
		pilhaInterpretadores = new Stack<>();
		List<String> elementos = Arrays.asList(contexto.split(" "));
		Iterator<String> iterator = elementos.iterator();

		while (iterator.hasNext()) {
			String elemento = iterator.next();
			if (elemento.equalsIgnoreCase("andar")) {
				if (!iterator.hasNext()) {
					throw new IllegalArgumentException("Comando inválido");
				}
				int passos = Integer.parseInt(iterator.next());
				pilhaInterpretadores.push(new Movimento(passos));
			} else if (elemento.equalsIgnoreCase("esquerda")) {
				pilhaInterpretadores.push(new GirarEsquerda());
			} else if (elemento.equalsIgnoreCase("direita")) {
				pilhaInterpretadores.push(new GirarDireita());
			} else if (elemento.equalsIgnoreCase("posicao")) {
				pilhaInterpretadores.push(new Posicao());
			} else {
				throw new IllegalArgumentException("Comando inválido");
			}
		}
	}

	@Override
	public void interpretar(Robo robo) {
		while (!pilhaInterpretadores.isEmpty()) {
			InterpretadorExpressao interpretador = pilhaInterpretadores.remove(0); // Corrigido para processar todos os comandos
			interpretador.interpretar(robo);
		}
	}
}
