package com.ricardocorrent.mdbsb.brand

import com.ricardocorrent.mdbsb.generics.GenericService
import org.springframework.stereotype.Service

@Service
class BrandService(
    private val repository: BrandRepository,
) : GenericService<Brand>(repository) {
    fun findByName(name: String) = repository.findByName(name)
}