
# hsqldb

Récupérez et lancez une base de données HSQLDB. 

Ouvrez un terminal. 

Vous pouvez supprimer les données anciennes avec `` rm -rd data/*``

Démarrez la base de données et exécutez ``./run-hsqldb-server.sh``  et ``./show-hsqldb.sh``.

Connectez-vous à la base de données : 
- User : ``SA``
- Password : ````
- URL : ``jdbc:hsqldb:hsql://localhost/``

## Test TP TEST
Dans Eclipse, on trouve le fichier ``JpaTest.java`` permettant d'exécuter le programme.
 ``JpaTest.java => Run AS => Java Application ``


Dans hsqldb, pour créer un "employee", on peut faire la requête suivante:

 - select * from employees
 
 La réponse : 
 
 |-----------------------------------------|
 | ID | EMAIL      | FRISTNAME | LASTENAME |
 |-----------------------------------------|
 | 1 | nd@yahoo.fr|    Neda	| YOUSEFIAN |
 |-----------------------------------------|

 
 
 

 
 
