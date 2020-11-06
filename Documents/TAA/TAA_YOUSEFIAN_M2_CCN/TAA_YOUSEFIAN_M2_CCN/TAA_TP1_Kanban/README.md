
# hsqldb

Récupérez et lancez une base de données HSQLDB. 

Ouvrez un terminal. 

Vous pouvez supprimer les données anciennes avec `` rm -rd data/*``

Démarrez la base de données et exécutez ``./run-hsqldb-server.sh``  et ``./show-hsqldb.sh``.

Connectez-vous à la base de données : 
- User : ``SA``
- Password : ````
- URL : ``jdbc:hsqldb:hsql://localhost/``

## Test TP1
Dans Eclipse, on trouve le fichier ``JpaTest.java`` permettant d'exécuter le programme.
 ``JpaTest.java => Run AS => Java Application ``


Dans hsqldb, pour créer trois kanbans et des sections, on peut faire les requêtes suivantes:

 - select * from kanban
 
 La réponse : 
 
 |-------------|
 | ID | Kanban |
 |-------------|
 |1  | TP TAA  |
 |-------------|
 |2  | TP GLI  |
 |-------------|
 |3  | TP GUI  |
 |-------------|
 
 - select * from section
 
 La réponse : 
 
 |-------------|---------|
 | ID | Nom    |kanban_ID|
 |-------------|---------|
 | 4  | TP TAA |  1	  |
 |-------------|---------|
 | 4  | TP GLI |  2	  |
 |-------------|---------|
 | 5  | TP GUI |    3    |
 |-------------|---------|
 
 
 
 
 
