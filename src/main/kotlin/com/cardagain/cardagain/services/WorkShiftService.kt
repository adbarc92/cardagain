package com.cardagain.cardagain.services

import com.cardagain.cardagain.models.database.User
import com.cardagain.cardagain.models.database.WorkShift
import com.cardagain.cardagain.repositories.WorkShiftRepository
import kotlin.jvm.Throws

class WorkShiftService(private val workShiftRepository: WorkShiftRepository) {
    fun startWorkShift() {
        // Confirm the user does not already have an active shift
        // Start the shift
    }
    fun endWorkShift() {
        // Confirm that the user does not have an active break or active lunch
        // End the shift
    }
    fun startBreak() {
        // Confirm that the user has an active shift
        // Alex: Confirm that the user is not on-lunch
        // Start the break
    }
    fun endBreak() {
        // Confirm that the user has an active shift
        // Alex: Confirm that the user is on-break
        // End the break
    }
    fun startLunch() {
        // Confirm that the user has an active shift
        // Alex: Confirm that the user is not on-break
        // Alex: Confirm that the user is on-break
        // Start the lunch
    }
    fun endLunch(){
        // Confirm that the user has an active shift
        // Alex: Confirm that the user is on-lunch
        // End the break
    }

    fun userHasActiveWorkShift(user: User): Boolean {
        // Get all shifts by user
        // that
        return workShiftRepository.findAllByUserAndShiftEndIsNull(user).isNotEmpty()
    }

    @Throws(IllegalStateException::class)
    fun getActiveWorkShiftForUser(user: User): WorkShift {
        val workShifts = workShiftRepository.findAllByUserAndShiftEndIsNull(user)
        if (workShifts.size > 1) {
            throw IllegalStateException("User has more than one active shift")
        }

        return workShifts.first()
    }
}