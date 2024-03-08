package service;

import model.BookingMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.BookingMongoRepository;

import java.util.List;

@Service
@Component
public class BookingMongoService {

    private final BookingMongoRepository bookingMongoRepository;

    @Autowired
    public BookingMongoService(BookingMongoRepository bookingMongoRepository) {
        this.bookingMongoRepository = bookingMongoRepository;
    }

    public List<BookingMongo> getAllBookings() {
        return bookingMongoRepository.findAll();
    }

    public BookingMongo getBookingById(String id) {
        return bookingMongoRepository.findById(id).orElse(null);
    }

    public BookingMongo createBooking(BookingMongo booking) {
        return bookingMongoRepository.save(booking);
    }

    public BookingMongo updateBooking(String id, BookingMongo booking) {
        if (bookingMongoRepository.existsById(id)) {
            return bookingMongoRepository.save(booking);
        } else {
            return null; // Manejo de error, por ejemplo, puedes lanzar una excepción.
        }
    }

    public void deleteBooking(String id) {
        bookingMongoRepository.deleteById(id);
    }
}
