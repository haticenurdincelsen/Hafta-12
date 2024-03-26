package dev.patika.RestAPIGelistirme.mapper;


import dev.patika.RestAPIGelistirme.dto.request.BookBorrowingRequest;
import dev.patika.RestAPIGelistirme.dto.request.BookBorrowingUpdateRequest;
import dev.patika.RestAPIGelistirme.entity.BookBorrowing;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BookBorrowingMapper {

    BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest);

    BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest);

    void update(@MappingTarget BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest);
}
