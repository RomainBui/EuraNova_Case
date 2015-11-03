# EuraNova Case

EuraNova Case Study

### For the Fun : 

![](./GIT.png)

### Installation

1. Install Maven (if necessary)
   
   `brew install maven`
   
2. Download Apache Flink 
   
   http://flink.apache.org/downloads.html
   
3. Download Eclipse Kepler
   
   https://ci.apache.org/projects/flink/flink-docs-master/internals/ide_setup.html
   
4. Implement Flink in the IDE (Eclipse)
   
   1. `cd ~/Downloads`	
   2. `git clone https://github.com/apache/flink.git`
   3. `cd flink`
   4. `mvn clean package -DskipTests`
   5. Add the "macroparadise" compiler plugin to the Scala compiler. Open "Window" -> "Preferences" -> "Scala" -> "Compiler" -> "Advanced" and put into the "Xplugin" field the path to the *macroparadise* jar file (typically "/home/*-your-user-*/.m2/repository/org/scalamacros/paradise_2.10.4/2.0.1/paradise_2.10.4-2.0.1.jar"). Note: If you do not have the jar file, you probably did not run the command line build.
   6. Import the Flink Maven projects ("File" -> "Import" -> "Maven" -> "Existing Maven Projects") — Go to `Downloads/flink`
   7. During the import, Eclipse will ask to automatically install additional Maven build helper plugins.
   8. Close the "flink-java8" project. Since Eclipse Kepler does not support Java 8, you cannot develop this project.

### Configuration:

- MacBook Pro 2011 - 8go 
  
- Apache Flink (Quick Doc) 0.9.1
  
  `$ cd ~/Downloads        # Go to download directory`
  
  `$ tar xzf flink-*.tgz   # Unpack the downloaded archive`
  
  `$ cd flink-0.9.1`
  
  `$ bin/start-local.sh    # Start Flink`
  
  `$ bin/stop-local.sh    # Stop Flink`
  
- Scala IDE 3.0.3 - Eclipse Kepler
  
- GIT



1. Producing the events : create a simulator capable of producing event at random intervals.
   
   ​