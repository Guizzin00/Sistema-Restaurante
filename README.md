# 🧾 Exercício 2: Sistema de Gerenciamento de Pedidos em um Restaurante

## 📋 Contexto

Este projeto tem como objetivo a criação de um sistema para **registrar e gerenciar pedidos em um restaurante**, onde o cardápio é composto por **pratos principais** e **bebidas**. O sistema demonstra conceitos fundamentais da programação orientada a objetos: abstração, herança, encapsulamento, polimorfismo e composição.

---

## 🧩 Classes e Atributos

### 📦 Classe: `ItemMenu` (Abstrata)

Representa a estrutura base para os itens do cardápio.

#### Atributos:
- `nome` (string): Nome do item.
- `_preco` (float): Preço do item (protegido).
- `descricao` (string): Descrição detalhada do item.

#### Métodos:
- `exibir_detalhes()`: Método abstrato que deve ser implementado pelas classes filhas.
- `alterar_preco(novo_preco: float)`: Permite modificar o preço com segurança.

---

### 🍽️ Classe: `PratoPrincipal` (Herda de `ItemMenu`)

Representa um prato principal do cardápio.

#### Atributos adicionais:
- `ingredientes` (list[str]): Ingredientes do prato.
- `tempo_preparo` (int): Tempo estimado de preparo (em minutos).
- `categoria` (string): Categoria do prato (ex: "vegetariano", "massas", "carnes").

#### Método:
- `exibir_detalhes()`: Retorna uma descrição completa do prato principal.

---

### 🥤 Classe: `Bebida` (Herda de `ItemMenu`)

Representa uma bebida do cardápio.

#### Atributos adicionais:
- `tamanho` (str ou int): Tamanho/volume da bebida (ex: "pequena", "500ml").
- `alcoolica` (bool): Indica se contém álcool.
- `marca` (string): Marca ou fabricante da bebida.

#### Método:
- `exibir_detalhes()`: Retorna uma descrição completa da bebida.

---

## 📦 Classe de Composição: `Pedido`

Agrupa os itens de um pedido e fornece operações sobre eles.

#### Atributos:
- `numero_pedido` (int): Identificador único do pedido.
- `itens` (list[ItemMenu]): Lista de pratos e bebidas adicionados.
- `data` (datetime): Data e hora do pedido.

#### Métodos:
- `adicionar_item(item: ItemMenu)`: Adiciona um novo item ao pedido.
- `calcular_total()`: Retorna o valor total da soma dos itens.
- `exibir_pedido()`: Mostra todos os detalhes dos itens, demonstrando o polimorfismo.

---

## 🎯 Objetivos do Exercício

### ✅ Abstração
A classe `ItemMenu` fornece a estrutura base para os demais itens, definindo a interface comum.

### ✅ Herança
As classes `PratoPrincipal` e `Bebida` herdam de `ItemMenu` e implementam métodos específicos.

### ✅ Encapsulamento
O atributo `_preco` é protegido e só pode ser alterado via o método `alterar_preco`.

### ✅ Polimorfismo
A chamada de `exibir_detalhes()` em um `ItemMenu` exibe resultados distintos conforme o tipo do item.

### ✅ Composição
A classe `Pedido` é composta por uma lista de itens (pratos e bebidas), organizando os dados de forma eficiente.
