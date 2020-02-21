
public class TennisGame3 implements TennisGame {

	private int p2;
	private int p1;
	private String p1N;
	private String p2N;

	public TennisGame3(String p1N, String p2N) {
		this.p1N = p1N;
		this.p2N = p2N;
		System.out.println("new " + this.getClass().toString() + " with " + this.p1N + " and " + this.p2N);
	}

	public String getScore() {
		String s;
		if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
			String[] p = new String[] { "Love", "Fifteen", "Thirty", "Forty" };
			s = p[p1];
			String score = (p1 == p2) ? s + "-All" : s + "-" + p[p2];
			System.out.println("score : " + score);
			return score;
		} else {
			if (p1 == p2)
				return "Deuce";
			s = p1 > p2 ? p1N : p2N;
			String score = ((p1 - p2) * (p1 - p2) == 1) ? "Advantage " + s : "Win for " + s;
			System.out.println("score : " + score);
			return score;
		}
	}

	public void wonPoint(String playerName) {
		if (playerName == "player1") {
			this.p1 += 1;
			System.out.println(this.p1N + "gagne 1 point et à un score de " + this.p1);
		} else {
			this.p2 += 1;
			System.out.println(this.p2N + "gagne 1 point et à un score de " + this.p2);
		}
	}

}
