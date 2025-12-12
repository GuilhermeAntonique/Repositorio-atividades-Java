public class Candidato implements Comparable<Candidato> {
    private boolean deficiente;
    private int idade;
    private int nota;

    public Candidato(int nota, boolean deficiente, int idade){
        this.nota = nota;
        this.deficiente = deficiente;
        this.idade = idade;
    }

    public int getNota(){
        return nota;
    }

    public boolean isDeficiente(){
        return deficiente;
    }

    public int getIdade(){
        return idade;
    }

    public int compareTo(Candidato outro){

        if(nota == outro.getNota()){
            if(deficiente == outro.isDeficiente()){
                return outro.getIdade() - idade;
            }else{
                if(deficiente){
                    return 1;
                }else{
                    return -1;
                }
            }
        }else{
            return outro.getNota() - nota;
        }

    }

    //Método para imprimir na tela os objetos
    //Sobrescreve o método toString da clase pai Object
    //Object: classe pai padrão do Java, que descende qualquer outra classe criada
    @Override
    public String toString(){
        return nota + ";" + deficiente + ";" + idade;
    }

    //Método para imprimir na tela os objetos
    //Criado agora, usando um simples System.out.println(); para printar na tela
    public void imprimir(){
        System.out.println(nota + ";" + deficiente + ";" + idade);
    }

}
