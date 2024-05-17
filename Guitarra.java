public class Guitarra extends Instrumentos{

    public Guitarra(int nCaptadores, int nCordas, String tom, int tamanho, String tipoCordas) {
        super(tom, tamanho, tipoCordas);
        
    }

    public void tocarSolo(){

        System.out.println("Tocando solo!!");
    }
    
    public void afinandoCordas(){

        System.out.println("Afinando todas as cordas da guitarra!!");
    }
}
