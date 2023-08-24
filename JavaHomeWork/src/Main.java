public class Main {
    public static void main(String[] args) {
        PlayGame pg = new PlayGame(new RandomNum(),new StringToIntArray(),new CheckResult());
        pg.playGame(3,3);

    }
}
