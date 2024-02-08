package com.cardagain.cardagain.repositories

import com.cardagain.cardagain.models.database.WorkShift
import org.springframework.data.jpa.repository.JpaRepository

interface WorkShiftRepository: JpaRepository<WorkShift, String> {
}