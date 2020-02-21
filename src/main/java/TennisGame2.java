public class TennisGame2 implements TennisGame
{
    public Player player1;
    public Player player2;
    
    public String P1res = "";
    public String P2res = "";

    public TennisGame2(String name1, String name2) {
        this.player1 = new Player(name1, 0);
        this.player2 = new Player(name2, 0);
        System.out.println("new "+ this.getClass().toString() + " with " + this.player1.name + " and " + this.player2.name);
    }

    public String getScore(){
        String score = "";
        if (player1.score == player2.score && player1.score < 4)
        {
            if (player1.score==0)
                score = "Love";
            if (player1.score==1)
                score = "Fifteen";
            if (player1.score==2)
                score = "Thirty";
            score += "-All";
        }
        if (player1.score==player2.score && player1.score>=3)
            score = "Deuce";
        
        if (player1.score > 0 && player2.score==0)
        {
            if (player1.score==1)
                P1res = "Fifteen";
            if (player1.score==2)
                P1res = "Thirty";
            if (player1.score==3)
                P1res = "Forty";
            
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (player2.score > 0 && player1.score==0)
        {
            if (player2.score==1)
                P2res = "Fifteen";
            if (player2.score==2)
                P2res = "Thirty";
            if (player2.score==3)
                P2res = "Forty";
            
            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        
        if (player1.score>player2.score && player1.score < 4)
        {
            if (player1.score==2)
                P1res="Thirty";
            if (player1.score==3)
                P1res="Forty";
            if (player2.score==1)
                P2res="Fifteen";
            if (player2.score==2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        if (player2.score>player1.score && player2.score < 4)
        {
            if (player2.score==2)
                P2res="Thirty";
            if (player2.score==3)
                P2res="Forty";
            if (player1.score==1)
                P1res="Fifteen";
            if (player1.score==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }
        
        if (player1.score > player2.score && player2.score >= 3)
        {
            score = "Advantage player1";
        }
        
        if (player2.score > player1.score && player1.score >= 3)
        {
            score = "Advantage player2";
        }
        
        if (player1.score>=4 && player2.score>=0 && (player1.score-player2.score)>=2)
        {
            score = "Win for player1";
        }
        if (player2.score>=4 && player1.score>=0 && (player2.score-player1.score)>=2)
        {
            score = "Win for player2";
        }
        System.out.println("score : " + score);
        return score;
    }
    
    public void SetP1Score(int number){
        System.out.println("augmentation du score de P1 de "+number);
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
    	System.out.println("augmentation du score de P2 de "+number);
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        player1.score++;
    }
    
    public void P2Score(){
        player2.score++;
    }

    public void wonPoint(String player) {
        if (player == "player1") {
        	System.out.println(this.player1.name + "gagne 1 point et à un score de " + this.player1.score);
            P1Score();
        }
        else {
            P2Score();
        	System.out.println(this.player2.name + "gagne 1 point et à un score de " + this.player2.score);
        }
    }
}