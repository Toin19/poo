public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new Pessoa("João", 32, 1.82, 110, "Masculino");
        pessoa1.imprimir();

        Pessoa pessoa2 = new Pessoa("Maria", 18, 1.60, 55.80, "Feminino");
        pessoa2.imprimir();

    }
}