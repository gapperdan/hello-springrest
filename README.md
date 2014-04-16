# hello-springrest

Spring REST Tutorial with IntelliJ IDEA, Gradle with tomcat-plugin

To run locally:

    ./gradlew tomcatRun ==> to start tomcat with app deployed
    ./gradlew jettyRun ==> to start jetty with app deployed

If using jettyRun, use port: 9080 instead.

REST endpoints:

* http://localhost:8080/hello-springrest/rest/hello
* http://localhost:8080/hello-springrest/rest/hello/{name}

Will also work within Intellij IDEA by starting the local Tomcat

## how to remote debug tomcatRun in IntelliJ IDEA

*	create *gradle.properties* with the following line:
		org.gradle.jvmargs=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005
*	in IntelliJ IDEA, create a Run/Debug configuration to connect to the remote debugging port
		Run > Edit Configurations...
			