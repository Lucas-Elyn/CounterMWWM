# 🚀 Contador MVVM em Kotlin com Jetpack Compose

Um projeto minimalista e elegante que demonstra a implementação da arquitetura **MVVM** (Model-View-ViewModel) utilizando o moderno toolkit **Jetpack Compose** para a criação de uma interface de usuário reativa e intuitiva. Este aplicativo de contador simples é um excelente ponto de partida para entender os conceitos fundamentais do desenvolvimento Android com as tecnologias mais atuais.

## ✨ Uma Visão Rápida

Imagine uma tela limpa com um contador centralizado e dois botões convidativos: "**Incrementar**" e "**Decrementar**". Ao tocar nesses botões, o valor do contador se atualiza instantaneamente, refletindo a potência da programação reativa oferecida pelo Jetpack Compose e a organização proporcionada pelo padrão MVVM.

## 🛠️ Tecnologias

* **Kotlin:** A linguagem de programação concisa e expressiva da Google para desenvolvimento Android.
* **Jetpack Compose:** O revolucionário toolkit de UI declarativo do Android que simplifica e acelera o desenvolvimento de interfaces nativas.
* **MVVM (Model-View-ViewModel):** Um padrão de arquitetura robusto que promove a separação clara entre a interface do usuário, a lógica de apresentação e os dados, resultando em um código mais testável e manutenível.
* **AndroidX:** As bibliotecas de suporte do Android que garantem compatibilidade e acesso a recursos modernos.

## 📂 Estrutura Inteligente do Projeto

* `MainActivity.kt`: O ponto de entrada do aplicativo, responsável por configurar a interface Compose e conectar o ViewModel.
* `TheCounterApp.kt`: A Composable function que define a estrutura visual da tela do contador, exibindo o valor e os botões interativos.
* `CounterModel.kt`: Uma classe de dados simples (Model) que encapsula o estado do contador.
* `CounterRepository.kt`: O guardião dos dados (Repository), responsável por gerenciar e fornecer o estado do contador.
* `CounterViewModel.kt`: O cérebro da apresentação (ViewModel), que expõe o estado do contador para a View e implementa a lógica de incremento e decremento.
* `ui.theme`: O lar dos estilos e temas visuais que dão vida à interface do usuário.

## ✨ Funcionalidades Essenciais

* **Contagem em Tempo Real:** Exibe o valor atual do contador de forma dinâmica.
* **Incremento Simples:** Aumente o valor do contador com um toque no botão "**Incrementar**".
* **Decremento Intuitivo:** Diminua o valor do contador com um toque no botão "**Decrementar**".
* **Arquitetura Robusta:** Implementação do padrão MVVM para um código bem organizado e fácil de entender.
* **Interface Moderna:** Construído com a flexibilidade e o poder do Jetpack Compose.

---
