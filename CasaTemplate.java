public abstract class CasaTemplate{

    public final void construirCasa(){
        construirBase();
        construirTelhados();
        construirParedes();
        construirJanelas();
        System.out.println("A casa esta construida");
    }

    private void construirJanelas() {
        System.out.println("Constrindo janelas");
    }

    public abstract void construirParedes();

    public abstract void construirTelhados();

    private void construirBase(){

        System.out.println("Construindo fundação da casa ");
    };
}