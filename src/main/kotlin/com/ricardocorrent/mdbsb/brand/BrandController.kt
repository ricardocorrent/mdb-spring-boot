package com.ricardocorrent.mdbsb.brand

import com.ricardocorrent.mdbsb.generics.GenericController
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping(
    path = ["/brands"],
    produces = [MediaType.APPLICATION_JSON_VALUE],
)
class BrandController(service: BrandService) : GenericController<Brand>(service)
