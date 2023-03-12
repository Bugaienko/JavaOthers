package lambda;

public class MainLambda {
    public static void main(String[] args) {
        Runner runner = new Runner();

//        runner.run(new ExecutableImplementation());

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Exec Hello");
                System.out.println("Goodbye");
                return x - y + 1;
            }
        });

        runner.run((x, y) -> {
            System.out.println("Anonymous Hello");
            System.out.println("Goodbye");
            return x + y;
        });

        //просто возвращает 10
        runner.run((x, y) -> x + y);

    }
}
