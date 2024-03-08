package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.BookingMongoService;
import service.BookingRelationalService;
import service.BookingService;

@Configuration
public class AppConfig {

    @Bean
    public BookingService bookingService(BookingMongoService bookingMongoService, BookingRelationalService bookingRelationalService) {
        return new BookingService(bookingMongoService, bookingRelationalService);
    }
}
