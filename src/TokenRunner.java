public class TokenRunner {
    public static void main(String[] args)
    {

        TokenPass game1 = new TokenPass();
        //Repeats until one player has 0 tokens
        while(game1.gameOver()<0)
        {
            game1. printBoard();
            game1.distributeCurrentPlayerTokens();
            game1.nextPlayer();
        }
        game1.printboard();
        System.out.println("Game Winner: Player " + game1.gameOver());
    }
}
