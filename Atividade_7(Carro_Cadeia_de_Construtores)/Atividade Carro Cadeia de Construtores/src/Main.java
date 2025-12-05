public class Main {
    public static void main(String[] args) throws Exception {
        Carro_Soma cs1 = new Carro_Soma("Dodge Challenger Demon", 300, 25);
        Carro_Soma cs2 = new Carro_Soma("Corvett C8", 400, 37);
        Carro_Mult cm1 = new Carro_Mult("Chevrolet Camaro Exorcist", 370, 1.6);
        Carro_Mult cm2 = new Carro_Mult("Toyota Supra MK4", 220, 1.4);

        Corrida cor_cs1 = new Corrida();
        cor_cs1.addCarro(cs1);

        Corrida cor_cs2 = new Corrida();
        cor_cs2.addCarro(cs2);

        Corrida cor_cm1 = new Corrida();
        cor_cm1.addCarro(cm1);

        Corrida cor_cm2 = new Corrida();
        cor_cm2.addCarro(cm2);
    }
}
