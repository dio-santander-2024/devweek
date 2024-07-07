# Semana Dev Week Santander 2023/2024

## Diagarama de classes utilizando o Mermaid

```mermaid
classDiagram
    class USUARIO {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }

    class Account {
        +String number
        +String agency
        +int balance
        +int limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +int limit
    }

    class News {
        +String icon
        +String description
    }

    USUARIO "1" *-- "1" Account
    USUARIO "1" *-- "N" Feature
    USUARIO "1" *-- "N" Card
    USUARIO "1" *-- "N" News

```
