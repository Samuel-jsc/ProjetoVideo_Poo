# 🎥 Projeto Vídeo POO

Este projeto foi desenvolvido em **Java** como parte de estudos de **Programação Orientada a Objetos (POO)**.  
Ele simula um sistema simples de vídeos, usuários e visualizações, aplicando conceitos como **herança, abstração, polimorfismo e interfaces**.

---

## 📌 Estrutura do Projeto

O projeto contém as seguintes classes:

- **AcoesVideo (Interface)**  
  Define ações básicas que um vídeo pode ter: `play()`, `pause()` e `like()`.

- **Pessoa (Classe Abstrata)**  
  Classe base para representar pessoas, com atributos como `nome`, `idade`, `sexo` e `experiencia`.

- **Usuario (Classe Concreta)**  
  Herda de `Pessoa` e adiciona atributos como `login` e `totAssistido`.  
  Representa os usuários que assistem aos vídeos.

- **Video (Classe Concreta)**  
  Implementa a interface `AcoesVideo`.  
  Possui atributos como `titulo`, `avaliacao`, `views`, `curtidas` e `reproduzindo`.

- **Visualizacao (Classe Concreta)**  
  Representa o ato de um usuário assistir a um vídeo.  
  Atualiza estatísticas de `Usuario` e `Video`, além de permitir diferentes formas de avaliação.

- **ProjetoVideo_Poo (Classe Principal)**  
  Contém o método `main` para executar o programa e testar as funcionalidades.

---

## 🚀 Funcionalidades

- Criar vídeos e usuários.
- Registrar visualizações de vídeos por usuários.
- Avaliar vídeos de diferentes formas:
  - Avaliação padrão (`avaliar()`).
  - Avaliação por nota (`avaliar(int nota)`).
  - Avaliação por porcentagem assistida (`avaliar(float porc)`).
- Exibir informações detalhadas de vídeos, usuários e visualizações.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**  
- **NetBeans IDE** (ou qualquer IDE compatível)

---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seuusuario/projetovideo_poo.git
