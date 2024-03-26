package dev.patika.RestAPIGelistirme.mapper;


import dev.patika.RestAPIGelistirme.dto.request.AuthorRequest;
import dev.patika.RestAPIGelistirme.dto.response.AuthorResponse;
import dev.patika.RestAPIGelistirme.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import java.util.List;

@Mapper
public interface AuthorMapper {
    Author asEntity(AuthorRequest authorRequest);

    AuthorResponse asOutput(Author author);

    List<AuthorResponse> asOutput(List<Author> author);

    void update(@MappingTarget Author entity, AuthorRequest request);
}
