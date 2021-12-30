package top.sxuet.daydayup.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Sxuet
 * @program daydayup
 * @description
 * @since 2021-11-01 14:13
 */
@EnableDiscoveryClient
@ComponentScan({"top.sxuet.daydayup"})
@SpringBootApplication
public class NacosDiscoveryApplication {
  public static void main(String[] args) {
    SpringApplication.run(NacosDiscoveryApplication.class, args);
  }
}
