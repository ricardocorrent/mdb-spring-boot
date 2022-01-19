package com.ricardocorrent.mdbsb.fish

import com.ricardocorrent.mdbsb.generics.GenericController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fish")
class FishController(service: FishService) : GenericController<Fish>(service)