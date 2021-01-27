# Imagen para compilación
FROM gradle:6.7-jdk11 AS ci
LABEL stage=ci

# Copia todo el proyecto
COPY --chown=gradle:gradle . /home/gradle/src

# Ruta de trabajo
WORKDIR /home/gradle/src

# Construye la aplicación
RUN gradle build --no-daemon


# Imagen base (JRE 11)
FROM openjdk:11-jre-slim

# Etiquetas
LABEL maintainer="ricardo.ramirez@sophossolutions.com"
LABEL version="1.0"
LABEL description="Contenedor para la demo de DevOps"

# Volumen para archivos de trabajo de Tomcat
VOLUME /tmp

# Puerto que se expone de la aplicación
EXPOSE 8080

# Rutas
ARG IN_JAR_FILE=DemoDevOps*.jar
ENV EXE_JAR_FILE DemoDevOps.jar

# Archivo bootJAR generado
COPY --from=ci /home/gradle/src/build/libs/${IN_JAR_FILE} /DemoDevOps.jar

# Comando que inicializa la aplicación
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/DemoDevOps.jar"]
