public class Turista extends Thread{
    String cognome;
    Museo museo;

    Turista(String cognome,Museo m){
        super(cognome);
        this.cognome = cognome;
        museo = m;
    }

    @Override
    public void run(){
        long tempo = (int) (Math.random() * 5000) + 1; // tempo di attesa casuale
        
        try {
            System.out.println(cognome+" entra in coda e attende il suo turno per visitare il museo");
            museo.entra();
            Thread.sleep(tempo);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        museo.esci();
    }
}