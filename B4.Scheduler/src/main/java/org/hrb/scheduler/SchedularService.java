package org.hrb.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedularService {
	
	Logger LOG = LoggerFactory.getLogger(SchedularService.class);
	
	// Schedule a job every 3 sec, using fixedRate
	@Scheduled(fixedRate = 3000)
	public void methodEvery3sec() {
		
		System.out.println("Schedular for 3 sec... ");
		LOG.info("Schedular for 3 sec... ");
		
	}
	
	// Schedule a job every 5 sec using crons.
	@Scheduled(cron = "0/5 * * * * *")
	public void methodEvery5Sec() {
		
		System.out.println("Schedular for 5 sec... ");
		LOG.info("Schedular for 5 sec... ");
		
	}
	
	// Schedule a job every 10 sec using crons provided in application.property file
	// cron.expression.value = 0/10 * * * * *
	@Scheduled(cron ="${cron.expression.value}")
	public void methodEvery10Sec() {
		
		System.out.println("Schedular for 10 sec... ");
		LOG.info("Schedular for 10 sec... ");
		
	}

}
