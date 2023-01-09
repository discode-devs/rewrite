FROM amazoncorretto:17
MAINTAINER Mazylol

WORKDIR /app

COPY . .

CMD ["./gradlew", "run"]