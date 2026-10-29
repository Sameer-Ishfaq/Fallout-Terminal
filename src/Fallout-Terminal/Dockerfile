#Creating a new container based on a linux image that already has jdk 26 installec
FROM eclipse-temurin:26-jdk

#Creating a folder called App and to move into it. Same as cd /App
WORKDIR /App

#Copies the conents of src into the App directory
COPY src ./src

#Runs when building the image. Finds all the filenames that end with .java
#and conmbines another argument using | to compile then
RUN find src -name "*.java" | xargs javac


#Runs the image to create a container.
#Tells java to look inside the src folder for compiled class files
#Finds App.class and executes the main method
#Code is executed as it would in intellij
CMD ["java", "-cp", "src", "App"]
