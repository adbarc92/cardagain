package com.cardagain.cardagain.models.database

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.Instant
import java.util.*

@Entity
class WorkShift(
    @Id
    val id: String  = UUID.randomUUID().toString(),

    @ManyToOne
    val user: User,

    @Column
    val shiftStart: Instant,

    @Column
    val shiftEnd: Instant?,

    @Column
    val breakStart: Instant?,

    @Column
    val breakEnd: Instant?,
)