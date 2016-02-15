package com.zeros;

import com.zeros.config.Neo4jConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Neo4jConfig.class)
@EnableAutoConfiguration
public class SpringNeo4jSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNeo4jSampleApplication.class, args);
	}
}
