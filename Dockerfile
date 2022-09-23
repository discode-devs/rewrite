FROM openjdk:18
COPY . /usr/src/myapp
COPY .env /usr/src/myapp/build/libs
WORKDIR /usr/src/myapp/build/libs
CMD ["java", "-jar", "discode-1.3-standalone.jar"]