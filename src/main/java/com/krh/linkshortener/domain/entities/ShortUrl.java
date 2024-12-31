package com.krh.linkshortener.domain.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShortUrl {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String originalUrl;
  private String shortUrl;
  @JoinColumn(nullable = false)
  private User user;
  @CreatedBy
  @Column(nullable = false, updatable = false)
  private UUID createdBy;
  @CreatedDate
  @Column(nullable = false, updatable = false)
  private LocalDateTime createdAt;
  @LastModifiedBy
  private UUID lastModifiedBy;
  @LastModifiedDate
  private LocalDateTime lastModifiedAt;
}
