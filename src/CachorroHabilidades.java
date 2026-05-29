// Classe que representa um cachorro com habilidades. Herda de Animal
// e implementa as interfaces Nadador e Corredor
public class CachorroHabilidades extends Animal implements Nadador, Corredor {

    // Construtor. Chama o construtor do Animal para inicializar nome e idade
    CachorroHabilidades(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação obrigatória da interface Corredor
    @Override
    public String correr() {
        return "Está correndo";
    }

    // Implementação obrigatória da interface Nadador
    @Override
    public String nadar() {
        return "Está nadando";
    }
}