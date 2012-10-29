#A Maven 3 archetype for quick starting Spring Batch projects#

You have to develop a Java batch application (process) and you don't know where to start from? This may help you. The aim of this project is to offer a quick way to start developing a Java based Sprig Batch application by using a custom project archetype. This archetype will help you create a fully configured Maven project in seconds, with all the dependencies included, so that you can start developing the business logic on top of Spring Batch infrastructure.

You also get plenty of examples ready to run and use as starting point for your own jobs.


#What skills do I need to start using the archetype?#

To install and start working with the archetype you'll just need basic knowledge of Maven 3. Don't worry. If you are new to Maven, basic commands for installing and start using the archetype are provided below (See "How can I start quickly?"). To create a new Spring Batch project and start developing your own jobs (batch processes) you should be familiar with Spring framework and have some knowledge of it's programming model. Obviously Java programming language knowledge is essential.


#But what's Spring Batch?#

Spring Batch is an open source Java based framework for developing batch applications. It's not the aim of this project to explain Spring Batch in depth. If you want to know more about Spring Batch and it's features & advantages please refer to http://static.springsource.org/spring-batch/. The user guide will also be very useful http://static.springsource.org/spring-batch/reference/html-single/index.html.

I also found Spring Batch in Action book very useful http://www.manning.com/templier/.

You should be aware of the need for a framework to launch your jobs in a controller environment.


#How can I start quickly?#

**Install required software**

This template is a Maven 3 archetype so you will need to have Maven 3 installed on your computer. 

Download it from http://maven.apache.org/download.html.

**Download the archetype**

Once Maven 3 is installed you have to install this archetype from the jar file.

Download it from https://github.com/downloads/epelde/springbatch-quickstart/springbatch-quikstart-archetype-1.0-SNAPSHOT.jar.

**Install the archetype**

To install the archetype on your local repository run the following command:

    mvn install:install-file -DgroupId=epelde.github.com -DartifactId=springbatch-quickstart -Dversion=1.0-SNAPSHOT -Dpackaging=jar -Dfile=PATH_TO_WHERE_YOU_DOWNLOADED_JAR_FILE
		
**Update your local catalog [optional]**

The point of catalogs is exactly to not have to know the names of archetypes in advance (groupId, artifactId, version). This way you have to type less when generating your project as it will be displayed in an archetype list. For archetypes not included in the catalog the user will have to type more but it will work the same way.

    mvn archetype:crawl -Dcatalog=THE_ARCHETYPES_CATALOG_TO_UPDATE_XML_FILE

**Generate your project source**

Once installed successfully you are ready to start your on Spring Batch project. A Maven archetype is a Maven project templating toolkit. Move to a fresh directory and use your archetype to generate the project. if you updated yout local catalog type the following command:

    mvn archetype:generate -DarchetypeCatalog=local
		
This will prompt you with the archetypes list installed in your local repository. Now you can select one and provided the required information for groupId, artifactId and version of your project.

If you didn't updated you local catalog you have to type a bit more:

    mvn archetype:generate -DarchetypeGroupId=epelde.github.com -DarchetypeArtifactId=springbatch-quickstart -DarchetypeVersion=1.0-SNAPSHOT -DarchetypeCatalog=local _DgroupId=YOU_PROJECTS_PACKAGING -DartifactId=YOUR_PROJECTS_ID -Dversion=YOU_PROJECTS_VERSION

**Compile & build**

Finally compile the project by running the following command:

    mvn clean package

**Run the sample**

Now you are ready to run  the samples. Type the following Maven command to run the simplets sample provided in order to check if everuthing is ok.

    mvn exec:java -Dexec.mainClass=org.springframework.batch.core.launch.support.CommandLineJobRunner -Dexec.args="sample1.xml sample1" 

		
# How can I run the samples?#

Along with the archetype there are a number of sample jobs provided ready to be use. You can run the samples provided just using the command line. As you should have Maven 3 already installed, the easiest way is to use it to run the samples. 