package net.sahet.app12factor.web.rest;

import lombok.extern.slf4j.Slf4j;
import net.sahet.app12factor.service.RateService;
import net.sahet.app12factor.web.dto.RateRequest;
import net.sahet.app12factor.web.dto.RateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api")
public class RateResource {
    @Autowired
    private RateService rateService;

    @ResponseBody
    @RequestMapping(value = "/rate", method = RequestMethod.POST, produces = "application/json;charset=UTF-8",
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    public RateResponse getName(@RequestBody RateRequest rateRequest) {

        return rateService.getRates(rateRequest);
    }
}
