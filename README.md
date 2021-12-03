# QA Technical Exercise
## Part 2
Follow these steps to run the tests in this project

###Windows
* Install JDK 11+ [https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA](https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA)
* Install Maven [https://javabydeveloper.com/how-to-install-maven-on-windows/](https://javabydeveloper.com/how-to-install-maven-on-windows/)
* Navigate to the project folder on a CLI
* Run the command: -Dbrowser="${enter browser name}" test e.g -Dbrowser="EDGE" test

###MacOS
* Install JDK 11+ [https://docs.oracle.com/en/java/javase/11/install/installation-jdk-macos.html#GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE](https://docs.oracle.com/en/java/javase/11/install/installation-jdk-macos.html#GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE)
* Install Maven [https://javabydeveloper.com/how-to-install-maven-on-mac-osx/](https://javabydeveloper.com/how-to-install-maven-on-mac-osx/)
* Navigate to the project folder on terminal
* Run the command: mvn -Dbrowser="${enter browser name}" test e.g -Dbrowser="EDGE" test

###Linux(Ubuntu)
* Install JDK 11+ [https://docs.oracle.com/en/java/javase/11/install/installation-jdk-linux-platforms.html#GUID-737A84E4-2EFF-4D38-8E60-3E29D1B884B8](https://docs.oracle.com/en/java/javase/11/install/installation-jdk-linux-platforms.html#GUID-737A84E4-2EFF-4D38-8E60-3E29D1B884B8)
* Install Maven [https://javabydeveloper.com/maven-setup/](https://javabydeveloper.com/maven-setup/)
* Navigate to the project folder on terminal
* Run the command: mvn -Dbrowser="${enter browser name}" test e.g -Dbrowser="EDGE" test

###Docker
* Run docker build -t mavenproject:latest
* Run docker run -it --name mavencontainer mavenproject:latest /bin/bash
* Run mvn -Dbrowser="${browsername}" test
