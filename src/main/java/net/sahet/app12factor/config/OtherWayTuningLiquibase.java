package net.sahet.app12factor.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;

public class OtherWayTuningLiquibase {

    /*@Bean
    public SpringLiquibase liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:liquibase-changeLog.xml");
        liquibase.setDataSource(dataSource());
        return liquibase;
    }*/
}
