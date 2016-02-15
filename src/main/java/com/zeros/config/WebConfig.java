package com.zeros.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Abdellah on 15/02/2016.
 */
@EnableWebMvc
@ComponentScan("com.zeros.web")
public class WebConfig {
}
