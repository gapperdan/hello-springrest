# hello-springrest

Spring REST Tutorial with IntelliJ IDEA, Gradle with tomcat-plugin

To run locally:

    ./gradlew tomcatRun ==> to start tomcat with app deployed
    ./gradlew jettyRun ==> to start jetty with app deployed

If using jettyRun, use port: 9080 instead.

REST endpoints:

* http://localhost:8080/hello-springrest/rest/hello
* http://localhost:8080/hello-springrest/rest/hello/{name}
