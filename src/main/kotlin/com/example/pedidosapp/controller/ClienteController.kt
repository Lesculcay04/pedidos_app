package com.example.pedidosapp.controller

import com.example.pedidosapp.model.Cliente
import com.example.pedidosapp.service.ClienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cliente")   //endpoint
class ClienteController {
    @Autowired
    lateinit var clienteService: ClienteService

    @GetMapping
    fun list ():List <Cliente>{
        return clienteService.list()
    }

    @PostMapping
    fun save (@RequestBody cliente: Cliente): ResponseEntity<Cliente>{
        return ResponseEntity(clienteService.save(cliente), HttpStatus.OK )
    }

    @PutMapping
    fun update (@RequestBody cliente: Cliente):ResponseEntity<Cliente>{
        return ResponseEntity(clienteService.update(cliente), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody cliente: Cliente):ResponseEntity<Cliente>{
        return ResponseEntity(clienteService.updateName(cliente), HttpStatus.OK)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean? {
        return clienteService.delete(id)
    }

    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): ResponseEntity<*>{
        return ResponseEntity(clienteService.listById (id), HttpStatus.OK)

    }
}