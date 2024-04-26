package com.pucpr.financemanagerapi.domain.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "documents")
data class Document(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long = 0,

  @Column(nullable = false)
  val name: String,

  @Column(nullable = false)
  val mimeType: String,

  @Column(nullable = false)
  val size: Long,
)