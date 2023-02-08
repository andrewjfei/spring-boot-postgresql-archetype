# Spring Boot PostgreSQL Archetype

This is an archetype for creating a REST API with a PostgreSQL database.

## Prerequisites

- Java 17
- Maven 3
- PostgreSQL 14

## How To Use

Follow the steps below to use this archetype with IntelliJ IDEA:

### Step 1

Build the archetype. This can be done by running the following command in the terminal or via the IDE 

```
mvn clean install
```

This will create a build of the project, which can
be located at `target/spring-boot-postgresql-archetype-1.0-SNAPSHOT.jar`.

### Step 2

Specify the archetype within a archetype catalog. If you already have an archetype
catalog which you are using, then simply add the new archetype to your catalog. Otherwise,
copy the `archetype-catalog.xml` file located in the root of the project into a local directory.

> If adding to an existing archetype catalog, only the following needs to be added.

```xml
...
    <archetypes>
        ...
        <archetype>
            <groupId>dev.andrewjfei</groupId>
            <artifactId>spring-boot-postgresql-archetype</artifactId>
            <version>1.0-SNAPSHOT</version>
        </archetype>
        ...
    </archetypes>
...
```

### Step 3

Create a new project in IntelliJ IDEA and from side menu select **Maven Archetype**. To select our new archetype,
firstly, add the archetype catalog containing the archetype to the **Catalog** dropdown list.

Once you have added the archetype catalog to the list, the new archetype should be selectable from the **Archetype**
dropdown list.

Select the version `1.0-SNAPSHOT` and change any additional properties if you wish. 

You are now ready to start development with your new archetype.

## Troubleshooting

If you are getting a database connection exception. Make sure that you have first, manually created a database within
your local PostgreSQL which matches your project name.