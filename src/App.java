import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Museo m = new Museo();
        ArrayList<Turista> lista = new ArrayList<>();

        for (int i=0;i<50;i++){
            lista.add(new Turista("Turista "+i, m));
        }
        for (Turista t : lista) {
            t.start();
        }
        
    }
}
