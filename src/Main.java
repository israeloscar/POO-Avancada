public class Main {
    public static void main(String[] args) {

        // Cria um cachorro e um gato com nome e idade
        Cachorro cadela = new Cachorro("Layla", 10);
        Gato gato = new Gato("Mingau", 8);

        // Exibe o nome e o som de cada animal
        System.out.println(cadela.nome + ": " + cadela.emitirSom());
        System.out.println(gato.nome + ": " + gato.emitirSom());
    }
}
