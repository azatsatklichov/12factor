/*
package net.sahet.app12factor.config.liquibase;

import liquibase.exception.LiquibaseException;
import liquibase.integration.spring.SpringLiquibase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.util.StopWatch;

import javax.inject.Inject;

*/
/**
 * <p>
 * By liquibase.integration.spring.SpringLiquibase  database update is asynchronously.
 * The standard liquibase.integration.spring.SpringLiquibase starts Liquibase in the current thread:
 * <p>
 * - This is needed if you want to do some database requests at startup
 * -  This ensure that the database is ready when the application starts
 *//*

public class AsyncSpringLiquibase extends SpringLiquibase {

    private final Logger logger = LoggerFactory.getLogger(AsyncSpringLiquibase.class);

    @Inject
    @Qualifier("taskExecutor")
    private TaskExecutor taskExecutor;

    @Inject
    private Environment env;

    @Override
    public void afterPropertiesSet() throws LiquibaseException {
        taskExecutor.execute(() -> {
            try {
                logger.warn("Starting Liquibase asynchronously, your database might not be ready at startup!");
                initDb();
            } catch (LiquibaseException e) {
                logger.warn("Liquibase exception: ", e);
            }
        });
    }

    private void initDb() throws LiquibaseException {
        StopWatch watch = new StopWatch();
        watch.start();
        callSuperAfterPropertiesSet();
        watch.stop();
        logger.debug("Started Liquibase in {} ms", watch.getTotalTimeMillis());
    }

    public void callSuperAfterPropertiesSet() throws LiquibaseException {
        super.afterPropertiesSet();
    }
}
*/
