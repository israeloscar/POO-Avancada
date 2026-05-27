// Classe filha que representa um cachorro. Herda de AnimalAbstrato
public class CachorroAbstrato extends AnimalAbstrato {

    // Construtor — chama o construtor do AnimalAbstrato para inicializar nome e idade
    CachorroAbstrato(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação obrigatória do método abstrato. Som específico do cachorro
    @Override
    String emitirSomAbstrato() {
        return "Au, au!";
    }
}