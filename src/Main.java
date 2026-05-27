public class Main {
    public static void main(String[] args) {

        // Cria um cachorro e um gato com nome e idade
        Cachorro cadela = new Cachorro("Layla", 10);
        Gato gato = new Gato("Mingau", 8);

        // Exibe o nome e o som de cada animal individualmente
        System.out.println(cadela.nome + ": " + cadela.emitirSom());
        System.out.println(gato.nome + ": " + gato.emitirSom());

        // ---------------------------------------------------------------------------------------------------------

        // Array de animais — demonstra polimorfismo
        // cada objeto responde ao emitirSom() do seu jeito
        Animal[] animais = {cadela, gato, new Cachorro("Bob", 6)};

        // percorre o array chamando o mesmo método em todos
        for (Animal animal : animais) {
            System.out.println(animal.nome + ": " + animal.emitirSom());
        }

        // ---------------------------------------------------------------------------------------------------------

        // Testando classes abstratas — AnimalAbstrato não pode ser instanciado diretamente
        // apenas a suas classes filhas podem ser criadas
        CachorroAbstrato cachorroAbs = new CachorroAbstrato("Rex", 5);
        GatoAbstrato gataAbs = new GatoAbstrato("Luna", 3);

        // cada filha implementa o emitirSomAbstrato() do seu jeito
        System.out.println(cachorroAbs.nome + ": " + cachorroAbs.emitirSomAbstrato());
        System.out.println(gataAbs.nome + ": " + gataAbs.emitirSomAbstrato());
    }
}