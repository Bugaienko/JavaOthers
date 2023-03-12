package lambda;

public class ExecutableImplementation implements Executable {
    @Override
    public int execute(int x, int y) {
        System.out.println("Hello");
        return 0;
    }
}
