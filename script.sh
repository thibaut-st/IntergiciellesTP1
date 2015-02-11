javac -d classes -classpath .:classes src/Hello.java
jar cvf lib/Hello.jar classes/Hello.class
javac -d classes -classpath .:classes:lib/Hello.jar src/HelloImp.java
jar cvf lib/HelloImp.jar classes/HelloImp.class
javac -d classes -classpath .:classes:lib/Hello.jar:lib/HelloImp.jar src/HelloServer.java
javac -d classes -classpath .:classes:lib/Hello.jar src/HelloClient.java
