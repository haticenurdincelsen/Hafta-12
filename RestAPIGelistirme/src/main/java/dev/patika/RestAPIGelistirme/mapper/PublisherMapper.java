package dev.patika.RestAPIGelistirme.mapper;


import dev.patika.RestAPIGelistirme.dto.response.PublisherResponse;
import dev.patika.RestAPIGelistirme.entity.Publisher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PublisherMapper {
    PublisherResponse asOutput(Publisher publisher);

    List<PublisherResponse> asOutput(List<Publisher> publishers);
}
