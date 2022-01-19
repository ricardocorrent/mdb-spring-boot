package com.ricardocorrent.mdbsb.fish

import com.ricardocorrent.mdbsb.generics.GenericService
import org.springframework.stereotype.Service

@Service
class FishService(repository: FishRepository) : GenericService<Fish>(repository)