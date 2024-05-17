public class Violao extends Instrumentos{

    public Violao(String tom, int tamanho, int nCordas, String tipoCordas){
        super(tom, tamanho, tipoCordas);
    }
    
    @Override

    public void tocarAcordes(){

        System.out.println("Tocando violao!!");
    }
    
}