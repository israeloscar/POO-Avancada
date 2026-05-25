// Classe filha que representa um gato, herda de Animal
public class Gato extends Animal {

    // Construtor — chama o construtor do Animal para inicializar nome e idade
    Gato(String nome, int idade) {
        super(nome, idade);
    }

    // Sobrescreve o emitirSom do Animal com o som específico do gato
    @Override
    String emitirSom() {
        return "Miau!";
    }
}
