package repository;

import model.BookingRelational;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRelationalRepository extends JpaRepository<BookingRelational, Long> {
    // Métodos específicos para la base de datos relacional
}