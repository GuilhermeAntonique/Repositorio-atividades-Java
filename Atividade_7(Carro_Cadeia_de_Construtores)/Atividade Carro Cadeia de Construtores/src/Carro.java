public class Carro {
    public double potencia;
    public int velocidade = 0;
    public String nome;
    public int velocidade_maxima;

    public Carro(String nom, int velmax, double pot){
        nome = nom;
        velocidade_maxima = velmax;
        potencia = pot;
    }

    public void acelerar(){
        velocidade += potencia;

        if(velocidade >= velocidade_maxima){
            velocidade = velocidade_maxima;
        }
    }

    public void frear(){
        velocidade = velocidade/2;
    }
}
