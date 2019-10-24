
## 什么是Nacos?
Nacos 致力于帮助您发现、配置和管理微服务。Nacos 提供了一组简单易用的特性集，帮助您快速实现动态服务发现、服务配置、服务元数据及流量管理。
是Spring Cloud A 中的服务注册发现组件，类似于Consul、Eureka，同时它又提供了分布式配置中心的功能，这点和Consul的config类似，支持热加载。

## Nacos 的关键特性包括:
服务发现和服务健康监测
动态配置服务，带管理界面，支持丰富的配置维度。
动态 DNS 服务
服务及其元数据管理

## Nacos下载
Nacos依赖于Java环境，所以必须安装Java环境。然后从官网下载Nacos的解压包，安装稳定版的，
下载地址：https://github.com/alibaba/nacos/releases
下载 nacos-server-1.1.3.tar.gz
本次案例下载的版本为1.1.3 ，下载完成后，解压，在解压后的文件的/bin目录下，
windows系统点击startup.cmd就可以启动nacos。linux或mac执行以下命令启动nacos。
`linux:sh startup.sh -m standalone`

## nacos
在浏览器上访问：http://localhost:8848/nacos，会跳转到登陆界面，默认的登陆用户名为nacos，密码也为nacos。
从界面可知，此时没有服务注册到Nacos上。

![img](doc/image/微信截图_20190813120534.png)

## 使用Nacos服务注册和发现
服务注册和发现是微服务治理的根基，服务注册和发现组件是整个微服务系统的灵魂，选择合适的服务注册和发现组件至关重要，目前主流的服务注册和发现组件有Consul、Eureka、Etcd等。
随着Eureka的闭源，Spring cloud netflix-oss组件大规模的进入到了维护期，不再提供新功能，spring cloud alibaba受到开源社区的大力拥护。
服务注册
* 在本案例中，使用2个服务注册到Nacos上，分别为nacos-provider和nacos-consumer。

## Nacos作为配置中心
https://www.fangzhipeng.com/springcloud/2019/06/01/sc-nacos-config.html


## Sentinel
Sentinel，中文翻译为哨兵，是为微服务提供流量控制、熔断降级的功能，它和Hystrix提供的功能一样，可以有效的解决微服务调用产生的“雪崩”效应，为微服务系统提供了稳定性的解决方案。随着Hytrxi进入了维护期，不再提供新功能，Sentinel是一个不错的替代方案。通常情况，Hystrix采用线程池对服务的调用进行隔离，Sentinel才用了用户线程对接口进行隔离，二者相比，Hystrxi是服务级别的隔离，Sentinel提供了接口级别的隔离，Sentinel隔离级别更加精细，另外Sentinel直接使用用户线程进行限制，相比Hystrix的线程池隔离，减少了线程切换的开销。另外Sentinel的DashBoard提供了在线更改限流规则的配置，也更加的优化。
从官方文档的介绍，Sentinel 具有以下特征:
丰富的应用场景： Sentinel 承接了阿里巴巴近 10 年的双十一大促流量的核心场景，例如秒杀（即突发流量控制在系统容量可以承受的范围）、消息削峰填谷、实时熔断下游不可用应用等。
完备的实时监控： Sentinel 同时提供实时的监控功能。您可以在控制台中看到接入应用的单台机器秒级数据，甚至 500 台以下规模的集群的汇总运行情况。
广泛的开源生态： Sentinel 提供开箱即用的与其它开源框架/库的整合模块，例如与 Spring Cloud、Dubbo、gRPC 的整合。您只需要引入相应的依赖并进行简单的配置即可快速地接入 Sentinel。
完善的 SPI 扩展点： Sentinel 提供简单易用、完善的 SPI 扩展点。您可以通过实现扩展点，快速的定制逻辑。例如定制规则管理、适配数据源等。

Sentinel 控制台提供一个轻量级的控制台，它提供机器发现、单机资源实时监控、集群资源汇总，以及规则管理的功能.
Sentinel DashBoard下载地址：https://github.com/alibaba/Sentinel/releases
--------------------- 

## 参考
https://blog.csdn.net/forezp/article/details/90142744