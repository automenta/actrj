From: http://cog.cs.drexel.edu/act-r/ (maven-ized and minor packaging modifications)

A more up-to-date implementation Java ACT-R implementation, jACT-R:
 * http://jactr.org 
 * https://github.com/amharrison/jactr
 
More information about ACT-R theory:
 * http://act-r.psy.cmu.edu/
 * http://en.wikipedia.org/wiki/ACT-R

----

To run:
```
  mvn exec:java
```
  
To build a JAR:
```
  mvn package
  java -cp target/actr-1.0-SNAPSHOT.jar actr.Main
```

To run .JAR from project's root directory (currently it loads the resource files relative to the root so you must run it from there)
