# Programação Orientada a Objetos (POO)

**Objetivo:** Aproximar o mundo digital do mundo real.

---

## Linha do Tempo da Programação

```
Programação Baixo Nível → Programação Linear → Programação Estruturada → Programação Modular → Programação Orientada a Objetos
```

---

## Vantagens da POO

- **Confiável:** Isolamento gera softwares mais seguros.
- **Oportuno:** Permite o desenvolvimento paralelo.
- **Manutenível:** Facilita atualizações no sistema.
- **Extensível:** Facilita o crescimento do software.
- **Reutilizável:** Objetos podem ser reaproveitados em outros sistemas.
- **Natural:** O foco na funcionalidade aproxima o sistema do mundo real.

---

# O que é um Objeto?

Um objeto é uma representação de uma coisa material ou abstrata, descrita por seus **atributos** (características), **métodos** (ações) e **estado** (condição atual).

Exemplo: **Caneta**

| Elemento | Descrição |
|:--------|:----------|
| Atributos | Modelo, Cor, Ponta, Carga, Tampada |
| Métodos  | Escrever, Desenhar, Tampar, Destampar |
| Estado   | Tampada, Destampada, Com carga, Sem carga |

---

# O que é uma Classe?

Uma **classe** é um molde usado para criar objetos. Ela define os atributos e métodos comuns a todos os objetos daquele tipo.

Exemplo de classe:

```pseudo
Classe Caneta
    modelo: Caractere
    cor: Caractere
    ponta: Real
    carga: Inteiro
    tampada: Lógico
    
    Método rabiscar()
        Se (tampada) então
            Escreva("ERRO: Caneta tampada!")
        Senão
            Escreva("Rabiscando...")
        FimSe
    FimMetodo

    Método tampar()
        tampada = verdadeiro
    FimMetodo

    Método destampar()
        tampada = falso
    FimMetodo
FimClasse
```

---

# Instanciando Objetos

```pseudo
c1 = nova Caneta
c1.cor = "Azul"
c1.ponta = 0.5
c1.tampada = falso
c1.rabiscar()

c2 = nova Caneta
c2.cor = "Vermelha"
c2.ponta = 1.0
c2.tampar()
```

---

# Diferença entre Classe e Objeto

| Termo | Definição |
|:------|:----------|
| Classe | Molde que define atributos e métodos. |
| Objeto | Instância da classe criada em tempo de execução. |

---

# Visibilidade dos Atributos e Métodos

## Modificadores de Visibilidade

