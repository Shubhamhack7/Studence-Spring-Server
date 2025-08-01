curl https://start.spring.io/starter.zip \
  -d dependencies=web,data-jpa,security,actuator,validation,thymeleaf,devtools,h2,lombok \
  -d type=maven-project \
  -d language=java \
  -d javaVersion=17 \
  -d groupId=com.studence \
  -d artifactId=studence-spring-management-app \
  -d name=studence-spring-management-app \
  -d description="Studence Management Spring Application" \
  -o studence-spring-management-app.zip && unzip studence-spring-management-app.zip -d studence-spring-management-app && rm studence-spring-management-app.zip



curl https://start.spring.io/starter.zip \
  -d dependencies=web,data-jpa,security,actuator,validation,thymeleaf,devtools,h2,lombok \
  -d type=maven-project \
  -d language=java \
  -d javaVersion=17 \
  -d groupId=com.studence \
  -d artifactId=studence-environment \
  -d name=studence-environment \
  -d description="Studence Environment" \
  -o studence-environment.zip && unzip studence-environment.zip -d studence-environment && rm studence-environment.zip
