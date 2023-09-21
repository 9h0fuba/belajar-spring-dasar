package ghofuba.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "ghofuba.belajarspringdasar.configuration"
})
public class ScanConfiguration {



}
