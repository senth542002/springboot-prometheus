package com.app.monitoring.appmonitoring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class AppMonitoringConfig {
	
	// io.micrometer.core.aop.TimedAspect
	// org.springframework.context.annotation.Bean
	// io.micrometer.core.instrument.MeterRegistry

	@Bean
	public TimedAspect timedAspect(MeterRegistry registry) {
	    return new TimedAspect(registry);
	}

}
