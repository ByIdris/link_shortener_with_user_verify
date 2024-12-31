package com.krh.linkshortener.infrastructure.contracts;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krh.linkshortener.domain.entities.ShortUrl;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, UUID> {

}
