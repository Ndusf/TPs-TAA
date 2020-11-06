# INSTALATION MYSQL ET PHPMYADMIN
 Installez mysql et phpmyadmin à l’aide du docker:
 ``https://hackmd.diverse-team.fr/s/rJKt4lSND#``

## LANCEMENT MYSQL ET PHPMYADMIN
Ouvrez un terminal et tapez les commandes suivantes :
``docker start``

 Pour voir tous les conteneurs : 
``docker ps -a``
``docker start CONTAINER ID ``

Php myadmin est accessible sur ``http://localhost:8082``
On crée une base de données, par exemple ``testspringdata``


### Test TAA_TP3_Partie3

Dans eclipse, on trouve le fichier ``/istic/data/jpa/App.java`` permettant d'exécuter le programme.
 ``App.java => Run AS => Java Application ``
 
On peut voir les données créées dans phpMyAdmin.


#### supprimer
Pour supprimer les conteneurs : 

``docker stop myadmin some-mysql``
``docker rm myadmin some-mysql``

Nous pouvons stopper le programme en cliquant sur le bouton rouge "stop" de la console Spring tool.

##### POSTMAN

On peux télécharger Postman avec le lien suivant :
``https://www.postman.com/downloads/``

###### REST

On utilise des méthodes avec des annotations :
- @GetMapping
- @PostMapping
- @PutMapping
- @DeleteMapping

On utilise les requêtes suivantes dans Postman :

``http://localhost:8080/kanban/{id}``

Le body dans Postman nous donne :

```{
    "nom": null,
    "id": 1,
    "section": {
        "id": 0,
        "nom": null,
        "fiches": null,
        "kanban": null
    }
}
```

``http://localhost:8080/addKanban``

Le body dans Postman nous donne :
```
{
    "nom": "neda",
    "id": 4,
    "section": null
}
```

``http://localhost:8080/updateKanban``
``http://localhost:8080/deletekanban/{kanbanNom}``


