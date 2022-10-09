package org.hrb.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@SpringBootApplication
@EnableScheduling
@Configuration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public TaskScheduler taskSchedular() {
		ThreadPoolTaskScheduler threadPoolTaskSchedular = new ThreadPoolTaskScheduler();
		threadPoolTaskSchedular.setPoolSize(10);
		threadPoolTaskSchedular.setThreadNamePrefix("ThreadPoolTaskScheduler");
		
		return threadPoolTaskSchedular;
	}

}
