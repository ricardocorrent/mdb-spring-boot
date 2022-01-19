package com.ricardocorrent.mdbsb.lure

import com.ricardocorrent.mdbsb.generics.GenericService
import org.springframework.stereotype.Service

@Service
class LureService(repository: LureRepository) : GenericService<Lure>(repository)