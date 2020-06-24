sdk use java graalvm-ce-java11-20.2.0-20200605
export GRAALVM_HOME=/Users/igorz/.sdkman/candidates/java/graalvm-ce-java11-20.2.0-20200605
export JAVA_HOME=$GRAALVM_HOME

mvn clean install
java -agentlib:native-image-agent=config-merge-dir=./reflection-info,caller-filter-file=./filter.json -jar ./target/jaxb.jar
./target/jaxb
