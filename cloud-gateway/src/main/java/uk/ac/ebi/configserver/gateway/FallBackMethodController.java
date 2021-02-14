package uk.ac.ebi.configserver.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/personServiceFallBack")
    public String personServiceFallBackMethod() {
        return "Person Service esta tomando mas de lo previsto." +
                " Intente mas tarde";
    }

}
