package repository;

import model.BookingMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingMongoRepository extends MongoRepository<BookingMongo, String> {
    // Métodos específicos para MongoDB
}
