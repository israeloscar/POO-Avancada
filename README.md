# ☕ Estudos de Java — POO Avançada e Coleções

Repositório com os exercícios de POO avançada do meu aprendizado de Java.  
Iniciado em maio/2026 para conseguir o meu primeiro emprego como desenvolvedor. 🚀

---

## 📁 Estrutura do repositório

```
POO-Avancada/
└── src/
    ├── Animal.java
    ├── Cachorro.java
    ├── Gato.java
    ├── AnimalAbstrato.java
    ├── CachorroAbstrato.java
    ├── GatoAbstrato.java
    ├── Nadador.java
    ├── Corredor.java
    ├── CachorroHabilidades.java
    ├── GatoHabilidades.java
    └── Main.java
```

---

## 🧪 Exercícios

| Arquivo | Descrição | Conceitos praticados |
|---|---|---|
| `Animal.java` | Classe mãe com atributos e método genérico | herança, classe base |
| `Cachorro.java` | Classe filha que herda de Animal | `extends`, `super`, `@Override` |
| `Gato.java` | Classe filha que herda de Animal | `extends`, `super`, `@Override` |
| `AnimalAbstrato.java` | Classe abstrata com método abstrato | `abstract`, classe abstrata |
| `CachorroAbstrato.java` | Classe filha que herda de AnimalAbstrato | `extends`, `@Override`, método abstrato |
| `GatoAbstrato.java` | Classe filha que herda de AnimalAbstrato | `extends`, `@Override`, método abstrato |
| `Nadador.java` | Interface que define o contrato de nadar | `interface`, contrato |
| `Corredor.java` | Interface que define o contrato de correr | `interface`, contrato |
| `CachorroHabilidades.java` | Classe que implementa Nadador e Corredor | `implements`, múltiplas interfaces |
| `GatoHabilidades.java` | Classe que implementa apenas Corredor | `implements`, interface única |
| `Main.java` | Demonstra herança, polimorfismo, classes abstratas e interfaces | polimorfismo, array de objetos, `for-each` |

---

## 🗺️ Plano de estudos

| Fase | Conteúdo | Status |
|---|---|---|
| Fase 1 | Fundamentos de Java | ✅ Concluído |
| Fase 2 | POO Avançada e Coleções | 🟡 Em andamento |
| Fase 3 | Java Moderno e Banco de Dados | ⏳ Pendente |
| Fase 4 | Spring Boot e APIs REST | ⏳ Pendente |

---

## 🛠️ Tecnologias

- **Linguagem:** Java 21 ☕
- **IDE:** IntelliJ IDEA Community 💡
- **Controle de versão:** Git + GitHub 🐙

---

## ▶️ Como rodar os exercícios

1. Clone o repositório:
```bash
git clone https://github.com/israeloscar/POO-Avancada.git
```

2. Abra a pasta no IntelliJ IDEA 💡

3. Navegue até o arquivo `Main.java` e rode com `Ctrl + Shift + F10`

Ou pelo terminal:
```bash
javac src/*.java
java -cp src Main
```

---

## 👤 Autor

### Israel Oscar

*Atualizado conforme avanço nos estudos.* 📈