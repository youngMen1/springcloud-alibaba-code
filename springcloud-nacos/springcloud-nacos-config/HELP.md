## 配置中心
1.Nacos除了可以作为服务注册中心，它还有服务配置中心的功能。类似于consul config，Nacos 是支持热加载的。本篇文章将讲述如何使用Nacos作为配置中心。
2.配置
`<dependency>
 	<groupId>org.springframework.cloud</groupId>
 	<artifactId>spring-cloud-alibaba-nacos-config</artifactId>
 	<version>0.9.0.RELEASE</version>
 </dependency>`
3.在bootstrap.yml(一定是bootstrap.yml文件，不是application.yml文件)文件配置以下内容：
 `spring:
    application:
      name: nacos-config
    cloud:
      nacos:
        config:
          server-addr: 127.0.0.1:8848
          file-extension: yaml
          prefix: nacos-config
    profiles:
      active: dev`
在上面的配置中，配置了nacos config server的地址，配置的扩展名是ymal（目前仅支持ymal和properties）。注意是没有配置server.port的，sever.port的属性在nacos中配置。上面的配置是和Nacos中的dataId 的格式是对应的，nacos的完整格式如下：
`${prefix}-${spring.profile.active}.${file-extension}`
* prefix 默认为 spring.application.name 的值，也可以通过配置项 spring.cloud.nacos.config.prefix来配置。
* spring.profile.active 即为当前环境对应的 profile，详情可以参考 Spring Boot文档。 注意：当 spring.profile.active 为空时，对应的连接符 - 也将不存在，dataId 的拼接格式变成 ${prefix}.${file-extension}
* file-exetension 为配置内容的数据格式，可以通过配置项 spring.cloud.nacos.config.file-extension 来配置。目前只支持 properties 和 yaml 类型。
* 启动nacos，登陆localhost:8848/nacos，创建一个data id ，完整的配置如图所示：
![img](/doc/image/微信截图_20191024094159.png)
* 写一个ConfigController,在Controller上添加 @RefreshScope 实现配置的热加载。代码如下：写一个ConfigController
* http://localhost:8761/username
![img](/doc/image/微信截图_20191024094140.png)
