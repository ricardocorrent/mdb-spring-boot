package com.ricardocorrent.mdbsb.lures

import org.springframework.stereotype.Service

@Service
class LuresService(
    private val repository: LuresRepository,
) {
    fun save(entity: Lures) = repository.save(entity)
}