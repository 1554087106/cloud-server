package org.whz;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: hong-zhi
 * @date: 2023/6/14 23:20
 * @Description Eureka启动类
 */
@SpringBootApplication
// 开启Eureka服务端功能
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class)
                // Web应用
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
