package com.ricardocorrent.mdbsb.lures

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lure")
class LuresController(
    private val service: LuresService
) {

    @PostMapping
    fun save (@RequestBody payload: Lures): ResponseEntity<Lures> {
        return ResponseEntity.ok(service.save(payload))
    }
}