package RPC_Server;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int add(int a, int b){
        return a + b;
    }
}
