package service;

import model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class BookingService {

    @Autowired
    public BookingService(BookingMongoService bookingMongoService, BookingRelationalService bookingRelationalService) {
    }

    public List<Booking> getAllBookings() {
        // Lógica para obtener todas las reservas, puedes elegir usar MongoDB o la base de datos relacional aquí
        // Ejemplo usando MongoDB:
        // return bookingMongoService.getAllBookings();
        // Ejemplo usando la base de datos relacional:
        // return bookingRelationalService.getAllBookings();
        return null; // Actualiza según tu lógica
    }

    public Booking getBookingById(String id) {
        // Lógica para obtener una reserva por ID, puedes elegir usar MongoDB o la base de datos relacional aquí
        // Ejemplo usando MongoDB:
        // return bookingMongoService.getBookingById(id);
        // Ejemplo usando la base de datos relacional:
        // return bookingRelationalService.getBookingById(id);
        return null; // Actualiza según tu lógica
    }

    public Booking createBooking(Booking booking) {
        // Lógica para crear una reserva, puedes elegir usar MongoDB o la base de datos relacional aquí
        // Ejemplo usando MongoDB:
        // return bookingMongoService.createBooking(booking);
        // Ejemplo usando la base de datos relacional:
        // return bookingRelationalService.createBooking(booking);
        return null; // Actualiza según tu lógica
    }

    public Booking updateBooking(String id, Booking booking) {
        // Lógica para actualizar una reserva, puedes elegir usar MongoDB o la base de datos relacional aquí
        // Ejemplo usando MongoDB:
        // return bookingMongoService.updateBooking(id, booking);
        // Ejemplo usando la base de datos relacional:
        // return bookingRelationalService.updateBooking(id, booking);
        return null; // Actualiza según tu lógica
    }

    public void deleteBooking(String id) {
        // Lógica para eliminar una reserva, puedes elegir usar MongoDB o la base de datos relacional aquí
        // Ejemplo usando MongoDB:
        // bookingMongoService.deleteBooking(id);
        // Ejemplo usando la base de datos relacional:
        // bookingRelationalService.deleteBooking(id);
        // Actualiza según tu lógica
    }
}
