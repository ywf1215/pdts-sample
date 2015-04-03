@echo off
call mvn clean:clean
set MAVEN_OPTS= -Xms128m -Xmx512m
mvn  -Dmaven.test.skip=true package
@pause