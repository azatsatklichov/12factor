package net.sahet.app12factor.service.cronexecutor;

import lombok.extern.slf4j.Slf4j;
import net.sahet.app12factor.service.RateService;
import org.springframework.scheduling.annotation.Scheduled;

import javax.inject.Inject;

@Slf4j
public class CronJobExecutorService {

    @Inject
    private RateService rateService;

    @Scheduled(cron = "0 1 0 * * ?")
    public void runGetRates() {
        log.info("triggering cron job runSyncAllCustomerInvoicesStatus");
        rateService.getRates(null);
    }

    @Scheduled(cron = "0 0 4 * * ?")
    public void runSendMailNotifications() {
        log.info("triggering cron job runSendSupplierShipmentNotifications");

        /*GET http://localhost:8888/mail
        purchaseOrderService.sendShipmentNotifications();*/
        //TODO make a client to send the mail
    }

}
