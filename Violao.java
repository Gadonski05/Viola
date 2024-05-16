public class Violao extends Instrumentos{

    private int nCordas;

    public Violao(String tom, int tamanho, int nCordas, String tipoCordas){
        super(tom, tamanho, tipoCordas);

        this.nCordas = nCordas;
    }
    
    @Override

    public void Tocar(){

        System.out.println("Tocando violao!!");
    }
    
}