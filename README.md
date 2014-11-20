geo-platform-archetypes
=======================

The geo-platform maven archetypes


[English version]


Installation and deployment
---------------------------
 1. Execute the following command ‘mvn clean install’ from the root
    archetype. In this way, the archetype will be installed in the
    subfolder repository/org/geosdi/archetypes and also will update the
    archetype-catalog.xml file in the folder .m2 (if not present, it
    will be created).
 2. Execute the following command ‘mvn deploy’ to deploy the archetype
    and the catalog (archetype-catalog.xml). In this way the archetype
    and the catalog will be installed on the server specified in the
    <distributionManagement> section.



Project generation
------------------

Before you create a new project, navigate to the appropriate subfolder of geoplatform. In particular:

 - For archetype gui: 
   %Geo_Platform_DIR%/geoplatform-gui/core/geoplatform-widget
 - For archetype services:
   %Geo_Platform_DIR%/geoplatform-services/geoplatform-modules



 1. Execute the following command ‘mvn archetype:generate’ to create a
    new project in interactive mode. You will see all the archetypes
    present in maven, and both local and remote. Execute the command
    ‘mvn archetype:generate -DarchetypeCatalog=local’ to restrict the
    list to only local archetypes, or insert instead of local the
    address of your repository, e.g. ‘mvn archetype:generate
    -DarchetypeCatalog=http://myrepo.com/org/geosdi/archetypes’. N.B.: the address must be present org/geoSDI/archetypes.
 2. locate and enter the number of the archetype.
 3. enter the fields in the interactive procedure:
    - For groupId is preferable to include 'org.geosdi';
    - For archetype gui: enter for the parameter NewModuleEntryPoint the name of the new module entry point with an uppercase first letter (camel case);
    - For archetype services: same thing for the parameter NameModule.



Only the archetypal services
----------------------------

Insert in the <profiles>section of the pom.xml file contained in the subfolder% Geo_Platform_DIR%/geoplatform-services/geoplatform-ws-core/geoplatform-ws-webapp the following code:

    <profile>
    	<id>”Enter an identifier to profile”</id>
    	<activation>
    		<activeByDefault>false</activeByDefault>
    		<property>
    			<name>full</name>
    		</property>
    	</activation>
    	<dependencies>
    		<dependency>
    			<groupId>”enter the groupId of the archetype created”</groupId>
    			<artifactId>”enter the’artifactId of the archetype created with the suffix -api”</artifactId>
    		</dependency>
    		<dependency>
    			<groupId>”enter the groupId of the archetype created”</groupId>
    			<artifactId>”enter the’artifactId of the archetype created with the suffix -impl”</artifactId>
    		</dependency>
    	</dependencies>
    </profile>




----------




[Italian version]


Installazione e deploy
----------------------

 1. Posizionarsi nella root dell’archetipo e compilare con il seguente
    comando ‘mvn clean install’. L’archetipo sarà installato nella
    sottocartella repository/org/geosdi/archetypes ed, inoltre, verrà
    aggiornato il file archetype-catalog.xml presente nella cartella .m2
    (se non presente, verrà creato).
 2. Effettuare il deployment dell’archetipo e del catalogo
    (archetype-catalog.xml) con il seguente comando ‘mvn deploy’.
    L’archetipo verrà installato, assieme al catalogo, nel server
    specificato nella sezione <distributionManagement>.



Generazione progetto
--------------------

Prima di generare un nuovo progetto, posizionarsi nella sottocartella opportuna di geoplatform. In particolare:

 - Per l’archetype gui posizionarsi in:
   %Geo_Platform_DIR%/geoplatform-gui/core/geoplatform-widget
 - Per l’archetype services posizionarsi in:
   %Geo_Platform_DIR%/geoplatform-services/geoplatform-modules


 1. Generare un nuovo progetto in modalità interattiva eseguendo il
    seguente comando ‘mvn archetype:generate’. Verranno visualizzati
    tutti gli archetipi presenti in maven, sia remoti e sia locali. Per
    limitare il catalogo ai soli archetipi locali eseguire il comando
    ‘mvn archetype:generate -DarchetypeCatalog=local’. Oppure è
    possibile limitare il catalogo ai soli archetipi presenti in un
    proprio repository, inserendo al posto di local l’indirizzo della
    repo. Ad es. ‘mvn archetype:generate
    -DarchetypeCatalog=http://myrepo.com/org/geosdi/archetypes’. N.B: nell’indirizzo deve essere presente org/geosdi/archetypes.
 2. individuare e inserire il numero dell’archetipo desiderato.
 3. inserire i campi richiesti dalla procedura interattiva:
 
    - Per groupId è preferibile inserire ‘org.geosdi’
    - Per il parametro NewModuleEntryPoint, dell’archetipo gui, inserire il nome del nuovo modulo entry point con la prima lettera maiuscola (notazione cammello). Stessa cosa per il parametro NameModule dell’archetype services.



Solo per l’archetipo services
-----------------------------

Inserire nella sezione <profiles> del file pom.xml contenuto nella sottocartella %Geo_Platform_DIR%/geoplatform-services/geoplatform-ws-core/geoplatform-ws-webapp il seguente codice:

    <profile>
    	<id>”Inserire un identificativo del profilo”</id>
    	<activation>
    		<activeByDefault>false</activeByDefault>
    		<property>
    			<name>full</name>
    		</property>
    	</activation>
    	<dependencies>
    		<dependency>
    			<groupId>”inserire il groupId dell’archetype creato”</groupId>
    			<artifactId>”inserire l’artifactId dell’archetype creato con il suffisso -api”</artifactId>
    		</dependency>
    		<dependency>
    			<groupId>”inserire il groupId dell’archetype creato”</groupId>
    			<artifactId>”inserire l’artifactId dell’archetype creato con il suffisso -impl”</artifactId>
    		</dependency>
    	</dependencies>
    </profile>


