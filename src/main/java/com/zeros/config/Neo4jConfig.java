package com.zeros.config;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@org.springframework.context.annotation.Configuration
@EnableNeo4jRepositories("com.zeros.domain")
@EnableTransactionManagement
@ComponentScan("com.zeros.domain")
public class Neo4jConfig extends Neo4jConfiguration {


    @Autowired
    Environment env;

    @Bean
    public Configuration getConfiguration() {
        Configuration config = new Configuration();
        config
                .driverConfiguration()
                .setDriverClassName
                        ("org.neo4j.ogm.drivers.http.driver.HttpDriver")
                .setURI("http://neo4j:zeroual7@localhost:7474");
        return config;
    }

    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory(getConfiguration(), "com.zeros.domain");
    }
}
