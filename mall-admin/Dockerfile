# 该镜像需要依赖的基础镜像
FROM sacred02/openjdk8:1.0.1
MAINTAINER egc168.com

# 将当前目录下的jar包复制到docker容器的/目录下
ADD target/mall-admin-1.0-SNAPSHOT.jar /mall-admin-1.0-SNAPSHOT.jar
# 声明服务运行在8080端口
EXPOSE 8080
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java", "-jar","/mall-admin-1.0-SNAPSHOT.jar"]

#docker build . -t sacred02/haimiao:latest
#docker push sacred02/haimiao:latest
#docker rm -f haimiao && docker pull sacred02/haimiao:latest && docker run -d --restart=always --name  haimiao -p8080:8080 sacred02/haimiao:latest
