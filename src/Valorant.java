public class Valorant extends VideoGames{
    private String rank;

    public Valorant(int n, int p, String r) {
        super(n,p);
        rank = r;
    }

    public void rankUp() {
        System.out.println("You've been promoted to bronze 1!");
    }
}
