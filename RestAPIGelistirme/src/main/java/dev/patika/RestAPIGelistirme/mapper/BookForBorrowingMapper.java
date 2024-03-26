package dev.patika.RestAPIGelistirme.mapper;


import dev.patika.RestAPIGelistirme.dto.request.BookForBorrowingRequest;
import dev.patika.RestAPIGelistirme.entity.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookForBorrowingMapper {

    Book asEntity(BookForBorrowingRequest bookForBorrowingRequest);
}
