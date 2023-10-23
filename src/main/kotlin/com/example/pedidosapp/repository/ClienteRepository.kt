package com.example.pedidosapp.repository

import com.example.pedidosapp.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository : JpaRepository<Cliente, Long?> {
    fun findById (id: Long?): Cliente?

}
