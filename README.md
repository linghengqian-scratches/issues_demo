## issues_demo

- For https://github.com/apache/shardingsphere/issues/28294
- test by `mvn spring-boot:run`. The `./mvnw` file has been tampered with with Unix permissions and cannot be used directly.

```shell
$ mvn spring-boot:run
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.ingsha:demo >---------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot:3.1.3:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ demo ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 3 resources from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ demo ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/issues_demo/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] <<< spring-boot:3.1.3:run (default-cli) < test-compile @ demo <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot:3.1.3:run (default-cli) @ demo ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.3)

2023-08-29T04:58:36.296+08:00  INFO 7130 --- [           main] com.ingsha.application.app.Application   : Starting Application using Java 17.0.8 with PID 7130 (/home/linghengqian/TwinklingLiftWorks/git/public/issues_demo/target/classes started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/issues_demo)
2023-08-29T04:58:36.300+08:00  INFO 7130 --- [           main] com.ingsha.application.app.Application   : No active profile set, falling back to 1 default profile: "default"
2023-08-29T04:58:37.459+08:00  INFO 7130 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'stringToNoneShardingStrategyConfigurationConverter' of type [org.apache.shardingsphere.spring.boot.converter.StringToNoneShardingStrategyConfigurationConverter] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2023-08-29T04:58:37.465+08:00  INFO 7130 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'spring.shardingsphere-org.apache.shardingsphere.spring.boot.prop.SpringBootPropertiesConfiguration' of type [org.apache.shardingsphere.spring.boot.prop.SpringBootPropertiesConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2023-08-29T04:58:37.902+08:00  INFO 7130 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.apache.shardingsphere.spring.boot.ShardingSphereAutoConfiguration' of type [org.apache.shardingsphere.spring.boot.ShardingSphereAutoConfiguration$$SpringCGLIB$$0] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2023-08-29T04:58:38.129+08:00  INFO 7130 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-08-29T04:58:38.139+08:00  INFO 7130 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-08-29T04:58:38.139+08:00  INFO 7130 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.12]
2023-08-29T04:58:38.235+08:00  INFO 7130 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-08-29T04:58:38.236+08:00  INFO 7130 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1706 ms
Logging initialized using 'class org.apache.ibatis.logging.stdout.StdOutImpl' adapter.
2023-08-29T04:58:38.415+08:00  INFO 7130 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-08-29T04:58:38.641+08:00  INFO 7130 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:config user=SA
2023-08-29T04:58:38.643+08:00  INFO 7130 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-08-29T04:58:38.843+08:00 ERROR 7130 --- [           main] com.alibaba.druid.pool.DruidDataSource   : testWhileIdle is true, validationQuery not set
2023-08-29T04:58:38.876+08:00  INFO 7130 --- [           main] com.alibaba.druid.pool.DruidDataSource   : {dataSource-1} inited
Registered plugin: 'com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor@38c761e9'
Parsed mapper file: 'file [/home/linghengqian/TwinklingLiftWorks/git/public/issues_demo/target/classes/mapper/OauthUserPoMapper.xml]'
Initialization Sequence datacenterId:1 workerId:8
 _ _   |_  _ _|_. ___ _ |    _ 
| | |\/|_)(_| | |_\  |_)||_|_\ 
     /               |         
                        3.5.3.2 
2023-08-29T04:58:39.619+08:00  INFO 7130 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-08-29T04:58:39.631+08:00  INFO 7130 --- [           main] com.ingsha.application.app.Application   : Started Application in 3.705 seconds (process running for 4.034)
```
