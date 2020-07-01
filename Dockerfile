FROM java:8
EXPOSE 8080
ADD /target/compracarronaweb-0.0.1-SNAPSHOT.jar compracarronaweb-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","compracarronaweb-0.0.1-SNAPSHOT.jar"]