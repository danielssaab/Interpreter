public class Robo {

	private int x;
	private int y;
	private String direcao;

	public Robo() {
		this.x = 0;
		this.y = 0;
		this.direcao = "Norte"; // Robô começa virado para o Norte
	}

	public void moverFrente(int passos) {
		switch (direcao) {
			case "Norte":
				y += passos;
				break;
			case "Sul":
				y -= passos;
				break;
			case "Leste":
				x += passos;
				break;
			case "Oeste":
				x -= passos;
				break;
		}
	}

	public void girarEsquerda() {
		switch (direcao) {
			case "Norte":
				direcao = "Oeste";
				break;
			case "Sul":
				direcao = "Leste";
				break;
			case "Leste":
				direcao = "Norte";
				break;
			case "Oeste":
				direcao = "Sul";
				break;
		}
	}

	public void girarDireita() {
		switch (direcao) {
			case "Norte":
				direcao = "Leste";
				break;
			case "Sul":
				direcao = "Oeste";
				break;
			case "Leste":
				direcao = "Sul";
				break;
			case "Oeste":
				direcao = "Norte";
				break;
		}
	}

	public String getPosicao() {
		return "Posição: (" + x + ", " + y + ") Direção: " + direcao;
	}

	public String getDirecao() {
		return direcao;
	}
}