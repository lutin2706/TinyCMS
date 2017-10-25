# TinyCMS - A very simple CMS for everyone

## Création d'un nouveau projet JPA
* File > New > Maven Project (archetype maven-archetype-webapps + choisir groupId et ArtifactId)
* Dans src/main/resources, créer un folder META-INF, dans lequel on crée le fichier persistence.xml
* Dans ce fichier, on indique comment accéder à la DB, et le nom de la DB (**Attention à la créer avant**)
* Dans src/main/java, créer un package entities, qui contiendra toutes les entités, et un package config pour accéder à la DB (EntityManagerFactory)
* Clic-droit sur le projet > Properties > Project Facets et à droite, dans runtimes, cliquer sur Apache Tomcat
* Modifier le pom.xml, afin d'indiquer la version java 1.8 :
```xml
	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
	</properties>
```

