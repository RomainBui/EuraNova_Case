# EuraNova Case

EuraNova Case Study

### Installation

1. Install Maven
   
   `brew install maven`
   
2. Download Apache Flink 
   
   http://flink.apache.org/downloads.html
   
3. Download Eclipse Kepler
   
   https://ci.apache.org/projects/flink/flink-docs-master/internals/ide_setup.html
   
4. Implement Flink in the IDE


- `cd ~/Downloads`
- `git clone https://github.com/apache/flink.git`
- `cd flink`
- `mvn clean package -DskipTests`

### Configuration:

- MacBook Pro 2011 - 8go 
  
- Apache Flink (Quick Doc) 0.9.1
  
  `$ cd ~/Downloads        # Go to download directory`
  
  `$ tar xzf flink-*.tgz   # Unpack the downloaded archive`
  
  `$ cd flink-0.9.1`
  
  `$ bin/start-local.sh    # Start Flink`
  
  `$ bin/stop-local.sh    # Stop Flink`
  
- Scala IDE 3.0.3 - Eclipse Kepler



1. Producing the events : create a simulator capable of producing event at random intervals.
   
   ​