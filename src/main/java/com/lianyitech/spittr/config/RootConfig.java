package com.lianyitech.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by daniyyel on 8/20/16.
 */

@Configuration
@ComponentScan(basePackages = {"com.lianyitech.spittr"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
