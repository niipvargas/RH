package rhescola;

import Modelo.Pessoa;
import java.util.ArrayList;
import rhescola.Visualização.Telainicial;

public class RH {
    
    public static ArrayList<Pessoa> ListaPessoas = new ArrayList<>();

    public static void main(String[] args) {
        
        Telainicial t = new Telainicial();
        t.setVisible(true);
     
    }
    
}
