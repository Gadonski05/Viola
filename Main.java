public class Main {
 
    public static void main(String[] args) {
        
        violao v = new Violao("Suave", 0, 0, "Cobre");
        Flauta f = new Flauta("Agudo", 0);
        Guitarra g = new Guitarra(0, 0, null, 0, "Cobre");

    }

    v.tocarAcordes();
    

    f.tocarMelodia();

    g.tocarSolo();
}
