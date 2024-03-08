package service;

import model.BookingRelational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.BookingRelationalRepository;

import java.util.List;

@Service
@Component
public class BookingRelationalService {

    private final BookingRelationalRepository bookingRelationalRepository;

    @Autowired
    public BookingRelationalService(BookingRelationalRepository bookingRelationalRepository) {
        this.bookingRelationalRepository = bookingRelationalRepository;
    }

    public List<BookingRelational> getAllBookings() {
        return bookingRelationalRepository.findAll();
    }

    public BookingRelational getBookingById(Long id) {
        return bookingRelationalRepository.findById(id).orElse(null);
    }

    public BookingRelational createBooking(BookingRelational booking) {
        return bookingRelationalRepository.save(booking);
    }

    public BookingRelational updateBooking(Long id, BookingRelational booking) {
        if (bookingRelationalRepository.existsById(id)) {
            return bookingRelationalRepository.save(booking);
        } else {
            return null; // Manejo de error
        }
    }

    public void deleteBooking(Long id) {
        bookingRelationalRepository.deleteById(id);
    }
}
