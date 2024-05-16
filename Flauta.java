public class Flauta extends Instrumentos{

    private int nCordas;
    private int tamanho;
    private String tom;

    public void Violao(String tom, int tamanho){
        super(tom, tamanho);

        this.tom = tom;
        this.tamanho = tamanho;
    }
    
    @Override

    public void Tocar(){

        System.out.println("Tocando violao!!");
    }
    
}
