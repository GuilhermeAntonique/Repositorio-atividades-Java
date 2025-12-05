public class Carro_Mult extends Carro_Soma {
    public double potencia;
    public int velocidade = 0;
    public String nome;
    public int velocidade_maxima;

    public Carro_Mult(String nom, int velmax, double pot){
        super(nom, velmax, pot);
        nome = nom;
        velocidade_maxima = velmax;
        potencia = pot;

        if(potencia < 1.1){
            potencia = 1.1;
        }

        if(potencia > 2){
            potencia = 2.0;
        }
    }

    public void acelerar(){
        velocidade += velocidade*potencia;

        if(velocidade >= velocidade_maxima){
            velocidade = velocidade_maxima;
        }
    }

    public void frear(){
        velocidade = velocidade/2;
    }
}