- **public (+):** Acesso livre de qualquer lugar.
- **private (-):** Acesso restrito à própria classe.
- **protected (#):** Acesso pela própria classe e por suas subclasses.

Exemplo:

```pseudo
Classe Caneta
    publico modelo: Caractere
    publico cor: Caractere
    privado ponta: Real
    protegido carga: Inteiro
    protegido tampada: Lógico

    privado Metodo tampar()
    FimMetodo
    
    publico Metodo rabiscar()
    FimMetodo
FimClasse
```

---

# Métodos Especiais: Getters e Setters

- **Getters:** Recuperam valores de atributos privados.
- **Setters:** Alteram valores de atributos privados.

```pseudo
Classe Caneta
    public modelo: Caractere
    private ponta: Real

    public Metodo getModelo()
        return modelo
    FimMetodo

    public Metodo setModelo(m: Caractere)
        modelo = m
    FimMetodo

    public Metodo getPonta()
        return ponta
    FimMetodo

    public Metodo setPonta(p: Real)
        ponta = p
    FimMetodo
FimClasse
```

---

# Método Construtor

**O que é?**  
O **método construtor** é um método especial usado para inicializar um objeto assim que ele é criado. Ele configura os valores iniciais dos atributos e pode executar outras ações de preparação.

Exemplo:

```pseudo
Classe Caneta
    Metodo construtor(m: Caractere, c: Caractere, p: Real)
        setModelo(m)
        setCor(c)
        setPonta(p)
        tampar()
    FimMetodo
FimClasse

c1 = nova Caneta("BIC", "Azul", 0.5)
```

---

# Pilares da POO

- **Encapsulamento**
- **Herança**
- **Polimorfismo**

---

# Encapsulamento

Ocultar detalhes internos de implementação e expor apenas o que é necessário para o uso do objeto.

---

# Interface

**O que é?**  
Uma **interface** define um conjunto de métodos que uma classe deve implementar. Ela estabelece um "contrato" de comportamento, mas não diz como os métodos serão realizados.

Exemplo de Interface:

```pseudo
interface Controlador
    public abstrato Metodo ligar()
    public abstrato Metodo desligar()
    public abstrato Metodo abrirMenu()
    public abstrato Metodo fecharMenu()
    public abstrato Metodo maisVolume()
    public abstrato Metodo menosVolume()
    public abstrato Metodo ligarMudo()
    public abstrato Metodo desligarMudo()
    public abstrato Metodo play()
    public abstrato Metodo pause()
FimInterface
```

Classe que implementa a Interface:

```pseudo
classe ControleRemoto
    implementa Controlador

    private inteiro volume
    private logico ligado
    private logico tocando

    public Metodo ligar()
        setLigado(verdadeiro)
    FimMetodo

    public Metodo desligar()
        setLigado(falso)
    FimMetodo

    ...
FimClasse
```

---

# Relacionamento entre Classes


```mermaid
classDiagram
    class Lutador {
      -nome
      -nacionalidade
      -idade
      -altura
      -peso
      -categoria
      -vitorias
      -derrotas
      -empates
      +apresentar()
      +status()
      +ganharLuta()
      +perderLuta()
      +empatar()
    }
```

---

# Herança

Permite criar novas classes que herdam atributos e métodos de uma classe existente.

Exemplo:

```mermaid
classDiagram
    class Pessoa {
        -nome
        -idade
        -sexo
        +fazerAniversario()
    }

    class Aluno {
        -matricula
        -curso
        +cancelarMatricula()
    }

    class Professor {
        -especialidade
        -salario
        +receberAumento()
    }

    class Funcionario {
        -setor
        -trabalhando
        +mudarTrabalho()
    }

    Pessoa <|-- Aluno
    Pessoa <|-- Professor
    Pessoa <|-- Funcionario
```

### Tipos de Herança

- **Herança de Implementação:** Copia atributos e métodos da superclasse.
- **Herança por Diferença:** Além de herdar, adiciona ou altera funcionalidades.

---

# Abstração e Herança

| Conceito | Descrição |
|:---------|:----------|
| Classe Abstrata | Classe que não pode ser instanciada. |
| Método Abstrato | Método sem implementação na classe mãe. |
| Classe Final | Classe que não pode ser herdada. |
| Método Final | Método que não pode ser sobrescrito. |

---

# Polimorfismo

Permite que métodos com o mesmo nome atuem de maneiras diferentes, dependendo do objeto que os chama.

- Assinatura do método quantidade e os tipos dos parâmetros.
```
publico método calcMedia(n1: Real, n2: Real): Real
```
```
publico método calcMedia(v1: Real, v2: Real): Inteiro
```


### Tipos de Polimorfismo
- Sobreposição: acontece quando **substituímos** um método de uma superclasse, usando a **mesma assinatura.**
- Sobrecarga

```mermaid
classDiagram
    %% ---------- Classe Abstrata ----------
    class Animal {
        -peso
        -idade
        -membros
        <<abstract>>
        +locomover()
        +alimentar()
        +emitirSom()
    }

    %% ---------- Subclasses Principais ----------
    class Mamifero {
        -corPelo
    }
    class Reptil {
        -corEscama
    }
    class Peixe {
        -corEscama
        +soltarBolha()
    }
    class Ave {
        -corPena
        +fazerNinho()
    }

    %% ---------- Subclasses Específicas ----------
    class Canguru {
        +usarBolsa()
        +locomover()
    }
    class Cachorro {
        +enterrarOsso()
        +abanarRabo()
    }
    class Cobra {
    }
    class Tartaruga {
        +locomover()
    }
    class Goldfish {
    }
    class Arara {
    }

    %% ---------- Relações ----------
    Animal <|-- Mamifero
    Animal <|-- Reptil
    Animal <|-- Peixe
    Animal <|-- Ave

    Mamifero <|-- Canguru
    Mamifero <|-- Cachorro
    Reptil <|-- Cobra
    Reptil <|-- Tartaruga
    Peixe <|-- Goldfish
    Ave <|-- Arara
```



```pseudo
classe abstrata Animal
  protegido peso: Real
  protegido idade: Real
  protegido membros: Real
  publico método abstrata locomover()
  publico método abstrata alimentar()
  publico método abstrata emitirSom()
FimClasse
```

```pseudo
Classe Mamifero estende Animal
  privado corPelo: Carcatere
  @Sobrepor
  publico método locomover()
	Escreva("Correndo")
  fimMetodo
  @Sobrepor
  publico método alimentar()
	Escreva("Mamando")
  fimMetodo
  @Sobrepor
  publico método emitirSom()
	Escreva("Som de mamifero")
  fimMetodo
FimClasse
```

```pseudo
Classe Reptil estende Animal
  privado corEscama: Carcatere
  @Sobrepor
  publico método locomover()
	Escreva("Rastejando")
  fimMetodo
  @Sobrepor
  publico método alimentar()
	Escreva("Comendo insetos")
  fimMetodo
  @Sobrepor
  publico método emitirSom()
	Escreva("Som de reptil")
  fimMetodo
FimClasse
```

```pseudo
Classe Peixe estende Animal
  privado corEscama: Carcatere
  @Sobrepor
  publico método locomover()
	Escreva("Nadando")
  fimMetodo
  @Sobrepor
  publico método alimentar()
	Escreva("Comendo algas")
  fimMetodo
  @Sobrepor
  publico método emitirSom()
	Escreva("Peixe não faz som")
  fimMetodo
publico método soltarBolha()
	Escreva("Soltou uma bolha")
  fimMetodo
FimClasse
```
```pseudo
Classe Ave estende Animal
  privado corPena: Carcatere
  @Sobrepor
  publico método locomover()
	Escreva("Voando")
  fimMetodo
  @Sobrepor
  publico método alimentar()
	Escreva("Comendo frutas")
  fimMetodo
  @Sobrepor
  publico método emitirSom()
	Escreva("Som de pássaros")
  fimMetodo
publico método fazerNinho()
	Escreva("Fazendo ninho")
  fimMetodo
FimClasse
```

```pseudo
Classe Canguru estende Mamifero
   publico metodo usarBolsa()
	Escreva("Usando bolsa")
  fimMetodo
  @Sobrepor
  publico método locomover()
	Escreva("Saltando")
  fimMetodo
FimClasse
```

```pseudo
Classe Cachorro estende Mamifero
   publico metodo enterrarOsso()
	Escreva("Enterrando osso")
  fimMetodo
  publico metodo abanarRabo()
	Escreva("Abanando o rabo")
  fimMetodo
  @Sobrepor
  publico método emitirSom()
	Escreva("Latindo")
  fimMetodo
FimClasse
```

```pseudo
Classe Cobra estende Réptil

FimClasse
``` 

```pseudo
Classe Tartaruga estende Reptil
  @Sobrepor
  publico método locomover()
	Escreva("Andando beeem devagar")
  fimMetodo
FimClasse
```

```pseudo
Classe GoldFish estende Peixe

FimClasse
```

```pseudo
Classe Arara estende Ave

FimClasse
```

```
// Programa Principal

m = novo Mamifero()
c = novo Canguru()
k = novo Cachorro()

m.setPeso(5.70)
m.setIdade(8)
m.setMembros(4)
m.locomover() // Correndo
m.alimentar() // Mamando
m.emitirSom() // Som de Mamífero

c.setPeso(55.30)
c.setIdade(3)
c.setMembros(4)
c.locomover() // Saltando
c.alimentar() // Mamando
c.emitirSom() // Som de Mamífero
c.usarBolsa()

k.setPeso(3.94)
k.setIdade(5)
k.setMembros(4)
k.locomover() // Correndo
k.alimentar() // Mamando
k.emitirSom() // Som de Mamífero
k.abanarRabo()

```
