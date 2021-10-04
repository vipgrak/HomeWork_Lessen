public abstract class Animal implements Competitor{
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    int maxCrawlDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance, int maxCrawlDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.maxCrawlDistance = maxCrawlDistance;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(name + " " + " успешно справился с кросс");
        } else {
            System.out.println(name + " " + " не смог преодолеть кросс");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(name + " " + " успешно справился с препятствием");
        } else {
            System.out.println(name + " " + " не смог преодолеть препятствие");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (distance <=maxSwimDistance){
            System.out.println(name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }
    public void crawl(int distance){
        if (distance <=maxCrawlDistance){
            System.out.println(name + " " + " успешно прополз дистанцию");
        } else {
            System.out.println(name + " " + " не смог проползти дистанцию");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }

}
