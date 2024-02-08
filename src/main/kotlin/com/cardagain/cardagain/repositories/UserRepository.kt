package com.cardagain.cardagain.repositories

import com.cardagain.cardagain.models.database.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, String> {
}