# TinyCMS - A very simple CMS for everyone

## Création d'un nouveau projet JPA
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

## Note importante
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
```xml
et en supprimant tout le bloc DOCTYPE du fichier web.xml.
