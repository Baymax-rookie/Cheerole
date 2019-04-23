package org.rookie.cheerole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author 12589
 */
@MapperScan("org.rookie.cheerole.mapper")
@SpringBootApplication
public class CheeroleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheeroleApplication.class, args);
    }

}
