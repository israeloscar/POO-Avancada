// Classe mãe que representa um animal genérico
public class Animal {

    // Atributos comuns a todos os animais
    String nome;
    int idade;

    // Construtor, inicializa o animal com nome e idade
    Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método que retorna o som do animal. Será sobrescrito pelas classes filhas
    String emitirSom() {
        return "Som genérico de animal!";
    }
}