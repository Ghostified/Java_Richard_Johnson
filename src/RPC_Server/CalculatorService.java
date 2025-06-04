package RPC_Server;

import java.io.Serializable;

public interface CalculatorService extends Serializable {
    int add(int a, int b);
}
