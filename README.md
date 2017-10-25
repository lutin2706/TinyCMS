# TinyCMS - A very simple CMS for everyone
Choix d'un CMS, en implémentant deux front-ends :
* L'un destiné à tout visiteur et présentant la liste des posts écrits par les rédacteurs et administrateurs
* L'autre (partie admin), accessible aux administrateurs, rédacteurs et lecteurs, et permettant de :
	* Rédiger des articles (rédacteur)
	* Ajouter des tags (rédacteur)
	* Ajouter des catégories (admin)
	* Ajouter des utilisateurs (admin)

## Objectif
Mise en place d'un projet au choix utilisant la technologie JPA/Hibernate (persistance des données en DB). 

## Techno utilisées
* Architecture: 3-tiers (Presentation, Business/Domain, Repository/DAO)
* Framework: JEE (Maven project, Webapps)
* Front-End : HTML/CSS, Bootstrap, JSP
* Persistance des données: JPA/Hibernate, JPQL
* Autres : Maven

## Structure des packages
### Config
Définition d'une EntityManagerFactory, donnant un accès à la DB. Cet EMF est appelé à l'initialisation du contexte, afin de créer les tables en DB, et les remplir.

### Repositories
Définition d'interfaces et d'implémentations (une de chaque par objet), proposant des méthodes pour créer, updater, lire et supprimer les objets dans la DB. Utilisation de JPQL pour créer des Query customisées

### Services
Définition d'interfaces et d'implémentations (une de chaque par objet), proposant des méthodes utilisant des classes Repository => Offre plus de flexibilité.

### Servlet
* IndexServlet (GET : affiche la page d'accueil)
* PostServlet (GET : affiche un Post en particulier, avec ses commentaires)
* LoginServlet (GET : affiche la page de login, POST : valide la tentative de Login)
ainsi que les modèles associés pour transférer aux pages JSP

### Entities
Objets stockés en DB. Définit chaque colonne, ainsi que les liens entre objets.

## Librairies utilisées
* hibernate-entitymanager 4.2.6.Final
* validation-api 1.1.0.Final
* mysql-connector-java 5.1.38
* JSTL 1.2

## Procédure pour refaire le même projet
* File > New > Maven Project (archetype maven-archetype-webapps + choisir groupId et ArtifactId)
* Dans src/main/resources, créer un folder META-INF, dans lequel on crée le fichier persistence.xml
* Dans ce fichier, on indique comment accéder à la DB, et le nom de la DB (**Attention à la créer avant dans mySQL**)
* Dans src/main/java, créer un package entities, qui contiendra toutes les entités, et un package config pour accéder à la DB (EntityManagerFactory)
* Clic-droit sur le projet > Properties > Project Facets et à droite, dans runtimes, cliquer sur Apache Tomcat
* Modifier le pom.xml, afin d'indiquer la version java 1.8 :
```xml
	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
	</properties>
```

## Comment l'installer/l'utiliser
**Pour afficher la page, il faut mettre le projet dans le server (run as > run on server ou clic-droit sur le serveur > Add & remove)**  
Démarrer le serveur  
Dans le navigateur, entrer http://localhost:8080/MyTinyCMS

## Notes, informations complémentaires
Pour faire fonctionner les EL (${ ....}) dans les JSP en utilisant Maven, vous devrez soit : 
* Rajouter cette ligne dans chaque JSP (<%@ page isELIgnored="false" %> ) 
* Ou alors modifier le web.xml de votre projet Maven en y mettant ce code
```xml
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
                     http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
 version="3.0"
 metadata-complete="true">
```
et en supprimant tout le bloc DOCTYPE du fichier web.xml.
