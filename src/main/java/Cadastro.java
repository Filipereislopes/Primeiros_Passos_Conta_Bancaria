public class Cadastro {
    public static void main(String[] args) {
        ContaBanco cl1 = new ContaBanco();
        cl1.setNumConta(1111);
        cl1.setDono("Filipe");
        cl1.abrirConta("CC");


        ContaBanco cl2 = new ContaBanco();
        cl2.setNumConta(2111);
        cl2.setDono("Renato");
        cl2.abrirConta("CP");

        cl1.depositar(250.50f);
        cl2.depositar(150.50f);

        cl1.sacar(50);
        cl2.sacar(100);

        cl1.sacar(250.50f);
        cl1.fecharConta();


        cl1.estadoAtualConta();
        cl2.estadoAtualConta();
    }
}
