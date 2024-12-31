package com.krh.linkshortener.infrastructure.contracts;

import java.util.UUID;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.krh.linkshortener.domain.entities.ShortUrl;

public interface ShortUrlRepository extends Repository<ShortUrl, UUID> {

}
