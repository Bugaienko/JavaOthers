package lambda;

public class Runner {
    public void run(Executable e) {
        int a = e.execute(5, 7);
        System.out.println(a);
    }
}
