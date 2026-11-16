# Projets Java · Programmation orientée objet

Projets réalisés dans le cours de **programmation orientée objet** (Cégep Marie-Victorin, session 2).

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)

## Projets

| Projet | Description | Concepts POO |
|---|---|---|
| [`proligue`](proligue) | Gestion d'un club sportif : joueurs, entraîneurs, séances d'entraînement et bilan de la masse salariale | Héritage, classe abstraite, polymorphisme, packages |
| [`magicworld`](magicworld) | Gestion des employés d'un parc d'attractions : animateurs, techniciens et gérants, avec primes de fidélité et bilan salarial | Classe abstraite, polymorphisme, packages, `List` |
| [`bibliotheque-legendaire`](bibliotheque-legendaire) | Une bibliothèque « royaume » : ajout de livres, recherche, emprunts, retours et points de gloire | Héritage (`Document` → `Livre`), redéfinition, `ArrayList` |
| [`formes-geometriques`](formes-geometriques) | Calcul de l'aire et du périmètre de rectangles, triangles et cercles, et recherche de la plus grande forme | Classe abstraite, polymorphisme, `ArrayList` |
| [`banque`](banque) | Compte bancaire avec dépôts et retraits, et refus des retraits supérieurs au solde | Encapsulation, exception personnalisée |

## Exécuter un projet

Chaque projet est indépendant. Avec IntelliJ : ouvrir le dossier du projet et lancer `Main`.

En ligne de commande (Java 17+) :

```bash
cd proligue
javac -d out $(find src -name "*.java")
java -cp out Main
```
