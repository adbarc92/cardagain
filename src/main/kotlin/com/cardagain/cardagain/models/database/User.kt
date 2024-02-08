package com.cardagain.cardagain.models.database

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "cardagain_user")
class User(
    @Id
    val id: String = UUID.randomUUID().toString(),

//    @Column
//    val pwSalt: String,
//
//    @Column
//    val saltedPassword: String,

    @Column
    val name: String? = null,

    @Column
    val isAdmin: Boolean = false,
)