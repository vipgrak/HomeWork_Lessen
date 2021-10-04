public interface Competitor {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    void crawl(int distance);
    boolean isOnDistance();
    void showResult();
}
