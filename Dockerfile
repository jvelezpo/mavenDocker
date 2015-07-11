FROM maven:3
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN mvn install