
# Setup

* Scala installieren (mind. version 2.12.6)
* IntelliJ IDEA Community Edition IDE
* IntelliJ Scala Plugin installieren

# Ausführen

```
sbt ~fastOptJS
```

und `http://localhost:12345/target/scala-2.11/classes/index-dev.html` im Browser öffnen.

# Build

```
sbt fullOptJS
```

and open up `index-opt.html` for an optimized version
of the final application, useful for final publication.
