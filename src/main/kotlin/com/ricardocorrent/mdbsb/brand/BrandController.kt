package com.ricardocorrent.mdbsb.brand

import com.ricardocorrent.mdbsb.generics.GenericController
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
    path = ["/brands"],
    produces = [MediaType.APPLICATION_JSON_VALUE],
)
class BrandController(
    private val service: BrandService,
) : GenericController<Brand>(service) {

    @GetMapping(
        path = ["/name/{name}"]
    )
    fun getByEmail(@PathVariable name: String) = service.findByName(name)
}
