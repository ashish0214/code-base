package Pattern.Strategy;

public class upperCasePrinting implements printingStrategy{
    @Override
    public String print(String input){
        return input.toUpperCase();
    }
}
