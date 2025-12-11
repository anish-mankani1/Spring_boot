package org.s2p.section21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration;

@SpringBootApplication(exclude = ConfigurationPropertiesAutoConfiguration.class)
public class ApplicationRunner {

	public static void main(String[] args)
    {
		SpringApplication.run(ApplicationRunner.class, args);
	}

}
