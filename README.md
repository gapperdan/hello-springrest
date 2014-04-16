# hello-springrest

Spring REST Tutorial with IntelliJ IDEA, Gradle with tomcat-plugin

To run locally:

    ./gradlew tomcatRun ==> to start tomcat with app deployed
    ./gradlew jettyRun ==> to start jetty with app deployed

If using jettyRun, use port: 9080 instead.

REST endpoints:

* http://localhost:8080/hello-springrest/rest/hello
* http://localhost:8080/hello-springrest/rest/hello/{name}
* http://localhost:8080/hello-springrest/rest/hello/person

Will also work within Intellij IDEA by starting the local Tomcat

## how to remote debug tomcatRun in IntelliJ IDEA

*	create *gradle.properties* with the following lines:

		org.gradle.jvmargs=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005
		org.gradle.daemon=true

*	in IntelliJ IDEA, create a Run/Debug configuration to connect to the remote debugging port

		Run > Edit Configurations...
		Add new "Remote" configuration
		Keep the default *Command line arguments for running remote JVM* (matches the port)
		-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005
		Name: remote tomcatRun (whatever name you want to use)
		Transport: Socket
		Debugger mode: Attach
		Host: localhost
		Port: 5005 <== should match all the configuration elsewhere
		Search sources using module's classpath: <whole project>
	
*	to debug, select Run > Debug 'remote tomcatRun'	
	
More information from here: https://github.com/bmuschko/gradle-tomcat-plugin
	