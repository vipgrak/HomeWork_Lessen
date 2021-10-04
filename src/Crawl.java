public class Crawl extends Obstacle {
    private int distance;

    public Crawl(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.crawl(distance);
    }
}

