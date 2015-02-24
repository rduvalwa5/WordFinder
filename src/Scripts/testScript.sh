#!/bin/bash
ROOT_HOME=/Users/rduvalwa2/DevTools/eclipse-luna/workspace/Java/Learning/FindWordsInString
JUNIT_HOME=$ROOT_HOME/src/external_classes/junit-4.10.jar
SELENIUM_HOME=$ROOT_HOME/src/external_classes/selenium-java-2.42.2.jar
LOG4J_HOME=$ROOT_HOME/src/external_classes/log4j-1.2.17.jar
BIN=$ROOT_HOME/bin
PATH=$PATH:.:$JUNIT_HOME:$SELENIUM_HOME:$BIN:$LOG4J_HOME:$ROOT_HOME/src
CLASSPATH=.:$JUNIT_HOME:$SELENIUM_HOME:$BIN:$LOG4J_HOME

echo $CLASSPATH
echo New Code
java -cp $CLASSPATH org.junit.runner.JUnitCore $1

# Result o9f running
#C1246895-Air:Scripts rduvalwa2$ ./testScript.sh FindWordsTest
#.:/Users/rduvalwa2/DevTools/eclipse-luna/workspace/ExternalClasses/junit-4.10.jar:/Users/rduvalwa2/DevTools/eclipse-luna/workspace/ExternalClasses/selenium-java-2.42.2.jar:/Users/rduvalwa2/DevTools/eclipse-luna/workspace/Java/Learning/FindWordsInString/bin
#/Users/rduvalwa2/DevTools/eclipse-luna/workspace/Java/Learning/FindWordsInString/bin
#JUnit version 4.10
#.dic word is The
#dic word is quick
#dic word is brown
#dic word is fox
#dic word is jumps
#Words [The, quick, brown, fox, jumps]
#[The, quick, brown, fox, jumps]
#[The, quick, brown, fox, jumps]
#.dic word is The
#dic word is quick
#dic word is brown
#dic word is fox
#dic word is jumps
#Words [The, quick, brown, fox, jumps]
#[The, quick, brown, fox, jumps]
#[The, quick, brown, fox, jumps]
#.Words []
#[]
#[]
#.Words []
#[]
#[]
#..
#Time: 0.011
#OK (6 tests)
