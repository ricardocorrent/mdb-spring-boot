package com.ricardocorrent.mdbsb.brand

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BrandRepository : MongoRepository<Brand, UUID> {
    fun findByName(name: String) : Brand?
}