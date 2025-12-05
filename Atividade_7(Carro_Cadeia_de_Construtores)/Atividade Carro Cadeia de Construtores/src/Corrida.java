import java.util.HashMap;
import java.util.Map;

public class Corrida {
    int tamanho_da_pista = 1000;
    private Map<Carro, Double> Carros_da_Corrida = new HashMap<>();

    public void addCarro(Carro c){
            Carros_da_Corrida.put(c, 0.0);
    }

    public void iniciar_corrida(){
        
    }
}
