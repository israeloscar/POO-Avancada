public class Main {
    public static void main(String[] args) {

        // Cria um cachorro e um gato com nome e idade
        Cachorro cadela = new Cachorro("Layla", 10);
        Gato gato = new Gato("Mingau", 8);

        // Exibe o nome e o som de cada animal individualmente
        System.out.println(cadela.nome + ": " + cadela.emitirSom());
        System.out.println(gato.nome + ": " + gato.emitirSom());

        // ---------------------------------------------------------------------------------------------------------

        // Array de animais. Demonstra polimorfismo
        // cada objeto responde ao emitirSom() do seu jeito
        Animal[] animais = {cadela, gato, new Cachorro("Bob", 6)};

        // percorre o array chamando o mesmo método em todos
        for (Animal animal : animais) {
            System.out.println(animal.nome + ": " + animal.emitirSom());
        }

        // ---------------------------------------------------------------------------------------------------------

        // Testando classes abstratas. AnimalAbstrato não pode ser instanciado diretamente
        // apenas as suas classes filhas podem ser criadas
        CachorroAbstrato cachorroAbs = new CachorroAbstrato("Rex", 5);
        GatoAbstrato gataAbs = new GatoAbstrato("Luna", 3);

        // cada filha implementa o emitirSomAbstrato() do seu jeito
        System.out.println(cachorroAbs.nome + ": " + cachorroAbs.emitirSomAbstrato());
        System.out.println(gataAbs.nome + ": " + gataAbs.emitirSomAbstrato());

        // ---------------------------------------------------------------------------------------------------------

        // Testando interfaces. Cachorro implementa Nadador e Corredor, gato só Corredor
        CachorroHabilidades cachorroInteligente = new CachorroHabilidades("Totó", 12);
        GatoHabilidades gatoInteligente = new GatoHabilidades("Belo", 5);

        // cachorro pode nadar e correr. Duas interfaces!
        System.out.println(cachorroInteligente.nome + ": " + cachorroInteligente.nadar());
        System.out.println(cachorroInteligente.nome + ": " + cachorroInteligente.correr());

        // gato só pode correr. Uma interface!
        System.out.println(gatoInteligente.nome + ": " + gatoInteligente.correr());
    }
}