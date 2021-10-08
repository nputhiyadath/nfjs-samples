package habuma;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ItinerarySchedulerSinkApplication {
	
	private static Logger log = LoggerFactory.getLogger(ItinerarySchedulerSinkApplication.class); 

	public static void main(String[] args) {
		SpringApplication.run(ItinerarySchedulerSinkApplication.class, args);
	}
	
	@Bean
	public Consumer<Itinerary> scheduleItinerary() {
		return itinerary -> {
			log.info("SCHEDULING ITINERARY:  " + itinerary);
		};
	}

}
