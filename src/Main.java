public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {new Mouse("Джерри"), new Cat("Васька"), new Dog("Рекс"), new Bird("Чижик")};
        Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1), new Crawl(100)};

        Team team = new Team("Сборная СССР", competitors);


        System.out.println("Учасники команды " + team.teamName +":");
        team.showResults();

        Course course = new Course(obstacles);

        System.out.println("Преодоления полосы препятствий:");
        course.doIt(team);

        System.out.println("Результат:");
        team.showResults();

        System.out.println("Успешно прошедшие:");
        team.showMembersFinishedCourse();
    }
}