package Pattern.Strategy;

public class lowerCasePrinting implements printingStrategy{
    @Override
    public String print(String input){
        return input.toLowerCase();
    }
}
