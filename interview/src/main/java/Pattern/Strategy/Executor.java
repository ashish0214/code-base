package Pattern.Strategy;

public class Executor {
    public printingStrategy strategy;
    public Executor(printingStrategy strategy){
        this.strategy = strategy;
    }

    public String execute(String input){
        return strategy.print(input);
    }
}
