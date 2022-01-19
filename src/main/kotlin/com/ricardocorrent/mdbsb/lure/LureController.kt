package com.ricardocorrent.mdbsb.lure

import com.ricardocorrent.mdbsb.generics.GenericController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lures")
class LureController(service: LureService) : GenericController<Lure>(service)