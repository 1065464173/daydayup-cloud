spring-cloud的练习demo

# 练习模块

* daydayup-nacos - nacos服务发现注册、配置中心demo
* daydayup-flowable - flowable工作流demo

# 问题记录

* 通用
* daydayup-flowable

## 通用

* 配置文件bootstrap无法读取，想用bootstrap，需要将spring.cloud.bootstrap.enabled设为true（注意这个必须设为系统变量或者环境变量）或 引入一个依赖
    ```
  <dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-bootstrap</artifactId>
  </dependency>```

## daydayup-flowable

1. [FlowableException: Could not update Flowable database schema: unknown version from database: 'XXX'](https://blog.csdn.net/u012483153/article/details/105766840)
  