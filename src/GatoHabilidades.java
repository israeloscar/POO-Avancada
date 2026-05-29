// Classe que representa um gato com habilidades. Herda de Animal
// e implementa apenas a interface Corredor (gatos não nadam!)
public class GatoHabilidades extends Animal implements Corredor {

    // Construtor. Chama o construtor do Animal para inicializar nome e idade
    GatoHabilidades(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação obrigatória da interface Corredor
    @Override
    public String correr() {
        return "Está correndo";
    }
}