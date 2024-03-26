package dev.patika.RestAPIGelistirme.repository;
import dev.patika.RestAPIGelistirme.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BookBorrowingRepository extends JpaRepository<BookBorrowing,Long> {
}
