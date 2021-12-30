package top.sxuet.daydayup.nacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sxuet
 * @program daydayup
 * @description
 * @since 2021-11-01 15:35
 */
@Slf4j
@RestController
public class helloController {
  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }
}
