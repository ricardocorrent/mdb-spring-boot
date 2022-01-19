package com.ricardocorrent.mdbsb.generics

import com.ricardocorrent.mdbsb.exception.NotFoundException
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

abstract class GenericService<T>(
    private val repository: MongoRepository<T, UUID>
) {

    fun persist(t: T) =
        repository.save(t)

    fun findById(id: UUID): T =
        repository.findById(id)
            .orElseThrow { NotFoundException() }

    fun findAll(): MutableList<T> =
        repository.findAll()

    fun deleteById(id: UUID) =
        repository.existsById(id)
            .takeIf { it }
            ?.let { repository.deleteById(id) }
            ?: NotFoundException()

}