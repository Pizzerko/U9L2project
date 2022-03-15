public class VideoGames {
    private int playerCount;
    private int price;

    public VideoGames(int n, int p) {
        playerCount = n;
        price = p;
    }

    public int getPrice() {
        return price;
    }
    public int getPlayerCount() {
        return playerCount;
    }

    public void recent(boolean tf) {
        if(tf) System.out.println("This game is very new!");
        else {
            System.out.println("This game came out a while ago");
        }
    }
    public void ratings(double r) {
        System.out.println("This games rating is: " + r);
    }
}
