public class Filho extends Pai {
    public int idade_filho;
    public Filho(int idad_pai_f,int idad_filho){
        super(idad_pai_f);
        idade_filho = idad_filho;
        System.out.println("Eu sou a classe Filho, e a minha idade é " + idade_filho + ". A idade do Pai é " + idad_pai_f + ".");
    }
}
