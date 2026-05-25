// Classe filha que representa um cachorro, herda de Animal
public class Cachorro extends Animal {

    // Construtor — chama o construtor do Animal para inicializar nome e idade
    Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    // Sobrescreve o emitirSom do Animal com o som específico do cachorro
    @Override
    String emitirSom() {
        return "Au, au!";
    }
}