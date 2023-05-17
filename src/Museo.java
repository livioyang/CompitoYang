public class Museo {
    int T_in= 0; //n turisti nel museo max 5
    
    public synchronized void entra(){
        String name = Thread.currentThread().getName();

        try {
            while(T_in>=5){
                wait();
            }
            System.out.println(name+" entra nel museo per visitare la Gioconda------");
            T_in++;
            System.out.println("---ora ci sono "+T_in+" turisti nel museo---");

            

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public synchronized void esci(){
        String name = Thread.currentThread().getName();
        System.out.println(name+" esce dal museo------");
        T_in--;
        System.out.println("---ora ci sono "+T_in+" turisti nel museo---");
        notifyAll();
    }
}
