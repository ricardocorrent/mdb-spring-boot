package com.ricardocorrent.mdbsb.model

import com.ricardocorrent.mdbsb.generics.GenericController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/models")
class ModelController(service: ModelService) : GenericController<Model>(service)
