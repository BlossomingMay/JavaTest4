FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.5.0
ENV MYSQL_ROOT_NAME root
ENV MYSQL_ROOT_PASSWORD root
ENV IP jdbc:mysql://mysql:3306/sakila?useSSL=false&serverTimezone=Asia/Shanghai

VOLUME /tmp
ADD submodel-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]