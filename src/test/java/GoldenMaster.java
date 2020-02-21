import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class GoldenMaster extends TennisTest {

	public GoldenMaster(int player1Score, int player2Score, String expectedScore) {
		super(player1Score, player2Score, expectedScore);
		// TODO Auto-generated constructor stub
	}

	@Override
	@Test
	public void checkAllScoresTennisGame1() throws IOException {
		File file = new File("GoldenMaster\\" + new Throwable().getStackTrace()[0].getMethodName() + "_"
				+ this.player1Score + "_" + this.player2Score + "_" + this.expectedScore + "_approved.txt");
		FileOutputStream os = new FileOutputStream(file, false);
		PrintStream fileOut = new PrintStream(os);
		System.setOut(fileOut);
		TennisGame1 game = new TennisGame1("player1", "player2");
		checkAllScores(game);
		System.out.println(game.getScore());
		assertEquals(game.getScore(), this.expectedScore);
	}
	@Override
	@Test
	public void checkAllScoresTennisGame2() throws FileNotFoundException {
		File file = new File("GoldenMaster\\" + new Throwable().getStackTrace()[0].getMethodName() + "_"
				+ this.player1Score + "_" + this.player2Score + "_" + this.expectedScore + "_approved.txt");
		FileOutputStream os = new FileOutputStream(file, false);
		PrintStream fileOut = new PrintStream(os);
		System.setOut(fileOut);
		TennisGame2 game = new TennisGame2("player1", "player2");
		checkAllScores(game);
		assertEquals(game.getScore(), this.expectedScore);
	}
	@Override
	@Test
	public void checkAllScoresTennisGame3() throws FileNotFoundException {
		File file = new File("GoldenMaster\\" + new Throwable().getStackTrace()[0].getMethodName() + "_"
				+ this.player1Score + "_" + this.player2Score + "_" + this.expectedScore + "_approved.txt");
		FileOutputStream os = new FileOutputStream(file, false);
		PrintStream fileOut = new PrintStream(os);
		System.setOut(fileOut);
		TennisGame3 game = new TennisGame3("player1", "player2");
		checkAllScores(game);
		assertEquals(game.getScore(), this.expectedScore);
	}

}
