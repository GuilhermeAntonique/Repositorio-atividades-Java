public class Neto extends Filho {
    public int idade_neto;
    public Neto(int idad_pai_n, int idad_filho_n, int idad_neto){
        super(idad_pai_n, idad_filho_n);
        idade_neto = idad_neto;
        System.out.println("Eu sou a classe Neto, e a minha idade é " + idade_neto + ". A idade do Pai é " + idad_pai_n + ", e a idade do Filho é " + idad_filho_n + ".");
    }
}
