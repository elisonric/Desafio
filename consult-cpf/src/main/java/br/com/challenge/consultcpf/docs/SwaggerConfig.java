package br.com.challenge.consultcpf.docs;

import br.com.challenge.core.docs.BaseSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    public SwaggerConfig() {
        super("br.com.challenge.consultcpf.endpoint.controller");
    }
}
