// Classe filha que representa um gato. Herda de AnimalAbstrato
public class GatoAbstrato extends AnimalAbstrato {

    // Construtor. Chama o construtor do AnimalAbstrato para inicializar nome e idade
    GatoAbstrato(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação obrigatória do método abstrato, Som específico do gato
    @Override
    String emitirSomAbstrato() {
        return "Miau!";
    }
}