package ghofuba.belajarspringdasar;

import ghofuba.belajarspringdasar.configuration.BarConfiguration;
import ghofuba.belajarspringdasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {


}
