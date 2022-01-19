package com.ricardocorrent.mdbsb.model

import com.ricardocorrent.mdbsb.generics.GenericService
import org.springframework.stereotype.Service

@Service
class ModelService(repository: ModelRepository) : GenericService<Model>(repository)
