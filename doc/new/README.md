# How to create this project


## Create maven

Create a Maven project:

```sh
mvn -B archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DgroupId=com.joelparkerhenderson \
  -DartifactId=demo-aws-lamba-function-hello-world-java
cd demo-aws-lamba-function-hello-world-java
```

Edit `pom.xml` to upgrade the Java version to the highest available on AWS Lamba, which is currently Java 11, by adding these lines:

```xml
<project …>
  …
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
  </properties>
  …
```

Compile:

```sh
mvn compile
```

Output:

```sh
…
[INFO] Building demo-aws-lamba-function-hello-world-java 1.0-SNAPSHOT
…
[INFO] BUILD SUCCESS
```


## Add AWS Lamba

Add AWS dependency to `pom.xml`:

```xml
<dependency>
  <groupId>com.amazonaws</groupId>
  <artifactId>aws-lambda-java-core</artifactId>
  <version>1.2.0</version>
</dependency>
```

Add build with maven-shade-plugin. The plugin provides the capability to package the artifact in an uber-jar, including its dependencies and to shade - i.e. rename - the packages of some of the dependencies.

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-shade-plugin</artifactId>
      <version>3.2.1</version>
      <configuration>
        <createDependencyReducedPom>false</createDependencyReducedPom>
      </configuration>
      <executions>
        <execution>
          <phase>package</phase>
          <goals>
            <goal>shade</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```


## Source

Create `App.java` to handle each request:

```java
package com.joelparkerhenderson.makertakersolver;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<RequestClass, ResponseClass> {

    public ResponseClass handleRequest(RequestClass request, Context context){
        String greeting = String.format("Hello %s", request.name);
        return new ResponseClass(greeting);
    }

}
```

Create `RequestClass` to serialize input from JSON:

```java
package com.joelparkerhenderson.makertakersolver;

public class RequestClass {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public RequestClass(String name) {
        this.name = name;
    }

    public RequestClass() {
    }
}
```

Create `ResponseClass` to serialize output to JSON:

```java
package com.joelparkerhenderson.makertakersolver;

public class ResponseClass {
    String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public ResponseClass(String greeting) {
        this.greeting = greeting;
    }

    public ResponseClass() {
    }
}
```
