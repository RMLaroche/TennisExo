
public class TennisGame3 implements TennisGame {

	private Player player1;
	private Player player2;

	public TennisGame3(String namePlayer1, String namePlayer2) {
		this.player1 = new Player(namePlayer1, 0);
		this.player2 = new Player(namePlayer2, 0);
		System.out.println("new " + this.getClass().toString() + " with " + this.player1.name + " and " + this.player2.name);
	}

	public String getScore() {
		String s;
		if (player1.score < 4 && player2.score < 4 && !(player1.score + player2.score == 6)) {
			String[] p = new String[] { "Love", "Fifteen", "Thirty", "Forty" };
			s = p[player1.score];
			String score = (player1.score == player2.score) ? s + "-All" : s + "-" + p[player2.score];
			System.out.println("score : " + score);
			return score;
		} else {
			if (player1.score == player2.score)
				return "Deuce";
			s = player1.score > player2.score ? player1.name : player2.name;
			String score = ((player1.score - player2.score) * (player1.score - player2.score) == 1) ? "Advantage " + s : "Win for " + s;
			System.out.println("score : " + score);
			return score;
		}
	}

	public void wonPoint(String playerName) {
		if (playerName == "player1") {
			this.player1.score += 1;
			System.out.println(this.player1.name + "gagne 1 point et à un score de " + this.player1.score);
		} else {
			this.player2.score += 1;
			System.out.println(this.player2.name + "gagne 1 point et à un score de " + this.player2.score);
		}
	}

}
