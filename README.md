# 🚀 algprog-lista-04

📚 Conjunto de exercícios em Java para praticar lógica de programação básica e estruturas de controle do 1º período de Algoritmos.

## 🎯 Objetivo

- Revisar validações de entrada e controle de fluxo com `Scanner`.
- Consolidar a forma correta de usar `if`, `while`, `do-while` e `for`.
- Entender como acumular valores e calcular médias em pequenos programas.

## 🧭 Estrutura do projeto

| Exercício | Tema principal | O que faz | Emoji guia |
|-----------|----------------|-----------|------------|
| `Ex1NotaValida.java` | Validação de entrada | Solicita uma nota entre 0 e 10 até receber uma válida. | ✅ |
| `Ex2ValidacaoSenha.java` | Autenticação simples | Requer a senha correta antes de sair do loop. | 🔒 |
| `Ex3ValidacaoCadastro.java` | Cadastro condicional | Verifica idade, sexo e estado civil antes de aceitar dados. | 📝 |
| `Ex4Populacao.java` | Crescimento populacional | Simula o crescimento de duas populações e imprime resultados. | 🌆 |
| `Ex5CalculadoraPopulacao.java` | Projeções e laços | Calcula quantos anos cada cidade leva para ultrapassar a outra. | 🧮 |
| `Ex6MostradorNumeros.java` | Sequências numéricas | Exibe os números pares de 1 a 10 com contador. | 🔢 |
| `Ex7MaiorNumero.java` | Comparação | Identifica o maior valor digitado até o usuário digitar 0. | 🏁 |
| `Ex8SomaMedia.java` | Acumulador | Soma números positivos e calcula média enquanto a entrada for positiva. | ➕ |
| `Ex9MostrarImpares.java` | Estrutura de repetição | Lista os números ímpares dentro de um intervalo fixo. | 🌀 |
| `Ex10InvervaloNumeros.java` | Intervalo numérico | Recebe dois números e imprime os valores entre eles em ordem. | 📈 |

## ⚙️ Como compilar e executar

### Pré-requisitos
- JDK 11+ instalado e variável `PATH` apontando para `javac`/`java`.
- Terminal aberto na raiz `c:\\Users\\SamuelSales\\Documents\\Una\\algprog-lista-04`.

### Compilando
```sh
javac Exercicios/*.java
```

### Executando um exercício
```sh
java -cp Exercicios Ex10InvervaloNumeros
```
Troque `Ex10InvervaloNumeros` pelo nome desejado (por exemplo, `Ex1NotaValida`).

## 🧪 Testes manuais

- Rode cada classe passando valores que explorem todos os `if` e `loops`.
- Observe as mensagens no console para entender o fluxo (ex.: notas válidas/inválidas, senha incorreta, contadores).
- Use `Ctrl+C` para interromper loops infinitos criados para testes.

## 🤝 Contribuições

- Adicione novos exercícios na pasta `Exercicios/` mantendo o padrão de uma classe pública por arquivo.
- Documente os requisitos de entrada e saída no cabeçalho da classe ou neste README.
- Abra uma issue ou crie um rascunho local antes de fazer alterações extensas.

## 🧩 Próximos passos sugeridos

1. Criar um script simples (`.bat` ou `.sh`) que compile + rode um exercício para automatizar testes.
2. Criar descrições de entrada/saída para cada exercício em um subtítulo próprio.
3. Migrar para um build tool (Gradle, Maven) se novos pacotes forem adicionados.
