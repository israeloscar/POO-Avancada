// Classe abstrata que serve como molde para animais
// não pode ser instanciada diretamente, apenas herdada
public abstract class AnimalAbstrato {

    // Atributos comuns a todos os animais
    String nome;
    int idade;

    // Construtor — inicializa o animal com nome e idade
    AnimalAbstrato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato — obriga toda classe filha a implementar o seu próprio som
    abstract String emitirSomAbstrato();
}