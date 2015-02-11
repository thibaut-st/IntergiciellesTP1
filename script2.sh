javac -d classes -classpath .:classes src/Chat/Message.java
jar cvf lib/Message.jar classes/Chat/Message.class
javac -d classes -classpath .:classes:lib/Message.jar src/Chat/MessageImp.java
jar cvf lib/MessageImp.jar classes/Chat/MessageImp.class
javac -d classes -classpath .:classes:lib/Message.jar:lib/MessageImp.jar src/Chat/Server.java
javac -d classes -classpath .:classes:lib/Message.jar src/Chat/Client.java
