
# hsqldb

Récupérez et lancez une base de données HSQLDB. 

Ouvrez un terminal. 

Vous pouvez supprimer les données anciennes avec `` rm -rd data/*``

Démarrez la base de données et exécutez ``./run-hsqldb-server.sh``  et ``./show-hsqldb.sh``.

Connectez-vous à la base de données : 
- User : ``SA``
- Password : ````
- URL : ``jdbc:hsqldb:hsql://localhost/``

## TEST TP2

On vérifie le test dans un navigateur. On tape :

``http://localhost:8080/myform.html``
``http://localhost:8080/UserInfoKanban``

### Jetty
 
 Afin de démarrer le serveur Jetty, on fait clique droit sur le projet. 
``run as => maven build … ``=> on met le package ``jetty:run`` dans le ``goal``.
On remplie les formulaires dans la page ``http://localhost:8080/myform.html`` et ``http://localhost:8080/UserInfoKanban``
On se connecte à à la base de données (hsqldb)

Dans hsqldb, pour créer la requête, on utilise la requête suivante:

 - select * from kanban
 
 La réponse : 
 
 |-------------|
 | ID | Kanban |
 |-------------|
 |1  | Neda    |
 |-------------|
 |2  | TP GLI  |
 |-------------|
 
Nous pouvons stopper Jetty en cliquant sur le bouton rouge "stop" de la console eclipse.
 
#### JAXRS

Dans Eclipse, on trouve le fichier ``/TAA_TP2/jaxrs/RestServer.java`` permettant d'exécuter le programme.
 ``RestServer.java => Run AS => Java Application ``
On teste le service "implanter" à l’aide d'un navigateur en nous rendant sur :
 ``http://localhost:8080/kanban/1``
 
 Le body nous donne : 
 
```json
{
    "id": 1,
    "nom": "Neda",
    "section" : []
}
```
  Le body nous donne :
  s
``http://localhost:8080/kanban/2``


```json
{
    "id": 2,
    "nom": "TP GLI",
    "section" : []
}
```

 
 
