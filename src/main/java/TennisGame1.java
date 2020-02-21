public class TennisGame1 implements TennisGame {
    
    private Player player1;
    private Player player2;

    public TennisGame1(String name1, String name2) {
        this.player1 = new Player(name1, 0);
        this.player2 = new Player(name2, 0);
        System.out.println("new "+ this.getClass().toString() + " with " + this.player1.name + " and " + this.player2.name);
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            player1.score += 1;
            System.out.println(this.player1.name + "gagne 1 point et à un score de " + this.player1.score);
        }
        else {
            player2.score += 1;
            System.out.println(this.player2.name + "gagne 1 point et à un score de " + this.player2.score);
        }
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (player1.score==player2.score)
        {
            switch (player1.score)
            {
                case 0:
                        score = "Love-All";
                    break;
                case 1:
                        score = "Fifteen-All";
                    break;
                case 2:
                        score = "Thirty-All";
                    break;
                default:
                        score = "Deuce";
                    break;
                
            }
        }
        else if (player1.score>=4 || player2.score>=4)
        {
            int minusResult = player1.score-player2.score;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1.score;
                else { score+="-"; tempScore = player2.score;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        System.out.println("score : " + score);
        return score;
    }
}