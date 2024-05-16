public class Carro {
    public static void main(String[] args) {
        ModeloCarro Antigo = new ModeloCarro();
        Antigo.SetNome("Camaro1");
        Antigo.SetFabricação(1967);
        Antigo.SetPreço(2466);

        ModeloCarro Moderado = new ModeloCarro();
        Moderado.SetNome("Camaro2");
        Moderado.SetFabricação(2013);
        Moderado.SetPreço(40000);

        ModeloCarro Novo = new ModeloCarro();
        Novo.SetNome("Camaro3");
        Novo.SetFabricação(2017);
        Novo.SetPreço(67800);


        System.out.printf("O modelo mais barato em dólares" +
                " é o " + Barato "e, o modelo mais" +
                "caro é o " + Caro );
    }
}
