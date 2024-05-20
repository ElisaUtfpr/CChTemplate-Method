public class Main {

    public static void main(String[] args) {
        CasaTemplate houseType = new CadaDeMadeira();

        System.out.println("Nova casa de madeira");
        houseType.construirCasa();

        System.out.println("       ");
        
        System.out.println("Nova casa de vidro");
        houseType = new CasaDeVidro();
        houseType.construirCasa();
    }
}