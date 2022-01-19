package com.ricardocorrent.mdbsb.generics

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

abstract class GenericController<T : GenericEntity>(
    private val service: GenericService<T>
) {

    @PostMapping
    fun create(@RequestBody payload: T): ResponseEntity<T> {
        return ResponseEntity.ok(service.persist(payload))
    }

    @PutMapping(
        path = ["/{id}"],
    )
    fun update(
        @PathVariable id: UUID,
        @RequestBody payload: T
    ): ResponseEntity<T> {
        payload.id = id
        return ResponseEntity.ok(service.persist(payload))
    }

    @GetMapping(
        path = ["/{id}"],
    )
    fun findById(@PathVariable id: UUID): ResponseEntity<T> {
        return ResponseEntity.ok(service.findById(id))
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<T>> {
        return ResponseEntity.ok(service.findAll())
    }

    @DeleteMapping(
        path = ["/{id}"],
    )
    fun deleteById(@PathVariable id: UUID): ResponseEntity<Unit> {
        service.deleteById(id)
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }

}